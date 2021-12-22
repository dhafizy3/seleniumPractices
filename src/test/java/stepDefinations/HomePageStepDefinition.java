package stepDefinations;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.HomePageObject;
import utilities.UtilityClass;

import org.junit.Assert;;

public class HomePageStepDefinition extends Base {
	
	HomePageObject home = new HomePageObject();
	
	@Given("User is on Retail website for Currency")
	public void user_is_on_Retail_website_for_currency() {
		String expectedText = "TEK SCHOOL";
		String actualText = driver.getTitle();
		Assert.assertEquals(expectedText, actualText);
		logger.info("expected and actual are the same");
		
	}
	
	@When("User click on Currency")
	public void user_click_on_currency() {
		home.changeCurrency();
		logger.info("user clicked on currency button");
		
	}
	@And("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		home.getEuro();
		logger.info("user choose on euro currency");

	}
	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {

		Assert.assertTrue(home.euroLogoIsDisplayed());
		logger.info("user saw the euro logo");
		UtilityClass.takeScreenShot();
	}
	
	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() {

		home.clickOnShoppingCart();
		logger.info("user clicked on shopping cart");
	}
	@Then("“Your shopping cart is empty!” message should display")
	public void your_shopping_cart_is_empty_message_should_display() {

		Assert.assertTrue(home.emptyMessageIsDisplayed());
		logger.info("user saw the empty message for cart");
		UtilityClass.takeScreenShot();
	}



}
