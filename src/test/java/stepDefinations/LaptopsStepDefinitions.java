package stepDefinations;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.LaptopsPageObject;
import utilities.UtilityClass;

public class LaptopsStepDefinitions extends Base{
	
	LaptopsPageObject obj = new LaptopsPageObject();
	
	@Given("User is on Retail website for laptops")
	public void user_is_on_retail_website_for_laptops() {
		String actualPageTitile = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		Assert.assertEquals(expectedPageTitle, actualPageTitile);
		logger.info("Actual Title is matching with expected title");
		UtilityClass.takeScreenShot();
	}
	@When("User click on Laptop &NoteBook tab")
	public void user_click_on_laptop_note_book_tab() {
		obj.clickOnLaptopsTab();
		logger.info("user clicked on Laptops and Notebooks tab");

	}
	@And("User click on Show all Laptop &NoteBook option")
	public void user_click_on_show_all_laptop_note_book_option() {
		obj.clickOnShowAllLaptops();
		logger.info("user clicked on show all laptops and notebooks");

	}
	@And("User click on MacBook  item")
	public void user_click_on_mac_book_item() {
		obj.clickOnMac();
		logger.info("user clicked on MacBook");

	}
	@And("User click add to Cart button for Mac")
	public void userClicked_on_add_to_cart() {
		obj.addMacToCart();
		logger.info("user added Mac to cart");
	}
	@Then("User should see a message 'Success: You have added MacBook to your shopping cart!'")
	public void user_should_see_a_message_success_you_have_added_mac_book_to_your_shopping_cart() {

		Assert.assertTrue(obj.successMsgOnMacIsDisplayed());
		logger.info("user saw the success msg");
		UtilityClass.takeScreenShot();
	}
	@And("User should see 1 item showed to the cart")
	public void user_should_see_tem_s_showed_to_the_cart() {

		obj.priceIsDisplayed();
		logger.info("user saw the price");
	}
	@And("User click on cart option")
	public void user_click_on_cart_option() {
		obj.clickOnCartOptions();
		logger.info("user clicked on cart options");
	}
	@And("user click on red X button to remove the item from cart")
	public void user_click_on_red_x_button_to_remove_the_item_from_cart() {

		obj.clickOnRemove();
		logger.info("user removed the item from cart");
	}
	@Then("item should be removed and cart should show empty")
	public void item_should_be_removed_and_cart_should_show_item_s() {
     obj.cartEmptyDisplayed();
     logger.info("cart should be empty now");
     UtilityClass.takeScreenShot();
	}
	@And("User click on product comparison icon on ‘MacBook’")
	public void user_click_on_product_comparison_icon_on_mac_book() {

		obj.macComp();
		logger.info("user clicked on Mac product comparison");
	}
	@And("User click on product comparison icon on ‘MacBook Air")
	public void user_click_on_product_comparison_icon_on_mac_book_air() {

		obj.macAirComp();
		logger.info("user clicked on MacAir product comparison");
	}
	@Then("User should see a message 'Success: You have added MacBook Air to your product comparison!'")
	public void user_should_see_a_message_success_you_have_added_mac_book_air_to_your_product_comparison() {

		Assert.assertTrue(obj.comparisonMsgDisplayed());
		logger.info("user saw the comparison message");
	}
	@And("User click on Product comparison link")
	public void user_click_on_product_comparison_link() {

		obj.clickOnProdcutComp();
		logger.info("user clicked on product comparison link");
	}
	@Then("User should see Product Comparison Chart")
	public void user_should_see_product_comparison_chart() {
		Assert.assertTrue(obj.productCompCharDisplayed());
		logger.info("user saw product comparison chart");
		UtilityClass.takeScreenShot();
	}
	
	@And("User click on heart icon to add ‘Sony VaIO’ laptop to wish list")
	public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		obj.clickOnWishListOfSonyVaio();
		logger.info("user clicked on Sony VAIO wishlist");

	}
	@Then("User should get a message 'You must login or create an account to save Sony VAIO to your wish list!'")
	public void user_should_get_a_message() {

		Assert.assertTrue(obj.youHaveToCreatAccountIsDisplayed());
		logger.info("user saw the message of creating an account in order to add to wishlist");
		UtilityClass.takeScreenShot();
	}
	@And("User click on ‘MacBook Pro’ item")
	public void user_click_on_mac_book_pro_item() {
	   obj.clickOnMacBookPro();
	   logger.info("user clicked on MacBook PRo");
	}
	@Then("User should see '$2,000.00' price tag is present on UI")
	public void user_should_see_price_tag_is_present_on_ui(String string) {
	 Assert.assertTrue(obj.priceOfMacProIsDisplayed());
	 logger.info("actual price is matching with expected price");
	 UtilityClass.takeScreenShot();
	}


}
