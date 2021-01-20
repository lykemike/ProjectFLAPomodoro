package View;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class LongBreak extends ViewCore {
	private JLabel Time, State1, State2, State3, State4;
	private JButton PlayPause, Stats, Skip;
	int state;

	public LongBreak(int state) {
		super(state);
		this.width = 430;
		this.height = 265;
		this.state = state;
	}

	@Override
	public void initialize(int state) {
		// show time
		Time = new JLabel("15:00");
		Time.setFont(new Font("Lato", Font.PLAIN, 59));
		Time.setBounds(133, 30, 158, 63);
		getContentPane().add(Time);

		// show pause and resume button
		PlayPause = new JButton();
		PlayPause.setIcon(new ImageIcon("res/pause.png"));
		PlayPause.setBounds(143, 113, 63, 27);
		PlayPause.setBorderPainted(false);
		PlayPause.setContentAreaFilled(false);
		PlayPause.setFocusPainted(false);
		PlayPause.setOpaque(false);
		getContentPane().add(PlayPause);

		
		Stats = new JButton("view Stats");
		Stats.setFont(new Font("Tahoma", Font.BOLD, 15));
		Stats.setBounds(300, 188, 124, 25);
		Stats.setBorderPainted(false);
		Stats.setContentAreaFilled(false);
		Stats.setFocusPainted(false);
		Stats.setOpaque(false);
		getContentPane().add(Stats);

		Skip = new JButton();
		Skip.setIcon(new ImageIcon("res/skip.png"));
		Skip.setBounds(197, 115, 80, 25);
		Skip.setBorderPainted(false);
		Skip.setContentAreaFilled(false);
		Skip.setFocusPainted(false);
		Skip.setOpaque(false);
		getContentPane().add(Skip);

		State1 = new JLabel();
		State1.setIcon(new ImageIcon("res/filled_dot.png"));
		State1.setBounds(155, 167, 18, 16);
		getContentPane().add(State1);

		State2 = new JLabel();
		State2.setIcon(new ImageIcon("res/filled_dot.png"));
		State2.setBounds(191, 167, 18, 16);
		getContentPane().add(State2);

		State3 = new JLabel();
		State3.setIcon(new ImageIcon("res/filled_dot.png"));
		State3.setBounds(222, 167, 18, 16);
		getContentPane().add(State3);

		State4 = new JLabel();
		State4.setIcon(new ImageIcon("res/filled_dot.png"));
		State4.setBounds(252, 167, 18, 16);
		getContentPane().add(State4);
	}

}
