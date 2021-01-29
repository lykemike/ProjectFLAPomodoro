package Stat_Controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import CSV_Controller.FindLast;

public class UpdateStats {
	private ArrayList<String> dayValArr;
	private int[] dayVal;
	
	Date todayDay = new Date();
	SimpleDateFormat dayName = new SimpleDateFormat("EEEE");

	public UpdateStats() {
		// TODO Auto-generated constructor stub
	}

	public int[] updateDayVal() {
		FindLast fl = new FindLast();
		dayValArr = fl.found();
		dayVal = new int[7];
		
		for (String dv : dayValArr) {
			if (dayName.format(todayDay).equals("Monday")) {
				dayVal[6]++;
			}else if (dayName.format(todayDay).equals("Tuesday")) {
				dayVal[0]++;
			}else if (dayName.format(todayDay).equals("Wednesday")) {
				dayVal[1]++;
			}else if (dayName.format(todayDay).equals("Thursday")) {
				dayVal[2]++;
			}else if (dayName.format(todayDay).equals("Friday")) {
				dayVal[3]++;
			}else if (dayName.format(todayDay).equals("Saturday")) {
				dayVal[4]++;
			}else if (dayName.format(todayDay).equals("Sunday")) {
				dayVal[5]++;
			}
		}
		
		return dayVal;
	}
}
