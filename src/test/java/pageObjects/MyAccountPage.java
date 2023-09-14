package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//h2[text()='My Account']") // MyAccount Page heading
	WebElement msgHeading;

	 /* //*[@id="column-right"]/div/a[13] */
	//@FindBy(xpath = "//div[@class='list-group']//a[text()='Logout']")
	
	@FindBy(xpath = " //*[@id=\"column-right\"]/div/a[13]")
	WebElement lnkLogout;
	
	public boolean isMyAccountPageExists()   // MyAccount Page heading display status
	{
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	
	public void clickLogout() {
		lnkLogout.click();

	}
}
