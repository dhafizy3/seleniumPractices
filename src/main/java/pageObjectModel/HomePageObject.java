package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base{
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[normalize-space()='Currency']")
	private WebElement currency;
	
	@FindBy (xpath = "//button[contains(text(),'€ Euro')]")
	private WebElement euroCurrency;
	
	@FindBy(xpath = "//strong[contains(text(),'€')]")
	private WebElement euroLogo;
	
	@FindBy (xpath = "//span[normalize-space()='Shopping Cart']")
	private WebElement shoppingCartButton;
	
	@FindBy (xpath = "//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement emptyMessage;
	
	
	public void changeCurrency() {
		currency.click();
	}
	
	public void getEuro() {
		euroCurrency.click();
	}
	public boolean euroLogoIsDisplayed() {
		if(euroLogo.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnShoppingCart() {
		shoppingCartButton.click();
	}
	
	public boolean emptyMessageIsDisplayed() {
		if(emptyMessage.isDisplayed())
			return true;
		else 
			return false;
		
	}

}
