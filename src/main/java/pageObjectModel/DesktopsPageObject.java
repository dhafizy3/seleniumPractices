package pageObjectModel;

import core.Base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopsPageObject extends Base{


	
	public DesktopsPageObject() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[normalize-space() = 'Desktops'  and @data-toggle = 'dropdown']")
	private WebElement desktopButton;
	
	@FindBy(xpath = "//a[normalize-space() = 'Show All Desktops']")
	private WebElement showAllDesktops;
	
	@FindBy(xpath = "//h2[normalize-space() = 'Desktops']")
	private WebElement desktopText;
	
	public void clickOnDesktops() {
		desktopButton.click();
	}
	
	public void clickOnShowAllDesktops() {
		showAllDesktops.click();
	}
	
	public boolean desktopTextIsDisplayed() {
		if (desktopText.isDisplayed())
			return true;
		else 
			return false;
	}
	
	
	
	
}
