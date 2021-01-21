package Stat_Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import View.Stats;

public class StatButton implements ActionListener{

	public StatButton(JButton Stats) {
		Stats.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Stats().setVisible(true);
	}

}
