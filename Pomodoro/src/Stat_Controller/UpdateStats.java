package Stat_Controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import CSV_Controller.FindWorkReader;

public class UpdateStats {
	private ArrayList<String> dayValArr;
	private int[] dayVal;

	public UpdateStats() {
		// TODO Auto-generated constructor stub
	}

	public int[] updateDayVal() {
		FindWorkReader fl = new FindWorkReader();
		dayValArr = fl.found();
		dayVal = new int[7];
		
		for (String dv : dayValArr) {
			if (dv.equals("Monday")) {
				dayVal[6]++;
			}else if (dv.equals("Tuesday")) {
				dayVal[0]++;
			}else if (dv.equals("Wednesday")) {
				dayVal[1]++;
			}else if (dv.equals("Thursday")) {
				dayVal[2]++;
			}else if (dv.equals("Friday")) {
				dayVal[3]++;
			}else if (dv.equals("Saturday")) {
				dayVal[4]++;
			}else if (dv.equals("Sunday")) {
				dayVal[5]++;
			}
		}	
		return dayVal;
	}
}
