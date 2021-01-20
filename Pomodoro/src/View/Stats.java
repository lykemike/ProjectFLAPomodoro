package View;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

public class Stats extends JFrame {
	private JLabel tues, wed, thur, fri, sat, sun, mon;
	private JLabel y1, y2, y3, y4, y5, y6, y7;
	
	public Stats() {
		initialize();
	}

	public void initialize() {
		config();
		
		tues = new JLabel("Tuesday");
		getContentPane().add(tues, "cell 0 0");
		
		wed = new JLabel("Wednesday");
		getContentPane().add(wed, "cell 2 0");
		
		thur = new JLabel("Thursday");
		getContentPane().add(thur, "cell 4 0");
		
		fri = new JLabel("Friday");
		getContentPane().add(fri, "cell 6 0");
		
		sat = new JLabel("Saturday");
		getContentPane().add(sat, "cell 8 0");
		
		sun = new JLabel("Sunday");
		getContentPane().add(sun, "cell 10 0");
		
		mon = new JLabel("Monday");
		getContentPane().add(mon, "cell 12 0");
		
		y1 = new JLabel("0");
		getContentPane().add(y1, "cell 0 1");
		
		y2 = new JLabel("0");
		getContentPane().add(y2, "cell 2 1");
		
		y3 = new JLabel("0");
		getContentPane().add(y3, "cell 4 1");
		
		y4 = new JLabel("0");
		getContentPane().add(y4, "cell 6 1");
		
		y5 = new JLabel("0");
		getContentPane().add(y5, "cell 8 1");
		
		y6 = new JLabel("0");
		getContentPane().add(y6, "cell 10 1");
		
		y7 = new JLabel("0");
		getContentPane().add(y7, "cell 12 1");
	}
	
	private void config() {
		setLocationRelativeTo(null);
		setResizable(false);
		setSize(new Dimension(450, 119));
		setIconImage(new ImageIcon("res/tomato.png").getImage());
		setTitle("Pomodoro");
		getContentPane().setLayout(new MigLayout("", "[][][][][][][][][][][][][]", "[][]"));
	}
}
