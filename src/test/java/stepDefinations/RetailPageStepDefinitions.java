package stepDefinations;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.RetailPageObject;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import utilities.UtilityClass;

public class RetailPageStepDefinitions extends Base {
	
	RetailPageObject ret = new RetailPageObject();
	
	
	@Given("User is on Retail website ")
	public void user_is_on_Retail_Website() {
		String ac = driver.getTitle();
		String exp = "TEK School";
		Assert.assertEquals(exp, ac);
		logger.info("user is on retail website");
	}
	@And("User click  on MyAccount")
	public void user_click_on_my_account() {
	   ret.clickOnMyAccount();
	   logger.info("user clicked on my account");
	}
	@When("User click on Login")
	public void user_click_on_login() {
		ret.clickOnLogin();
		logger.info("user clicked on login");

	}
	@And("^User enter username '(.+)' and password '(.+)'$")
	public void user_enter_username_and_password(String user, String passwo) {

		ret.sendUserNamdAndPass(user, passwo);
		logger.info("user entered username and password");
		
	}
	@And("User click on Login button")
	public void user_click_on_login_button() {

		ret.clickOnLoginButton();
		logger.info("user clicked on login button");
	}
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
		Assert.assertTrue(ret.myAccountIsDisplayed());
		logger.info("user saw my account dashboard");
		UtilityClass.takeScreenShot();

	}
	@When("User click on 'Register for an Affiliate Account' link")
	public void user_click_on_register_for_an_affiliate_account_link() {

		ret.clickOnAffiliate();
		logger.info("user clicked on affiliate registeration");
	}
	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form(DataTable dataTable){

		List<Map<String, String>> info = dataTable.asMaps(String.class, String.class);
		ret.enterCompany(info.get(0).get("company"));
		ret.enterWebsite(info.get(0).get("website"));
		ret.enterTaxId(info.get(0).get("taxID"));
		ret.enterPayeeName(info.get(0).get("payeeName"));

		logger.info("user entered affiliate info " + info.toString());
		UtilityClass.takeScreenShot();
	}
	@And("click on Cheque as payment method")
	public void user_clicks_on_payment_method() {
		ret.clickOnPaymentMehtod();
		logger.info("user clicked on payment method");
		
	}
	@And("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		ret.clickOnAboutUs();
		logger.info("user clicked on about us");

	}
	@And("User click on Continue button")
	public void user_click_on_continue_button() {

		ret.clickOnContinue();
		logger.info("user clicked on continue button");
	}
	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		
		Assert.assertTrue(ret.successAffiliateIsDisplayed());
		logger.info("user saw the affiliate success message after creation");
        UtilityClass.takeScreenShot();
	}
	
	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link() {

		ret.clickOnAffiliateEdit();
		logger.info("user clicked on affiliate edit link");
	}
	
	@And("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		ret.clickOnBankTransfer();
		logger.info("user choose bank transfer method");


	}
	@And("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(DataTable dataTable) {
		
		List<Map<String, String>> editInfo = dataTable.asMaps(String.class, String.class);
		ret.enterBankName(editInfo.get(0).get("bankName"));
        ret.enterBranchNum(editInfo.get(0).get("abaNumber"));
        ret.enterSwiftCode(editInfo.get(0).get("swiftCode"));
        ret.enterAccountName(editInfo.get(0).get("accountName"));
        ret.enterAccountNum(editInfo.get(0).get("accountNumber"));
        logger.info("user edited the affiliate info " + editInfo.toString());
        
        UtilityClass.takeScreenShot();
	}
	
	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
	   ret.clickOnEditAccount();
	   logger.info("user clicked on edit account");

	}
	@And("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {

		List<Map<String, String>> infoEdit = dataTable.asMaps(String.class, String.class);
		ret.enterEditFirstName(infoEdit.get(0).get("firstname"));
		ret.enterLastName(infoEdit.get(0).get("lastName"));
		ret.enterEditEmail(infoEdit.get(0).get("email"));
		ret.enterEditPhone(infoEdit.get(0).get("telephone"));
		
		logger.info("user edited the account information" + infoEdit.toString());
	}


}
