package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	@FindBy(id ="first-name")
	WebElement firstName;
	
	@FindBy(id ="last-name")
	WebElement lastName;
	
	@FindBy(id ="postal-code")
	WebElement postalCode;
	
	@FindBy(id ="continue")
	WebElement contiBtn;
	
	@FindBy(id ="finish")
	WebElement finishBtn;
	
	@FindBy(css = "h2.complete-header")
	WebElement successMsg;
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//action
		public void checkoutLogin(String strfirstName, String strlastName, String PostalCode) {
			firstName.sendKeys(strfirstName);
			lastName.sendKeys(strlastName);
			postalCode.sendKeys(PostalCode);
			
			contiBtn.click();
		}
		public void checkoutOrder() {
			finishBtn.click();
		}
		public boolean isOrderSuccess() {
			return successMsg.isDisplayed();
			
		}

}
