package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import testbase.TestBase;

public class LandingPage extends TestBase{
	
    private WebDriver driver;


    @FindBy(xpath = "//*[@id=\"termsfeed-com---nb\"]/div/div[3]/button[1]")
	private WebElement CookiesOK;


	@FindBy(xpath = "//a[@id='btn_takeout']")
	private WebElement TakeOut;
	
	
	   public LandingPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this); // Initialize elements using PageFactory
	    }
	

	public void click_on_TakeOut() {
		
		TakeOut.click();
		
	}

	
	public void click_on_CookiesOK() {
		CookiesOK.click();
	}

	public void dineinorder() {
		WebElement Dinein = driver.findElement(By.id("btn_eatin"));
		Dinein.click();
	}

	@FindBy(id = "pills-delivery-tab")
	private WebElement Delivery;

	public void click_on_Delivery() {
		Delivery.click();
	}

	@FindBy(xpath = "//*[@id=\"page-content-wrapper\"]/div[1]/div[1]/div[3]/h6/a")
	private WebElement signin;

	public void click_on_signin() {
		signin.click();
	}

	@FindBy(xpath = "//*[@id=\"loginModal\"]/div/div/div[2]/form/div[1]/a[1]")
	private WebElement signinfblandingpage;

	public void click_on_signinfblandingpage() {
		signinfblandingpage.click();
	}

	public void EnterAddress() throws InterruptedException {
		WebElement address = driver.findElement(By.id("address"));
		address.click();
		address.sendKeys("101 Howard Street, San Francisco, CA,");
		Actions act = new Actions(driver);
		act.moveToElement(address).sendKeys("USA").build().perform();
		Thread.sleep(1000);
		act.sendKeys(Keys.ARROW_DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();

	}


	public void clickdeliveryInstructions() {
		driver.findElement(By.id("btnupdateAddress")).click();
	}

	
	
	

}
