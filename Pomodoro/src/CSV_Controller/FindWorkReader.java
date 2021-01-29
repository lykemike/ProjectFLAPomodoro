package CSV_Controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class FindWorkReader {
	ArrayList<String> dayValArr = new ArrayList<String>();

	public FindWorkReader() {
		// TODO Auto-generated constructor stub
	}

	public ArrayList<String> found() {
		String line, SParsedLine;
		Date parsedLine;
		
		try {
			SimpleDateFormat dayName = new SimpleDateFormat("EEEE");
			BufferedReader br = new BufferedReader(new FileReader("log.csv"));
			
			while((line = br.readLine()) != null) {
				
				if(line.contains("Work")) {
					parsedLine = new SimpleDateFormat("yyyy-MM-dd").parse(line);
					SParsedLine = dayName.format(parsedLine);
					dayValArr.add(SParsedLine);
				}
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dayValArr;
	}
}
