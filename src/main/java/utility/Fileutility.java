package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Fileutility {
	public String readfiledata(String key) throws Throwable {
		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\data.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
	public void writedataintofile(String key,String value) throws IOException {
		FileInputStream fis = new FileInputStream("/com_Qapitol/src/test/resources/config");
		Properties p = new Properties();
		p.load(fis);
		p.setProperty(key, value);
		FileOutputStream fos = new FileOutputStream("/com_Qapitol/src/test/resources/config");
		p.store(fos, value);
	}
}
