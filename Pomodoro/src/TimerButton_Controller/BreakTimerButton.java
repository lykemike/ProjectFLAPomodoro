package TimerButton_Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import CSV_Controller.WriteBreakCSV;
import View.Work;

public class BreakTimerButton extends JFrame {
	boolean clicked = false;
	int state;
	int second = 0;
	int minute = 5;
	String fSecond, fMinute;

	JLabel Time;
	JButton PlayPause, Skip;

	Timer countDown;
	DecimalFormat dFormat = new DecimalFormat("00");

	public BreakTimerButton(JButton PlayPause, JButton Skip, JLabel Time, int state) {
		this.PlayPause = PlayPause;
		this.Skip = Skip;
		this.Time = Time;
		this.state = state;
		startBreak();
		skipBtn();
		BreakPPB();
	}

	private void startBreak() {
		countDown = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				second--;
				fSecond = dFormat.format(second);
				fMinute = dFormat.format(minute);
				Time.setText(fMinute + ":" + fSecond);

				if (second == -1) {
					second = 59;
					minute--;

					fSecond = dFormat.format(second);
					fMinute = dFormat.format(minute);
					Time.setText(fMinute + ":" + second);
				}

				if (minute == 0 && second == 0) {
					countDown.stop();
					state++;

					new WriteBreakCSV().writeFile();
					new Work(state).WConfig();
					SwingUtilities.windowForComponent(PlayPause).setVisible(false);
				}
			}
		});
		countDown.start();
	}

	private void skipBtn() {
		Skip.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				countDown.stop();
				state++;

				new WriteBreakCSV().writeFile();
				new Work(state).WConfig();
				SwingUtilities.windowForComponent(PlayPause).setVisible(false);
			}
		});
	}

	public void BreakPPB() {
		PlayPause.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (clicked) {
					PlayPause.setIcon(new ImageIcon("res/pause.png"));
					clicked = false;

					startBreak();
				} else {
					PlayPause.setIcon(new ImageIcon("res/play.png"));
					clicked = true;

					countDown.stop();
				}
			}
		});
	}
}
