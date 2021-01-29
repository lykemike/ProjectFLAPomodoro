package TimerButton_Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

import CSV_Controller.WriteWorkCSV;
import View.Break;
import View.LongBreak;

public class WorkTimerButton implements ActionListener {
	boolean clicked = true;
	int state;
	int second = 0;
	int minute = 25;
	String fSecond, fMinute;

	JLabel Time;
	JButton PlayPause;

	Timer countDown;
	DecimalFormat dFormat = new DecimalFormat("00");

	public WorkTimerButton(JButton PlayPause, JLabel Time, int state) {
		this.PlayPause = PlayPause;
		this.Time = Time;
		this.state = state;
		PlayPause.addActionListener(this);
	}

	public void startWork() {
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

					if (state == 4) {
						LongBreak lBreak = new LongBreak(state);
						lBreak.LBConfig();

						SwingUtilities.windowForComponent(PlayPause).setVisible(false);
					} else {
						new WriteWorkCSV().writeFile();
						new Break(state).BConfig();

						SwingUtilities.windowForComponent(PlayPause).setVisible(false);
					}
				}
			}
		});
		countDown.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (clicked) {
			PlayPause.setIcon(new ImageIcon("res/pause.png"));
			clicked = false;

			startWork();
		} else {
			PlayPause.setIcon(new ImageIcon("res/play.png"));
			clicked = true;

			countDown.stop();
		}
	}
}
