package TimerButton_Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import CSV_Controller.WriteLBreakCSV;
import View.Work;

public class LBreakTimerButton {
	boolean clicked = false;
	int state;
	int second = 0;
	int minute = 15;
	String fSecond, fMinute;

	JLabel Time;
	JButton PlayPause, Skip;

	Timer countDown;
	DecimalFormat dFormat = new DecimalFormat("00");

	public LBreakTimerButton(JButton PlayPause, JButton Skip, JLabel Time, int state) {
		this.PlayPause = PlayPause;
		this.Skip = Skip;
		this.Time = Time;
		this.state = state;
		startLBreak();
		skipBtn();
		LBreakPPB();
	}

	private void startLBreak() {
		countDown = new Timer(1, new ActionListener() {

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
					state = 1;

					new WriteLBreakCSV().writeFile();
					Work work = new Work(state);
					work.WConfig();

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
				state = 1;

				new WriteLBreakCSV().writeFile();
				new Work(state).WConfig();
				SwingUtilities.windowForComponent(PlayPause).setVisible(false);
			}
		});
	}

	public void LBreakPPB() {
		PlayPause.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				if (clicked) {
					PlayPause.setIcon(new ImageIcon("res/pause.png"));
					clicked = false;

					startLBreak();
				} else {
					PlayPause.setIcon(new ImageIcon("res/play.png"));
					clicked = true;

					countDown.stop();
				}
			}
		});
	}
}
