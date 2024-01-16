package genericutility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/**
 * 
 * @author Anupama A R
 */
public class JavaUtility 
{
	/**
	 * this method is to generate random number
	 * @return
	 */
	public int generateRandomNumber()
	{
		Random r = new Random();
		int number = r.nextInt(10000);
		return number;
		
	}
	/**
	 * this is for calendar handling operation
	 * @return
	 */
	public String calanderHandling()
	{
		Calendar cal = Calendar.getInstance();
		Date d = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
		String date = sdf.format(d);
		return date;
	}
}
