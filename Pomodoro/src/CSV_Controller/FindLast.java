package CSV_Controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FindLast {
	ArrayList<String> dayValArr = new ArrayList<String>();

	public FindLast() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> found() {
		String line = "";
		
		try {
			SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
			BufferedReader br = new BufferedReader(new FileReader("log.csv"));
			
			while((line = br.readLine()) != null) {
				
				if(line.contains("Long Break")) {
					Date todayDay = new Date();
					
					if(line.contains(dateFormatter.format(todayDay))){
						dayValArr.add(line);
					}
				}
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dayValArr;
	}
}
