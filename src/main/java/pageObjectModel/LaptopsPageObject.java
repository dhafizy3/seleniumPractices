package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopsPageObject extends Base {
	
	public LaptopsPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[normalize-space() = 'Laptops & Notebooks']")
	private WebElement laptopsTab;
	
	
	@FindBy(xpath = "//a[normalize-space() = 'Show All Laptops & Notebooks']")
	private WebElement showLaptops;
	
	@FindBy(xpath = "//a[normalize-space() = 'MacBook']")
	private WebElement macBook;
	
	@FindBy(xpath = "//button[@class = 'btn btn-primary btn-lg btn-block']")
	private WebElement addCartButton;
	
	@FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement successMsgForMac;
	
	@FindBy(xpath = "//h2[normalize-space()='$602.00']")
	private WebElement price;
	
	@FindBy(xpath = "//a[normalize-space()='shopping cart']")
	private WebElement cartTotal;
	
	@FindBy(xpath = "//i[@class='fa fa-times-circle']")
	private WebElement removeFromCart;
	@FindBy(xpath = "//div[@id='content']//p[contains(text(),'Your shopping cart is empty!')]")
	private WebElement finalMsg;
	
	@FindBy(xpath = "//div[@id='product-category']//div[2]//div[1]//div[2]//div[2]//button[3]//i[1]")
	private WebElement macComparison;
	
	@FindBy(xpath = "//div[3]//div[1]//div[2]//div[2]//button[3]//i[1]")
	private WebElement macAirComparison;
	
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement productComparisonMessage;
	
	@FindBy(xpath = "//a[normalize-space() = 'Product Compare (2)']")
	private WebElement productComparison;
	
	@FindBy(xpath = "//h1[normalize-space()='Product Comparison']")
	private WebElement productComparisonChart;
	
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[2]/button[2]/i[1]")
	private WebElement wishListSony;
	
	@FindBy(xpath = "//div[@class = 'alert alert-success alert-dismissible']")
	private WebElement wishListMessage;
	
	@FindBy(xpath = "//a[normalize-space() = 'MacBook Pro']")
	private WebElement macPro;
	
	@FindBy(xpath = "//h2[normalize-space() = '$2,000.00']")
	private WebElement priceOfMacPro;

	
	
	public void clickOnLaptopsTab() {
		laptopsTab.click();
	}
	public void clickOnShowAllLaptops() {
		showLaptops.click();
	}
	public void clickOnMac() {
		macBook.click();
	}
	public void addMacToCart() {
		addCartButton.click();
	}
	public boolean successMsgOnMacIsDisplayed() {
		if(successMsgForMac.isDisplayed())
			return true;
		else 
			return false;
	}
	public boolean priceIsDisplayed() {
		if(price.isDisplayed())
			return true;
		else 
			return false;
	}
	public void clickOnCartOptions() {
		cartTotal.click();
	}
	
	public void clickOnRemove() {
		removeFromCart.click();
	}
	
	public boolean cartEmptyDisplayed() {
		if(finalMsg.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void macComp() {
		macComparison.click();
	}
	
	public void macAirComp() {
		macAirComparison.click();
	}
	
	public boolean comparisonMsgDisplayed() {
		if(productComparisonMessage.isDisplayed())
			return true;
		else 
			return false;
	}
	
	public void clickOnProdcutComp() {
		productComparison.click();
	}
	
	public boolean productCompCharDisplayed() {
		if(productComparisonChart.isDisplayed())
			return true;
		else
			return false;
		
	}
	
	public void clickOnWishListOfSonyVaio() {
		wishListSony.click();
	}
	
	public boolean youHaveToCreatAccountIsDisplayed() {
		if(wishListMessage.isDisplayed())
			return true;
		else
			return false;
	}
	
	public void clickOnMacBookPro() {
		macPro.click();
	}
	
	public boolean priceOfMacProIsDisplayed() {
		if(priceOfMacPro.isDisplayed())
			return true;
		else 
			return false;
	}
}
