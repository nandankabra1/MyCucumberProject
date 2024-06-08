package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	

    public WebDriver initialize() {
        

    	return new ChromeDriver();
        
        
    }
    
    
    

    public void tearDown(WebDriver driver) {
        if (driver != null) {
            driver.quit();
        }
    }
}
