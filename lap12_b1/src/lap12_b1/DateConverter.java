/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap12_b1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Manh Nguyen
 */
public class DateConverter {
    static SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy"); 
	public static Date fromString(String d)
	{
		try
		{
			Date date=sdf.parse(d);
			return date;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return null;
	}
	public static String fromDate(Date d)
	{
		return sdf.format(d);
	}
}
