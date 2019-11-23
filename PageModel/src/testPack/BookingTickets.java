package testPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;

public class BookingTickets {
	
	
		WebDriver driver;

		public BookingTickets(WebDriver driver)
		{
			this.driver = driver;
		}
		
		@FindBy(name="tripType")
		List<WebElement> tripType;
		
		@FindBy(name="servClass")
		List<WebElement> servClass; 
		
		@FindBy(name="fromPort")
		WebElement fromPort;
		
		@FindBy(name="toPort")
		WebElement toPort;
		
		
		
		
		public Logout BookingTic()
		{
			for(WebElement t:tripType)
			{
				if(t.getAttribute("value").equals("oneway"))
				{
					t.click();
				}
				
				
			}
			
			for(WebElement ser:servClass)
			{
				if(ser.getAttribute("value").equals("Business"))
						{
					ser.click();
						}
					
			}
			return PageFactory.initElements(driver, Logout.class);
			
		}


		public Logout BookingTic2()
			{
			Select s= new Select(fromPort);
			s.selectByVisibleText("London");
			
			Select s1=new Select(toPort);
			s1.selectByVisibleText("New York");
			
			return PageFactory.initElements(driver, Logout.class);
			}
}



