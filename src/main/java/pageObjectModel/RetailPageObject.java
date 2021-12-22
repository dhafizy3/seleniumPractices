package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {
	
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[normalize-space()='My Account']")
	private WebElement myAccountButton;
	
	@FindBy(xpath = "//a[normalize-space() = 'Login']")
	private WebElement login;
	
	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password;
	
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//h2[normalize-space()='My Account']")
	private WebElement myAccountText;
	
	@FindBy(xpath = "//a[normalize-space()='Register for an affiliate account']")
	private WebElement registerForAffiliateButton;
	
	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement company;
	
	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement website;
	
	@FindBy(xpath = "//input[@id='input-tax']")
	private WebElement taxId;
	
	@FindBy (xpath = "//input[@id='input-cheque']")
	private WebElement payeeName;
	
	@FindBy (xpath = "//input[@value = 'cheque']")
	private WebElement paymentMethod;
	
	@FindBy (xpath = "//input[@name='agree']")
	private WebElement aboutUs;
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement continueButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successAffiliateMsg;
	@FindBy(xpath = "//a[normalize-space()='Edit your affiliate information']")
	private WebElement editAffiliateInfo;
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement bankTransfer;
	@FindBy(xpath = "//input[@id='input-bank-name']")
	private WebElement bankName;
	@FindBy(xpath = "//input[@id='input-bank-branch-number']")
	private WebElement branchNum;
	@FindBy(xpath = "//input[@id='input-bank-swift-code']")
	private WebElement swiftCode;
	@FindBy(xpath = "//input[@id='input-bank-account-name']")
	private WebElement accountName;
	@FindBy(xpath = "//input[@id='input-bank-account-number']")
	private WebElement accountNum;
	
	@FindBy(xpath = "//a[normalize-space()='Edit Account']")
	private WebElement editAccount;
	
	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement editFirstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement editLastName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement editEmail;
	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement editTelephone;

	
	
	
	
	
	public void clickOnMyAccount() {
		myAccountButton.click();
	}

	public void clickOnLogin() {
		login.click();
	}
	
	public void sendUserNamdAndPass(String userName, String pass) {
		email.sendKeys(userName);
		password.sendKeys(pass);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
	}
	
	public boolean myAccountIsDisplayed() {
		if(myAccountText.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void clickOnAffiliate() {
		registerForAffiliateButton.click();
	}
	

	public void enterCompany(String com) {
		company.sendKeys(com);
	}
	public void enterWebsite(String web) {
		website.sendKeys(web);
	}
	public void enterTaxId(String taxes) {
		taxId.sendKeys(taxes);
	}
    public void enterPayeeName(String payees) {
    	payeeName.sendKeys(payees);
    }
	
	
	public void clickOnPaymentMehtod() {
		paymentMethod.click();
	}
	
	public void clickOnAboutUs() {
		aboutUs.click();
	}
	
	public void clickOnContinue() {
		continueButton.click();
	}
	
	public boolean successAffiliateIsDisplayed() {
		if(successAffiliateMsg.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnAffiliateEdit() {
		editAffiliateInfo.click();
	}
	
	public void clickOnBankTransfer() {
		bankTransfer.click();
	}
	
	public void enterBankName(String bName) {
		bankName.sendKeys(bName);
	}
	public void enterBranchNum(String bNum) {
		branchNum.sendKeys(bNum);
	}
	public void enterSwiftCode(String sNum) {
		swiftCode.sendKeys(sNum);
	}
	public void enterAccountName(String aName) {
		accountName.sendKeys(aName);
	}
	public void enterAccountNum(String aNum) {
		accountNum.sendKeys(aNum);
	}
	public void clickOnEditAccount() {
		editAccount.click();
	}
	
	public void enterEditFirstName(String fName) {
		editFirstName.clear();
		editFirstName.sendKeys(fName);
	}
	public void enterLastName(String lName) {
		editLastName.clear();
		editLastName.sendKeys(lName);
	}
	public void enterEditEmail(String eMail) {
		editEmail.clear();
		editEmail.sendKeys(eMail);
	}
	public void enterEditPhone(String phoneNum) {
		editTelephone.clear();
		editTelephone.sendKeys(phoneNum);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
