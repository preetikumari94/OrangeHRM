package OrangeHRMTestCase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import OrangeHRM_pages.Login_pages;

public class Login_TestCases {
	
	public static void main(String[] args) throws IOException {

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Login_pages li=new Login_pages(driver);
	li.enterURL();
	li.enterUsername("Admin");
	li.enterPassword("admin123");        
	li.clickLogin();
	//li.clickDashboard();
	li.clickPIM();
	li.clickEmployeeList();
	li.enterEmployeeName("John smith Romer");
	li.enterEmployeeID("0123");
	li.clickSearch();
	li.clickImage();
	li.clickLogout();
	
	
	}}
			

