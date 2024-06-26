package StepDefinations;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;
import pages.LandingPage;
import testbase.TestBase;



public class TakeoutOrder extends TestBase {

	private WebDriver driver;
	private LandingPage lp;
	private static final Logger logger = LogManager.getLogger(TakeoutOrder.class.getName());



	public TakeoutOrder() {
		this.driver = TestBase.driver;
		this.lp = new LandingPage(driver);
	}

	@Given("User is on the landing page")
	public void user_is_on_orderapp_landing_page() {
		System.out.println("The user is on the website");
		logger.info("LOGS: The user has landed on the landing page");

	}

	@When("User selected takeout order type")
	public void user_selects_takeout_order_type() throws InterruptedException {
		lp.click_on_CookiesOK();
		lp.click_on_TakeOut();
		Thread.sleep(5000);
	}

	@Then("User should be landed on the index page")
	public void User_lands_on_Index_page() {
		System.out.println("User is landed on the index page");

	}

	@When("Selects Order Time as ASAP")
	public void selects_order_time_as_asap() {

	}

	@When("Selects Order Time")
	public void selects_order_time() {

	}

	@When("Selects product")
	public void selects_product() {

	}

	@When("Add to cart")
	public void add_to_cart() {

	}

	@When("Clicks checkout with login as guest")
	public void clicks_checkout_with_login_as_guest() {

	}

	@When("Enters the details")
	public void enters_the_details() {

	}

	@When("Enters the payement details")
	public void enters_the_payement_details() {

	}

	@Then("The Order should be placed successfully")
	public void the_order_should_be_placed_successfully() {

	}

}
