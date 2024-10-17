package OrangeHRMTestCase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import OrangeHRM_pages.Pages;



public class TestCases {
	WebDriver driver;
	Pages li;
	
	@BeforeMethod
	public void launchBrowser() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));}
	
	@Test
	public void TestCases() {
	Pages li=new Pages(driver);
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
			

