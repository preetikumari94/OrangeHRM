package OrangeHRM_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Pages {

	 public static WebDriver driver;
		
		public Pages(WebDriver driver)
		{
			this.driver = driver; }
		
		
		By Username = By.name("username");
		By Password = By.name("password");
		By Login = By.xpath("//button[@type='submit']");
		By Dashboard =By.xpath("//div[@class='oxd-topbar-header-title']//i");
		By PIM =By.xpath("//div[@class='oxd-sidepanel-body']//ul//li[2]//a");
		By EmployeeList =By.xpath("//div[@class='oxd-topbar-body']//ul//li[2]");
		By EmployeeName =By.xpath("//div[@class='oxd-table-filter-area']/form/div[1]/div/div[1]/div/div[2]/div/div/input");
		By EmployeeID =By.xpath("//div[@class='oxd-table-filter-area']/form/div[1]/div/div[2]/div/div[2]/input");
		By Search =By.xpath("//button[@type='submit']");
		By Image =By.xpath("//li[@class='oxd-userdropdown']//span");
		By Logout =By.xpath("//ul[@class='oxd-dropdown-menu']//li[4]//a");
		
		
		public void enterURL()  {
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		}
		
		public void enterUsername(String Admin) {
			driver.findElement(Username).sendKeys(Admin);
		}
		
		public void enterPassword(String admin123)  {
			driver.findElement(Password).sendKeys(admin123);
		}
		
		public void clickLogin()   {
			driver.findElement(Login).click();
		}
		
		public void clickDashboard()   {
			driver.findElement(Dashboard).click();
		}
		
		public void clickPIM()   {
			driver.findElement(PIM).click();
		}
		
		public void clickEmployeeList()   {
			driver.findElement(EmployeeList).click();
		}
		
		public void enterEmployeeName(String Name)   {
			driver.findElement(EmployeeName).sendKeys(Name);
		}
		
		public void enterEmployeeID(String ID)   {
			driver.findElement(EmployeeID).sendKeys(ID);
		}
		
		public void clickSearch()   {
			driver.findElement(Search).click();
		}
		
		public void clickImage()   {
			driver.findElement(Image).click();
		}
		
		public void clickLogout()   {
			driver.findElement(Logout).click();
		}
}

