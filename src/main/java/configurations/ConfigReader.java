package configurations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	public Properties properties;
	
	public ConfigReader() {
		
		properties = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("src/main/java/configurations/config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public String geturl()
	{
		return properties.getProperty("url");
	}
	
	public String getbrowser()
	{
		return properties.getProperty("browser");
	}

}
