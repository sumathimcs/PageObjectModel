package testPack;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeLnk {
	
	@FindBy(linkText="Home")
	WebElement lnkHomeLnk;
	
	
	public void testLogout()
	{
		lnkHomeLnk.click();
	}

}
