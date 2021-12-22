package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class AddToCartPageObject extends Base {
	
	public AddToCartPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[1]")
	private WebElement addToCartHP;
	
	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantity;
	
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successText;
	
	
	public void addToCartHPCom() {
		addToCartHP.click();
		
	}
	
	public void addQuantity() {
		quantity.sendKeys("1");
	}
	
	public void clickOnAddToCart() {
		addToCartButton.click();
	}
	
	public boolean successTextIsDisplayed() {
		if(successText.isDisplayed())
			return true;
		else 
			return false;
	}


	
	

}
