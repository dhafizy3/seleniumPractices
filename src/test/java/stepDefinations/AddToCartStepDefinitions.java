package stepDefinations;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObjectModel.AddToCartPageObject;
import pageObjectModel.DesktopsPageObject;
import utilities.UtilityClass;

public class AddToCartStepDefinitions extends Base {
	
	AddToCartPageObject addToCart = new AddToCartPageObject();
	DesktopsPageObject des1 = new DesktopsPageObject();
	
	
	@Given("^User is on website$")
	public void user_is_on_Retail_website() {
		String actualPageTitile = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		Assert.assertEquals(expectedPageTitle, actualPageTitile);
		logger.info("Actual Title is matching with expected title");
		UtilityClass.takeScreenShot();
	}
	
	@When("^User click on Desktops$")
	public void user_clicks_on_Desktops_tab() {
		des1.clickOnDesktops();
		logger.info("user clicked on Desktops");
	}
	@And("^User clicks on Show all$")
	public void user_clicks_on_show_all_desktops() {
		des1.clickOnShowAllDesktops();
		logger.info("user clicked on show all desktops");
	}
	
	@And("^User click  ADD TO CART option on ‘HP LP3065’ item$")
	public void user_click_on_add_to_cart() {
		addToCart.addToCartHPCom();
		logger.info("user clicked on add to cart");
	}
	
	@And("^User select quantity 1$")
	public void user_selects_quantity_1() {
		addToCart.addQuantity();
		logger.info("user entered the quantity");
		
	}
	@And("^User click add to Cart button$")
	public void user_clicks_on_add_to_cart_button() {
		addToCart.clickOnAddToCart();
		logger.info("user clicked on add to card button");
	}
	@Then("^User should see a message 'Success: you have added HP LP 3065 to your Shopping cart!'$")
	public void user_should_see_the_message() {
		Assert.assertTrue(addToCart.successTextIsDisplayed());
		logger.info("user saw the success message");
		UtilityClass.takeScreenShot();
	
	}

}
