package View;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Work extends ViewCore {
	private JLabel Time, State1, State2, State3, State4;
	private JButton PlayPause, Stats;

	int state;
	boolean clicked = true;

	public Work(int state) {
		super(state);
		this.width = 430;
		this.height = 265;
		this.state = state;
	}

	@Override
	public void initialize(int state) {

		// show time
		Time = new JLabel("25:00");
		Time.setFont(new Font("Lato", Font.PLAIN, 59));
		Time.setBounds(133, 30, 158, 63);
		getContentPane().add(Time);

		// show pause and resume button
		PlayPause = new JButton();
		PlayPause.setIcon(new ImageIcon("res/play.png"));
		PlayPause.setBounds(163, 112, 97, 27);
		PlayPause.setBorderPainted(false);
		PlayPause.setContentAreaFilled(false);
		PlayPause.setFocusPainted(false);
		PlayPause.setOpaque(false);
		getContentPane().add(PlayPause);

		// view stats button
		Stats = new JButton("view stats");
		Stats.setFont(new Font("Tahoma", Font.BOLD, 15));
		Stats.setBounds(300, 188, 124, 25);
		Stats.setBorderPainted(false);
		Stats.setContentAreaFilled(false);
		Stats.setFocusPainted(false);
		Stats.setOpaque(false);
		getContentPane().add(Stats);

		// state dot 1
		State1 = new JLabel();
		State1.setIcon(new ImageIcon("res/outline_dot.png"));
		State1.setBounds(155, 167, 18, 16);
		getContentPane().add(State1);

		// state dot 2
		State2 = new JLabel();
		State2.setIcon(new ImageIcon("res/outline_dot.png"));
		State2.setBounds(191, 167, 18, 16);
		getContentPane().add(State2);

		// state dot 3
		State3 = new JLabel();
		State3.setIcon(new ImageIcon("res/outline_dot.png"));
		State3.setBounds(222, 167, 18, 16);
		getContentPane().add(State3);

		// state dot 4
		State4 = new JLabel();
		State4.setIcon(new ImageIcon("res/outline_dot.png"));
		State4.setBounds(252, 167, 18, 16);
		getContentPane().add(State4);

	}
}
