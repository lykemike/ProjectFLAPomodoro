package CSV_Controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteLBreakCSV extends FileFormat {

	public WriteLBreakCSV() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeFile() {
		File file = new File("log.csv");

		try {
			FileWriter fw = new FileWriter(file, true);
			PrintWriter pw = new PrintWriter(fw);

			// write long break done
			pw.println(format() + ", Long Break Done!");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
