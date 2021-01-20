package View;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public abstract class ViewCore extends JFrame {
	protected int width, height;

	public ViewCore(int state) {
		initialize(state);
	}

	public void BConfig() {
		setLocationRelativeTo(null);
		setResizable(false);
		setSize(new Dimension(width, height));
		getContentPane().setBackground(new Color(0, 153, 153));
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setIconImage(new ImageIcon("res/tomato.png").getImage());
		setTitle("Pomodoro");
	}

	public void LBConfig() {
		setLocationRelativeTo(null);
		setResizable(false);
		setSize(new Dimension(width, height));
		getContentPane().setBackground(new Color(255, 153, 102));
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setIconImage(new ImageIcon("res/tomato.png").getImage());
		setTitle("Pomodoro");
	}

	public void WConfig() {
		setLocationRelativeTo(null);
		setResizable(false);
		setSize(new Dimension(width, height));
		getContentPane().setBackground(new Color(255, 153, 0));
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setIconImage(new ImageIcon("res/tomato.png").getImage());
		setTitle("Pomodoro");
	}

	public abstract void initialize(int state);
}
