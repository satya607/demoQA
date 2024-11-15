package utility;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class javautil {
	public int getrandomNo() {
		Random rd=new Random();
		int random=rd.nextInt(500);
		return random;
	}
	  public String getsystemdate() {
		  Date dt=new Date(0, 0, 0);
		  String date=dt.toString();
		  return date;
	  }
	   public String getsystemdateinFormat() {
		   SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;
			   Date dt=new Date(0, 0, 0);
			   String sysdateformat=dateformat.format(dt);
			   return sysdateformat;
		   
	   }
}
