package stepDefinations;

import org.junit.Assert;
import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.DesktopsPageObject;
import utilities.UtilityClass;
public class DesktopItemStepDef extends Base {

	DesktopsPageObject des = new DesktopsPageObject();
	
	@Given("^User is on Retail website$")
	public void user_is_on_Retail_website() {
		String actualPageTitile = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		// Assertion is to verify actual meets the expected
		// if actual does not equals to expected value then execution will stop
		// and test step will fail.
		Assert.assertEquals(expectedPageTitle, actualPageTitile);
		logger.info("Actual Title is matching with expected title");
		UtilityClass.takeScreenShot();
	}
	
	@When("^User clicks on Desktops tab$")
	public void user_clicks_on_Desktops_tab() {
		des.clickOnDesktops();
		logger.info("user clicked on Desktops");
	}
	
	@And("^User click on show all desktops$")
	public void user_clicks_on_show_all_desktops() {
		des.clickOnShowAllDesktops();
		logger.info("user clicked on show all desktops");
	}
	
	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items() {
		Assert.assertTrue(des.desktopTextIsDisplayed());
		logger.info("user saw all the desktops");
	}

}
