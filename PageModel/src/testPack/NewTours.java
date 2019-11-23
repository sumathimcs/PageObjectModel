package testPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class NewTours {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMATHI SELVAM\\Downloads\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		Login l = PageFactory.initElements(driver, Login.class);
		Logout lout = l.testLogin();
		lout.testLogout();
		driver.get("http://newtours.demoaut.com/");
		BookingTickets b= l.testLogin1();
		lout=b.BookingTic();
		lout=b.BookingTic2();
		lout.testLogout();
		driver.close();
			}

}
