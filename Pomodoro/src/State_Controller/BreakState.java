package State_Controller;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BreakState extends StateActivity {

	public BreakState() {
		// TODO Auto-generated constructor stub
	}

	// show current state
	@Override
	public void DotState(int state, JLabel State1, JLabel State2, JLabel State3, JLabel State4) {
		if (state == 1) {
			State1.setIcon(new ImageIcon("res/filled_dot.png"));
		}

		if (state == 2) {
			State1.setIcon(new ImageIcon("res/filled_dot.png"));
			State2.setIcon(new ImageIcon("res/filled_dot.png"));
		}

		if (state == 3) {
			State1.setIcon(new ImageIcon("res/filled_dot.png"));
			State2.setIcon(new ImageIcon("res/filled_dot.png"));
			State3.setIcon(new ImageIcon("res/filled_dot.png"));
		}
	}

}
