import java.util.*;
import java.util.text.*;
class DateFormatChange{
	public static void main(String args[]){
		Date d = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("dd,MM,yyyy");
		System.out.println("%td/%tB/%<tY", "Date:", + ft.format(d));
	}
}