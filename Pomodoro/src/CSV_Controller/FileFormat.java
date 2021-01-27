package CSV_Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class FileFormat {
	private String time;

	public FileFormat() {
		// TODO Auto-generated constructor stub
	}

	public String format() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ssX");
		Date date = new Date();

		return time = dateFormat.format(date);
	}

	public abstract void writeFile();
}
