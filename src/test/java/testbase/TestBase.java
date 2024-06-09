package testbase;

import org.openqa.selenium.WebDriver;
import configurations.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestBase {

	public ConfigReader configfile = new ConfigReader();
	public static WebDriver driver;

	public WebDriver initialize() {

		if (configfile.getbrowser().equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		if (configfile.getbrowser().equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		if (configfile.getbrowser().equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}

		return driver;

	}

}
