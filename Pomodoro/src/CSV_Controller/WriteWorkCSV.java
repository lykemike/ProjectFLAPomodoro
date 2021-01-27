package CSV_Controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteWorkCSV extends FileFormat {

	public WriteWorkCSV() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void writeFile() {
		File file = new File("log.csv");

		try {
			FileWriter fw = new FileWriter(file, true);
			PrintWriter pw = new PrintWriter(fw);

			// print work done
			pw.println(format() + ", Work Done!");
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
