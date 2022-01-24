package NewAssignments;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String[]args) {
		Date date =new Date();
		SimpleDateFormat sdfmt = new SimpleDateFormat("E YYYY:MM:dd 'at' hh:mm:ss a zzz");
		System.out.println("Current Date ="+sdfmt.format(date));
		
	}
}
