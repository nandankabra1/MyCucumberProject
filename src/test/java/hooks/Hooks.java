package hooks;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import testbase.TestBase;

public class Hooks extends TestBase {
	
	

    @Before
    public void setUp() {
    	driver=initialize();
		driver.get(configfile.geturl());
    }

    @After
    public void tearDown() {
    	if (driver != null) {
			driver.quit();
    }
}
}
