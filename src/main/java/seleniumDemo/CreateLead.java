package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

public class CreateLead {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\qures\\OneDrive\\Documents\\SoftwareTesting\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("http://leaftaps.com/opentaps/control/login");
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		//driver.findElementByLinkText("Create Lead").click();
		driver.findElementByXPath("(//a[starts-with(@id,'ext-gen')])[5]").click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.findElementById("createLeadForm_companyName").sendKeys("ABCD");
		driver.findElementById("createLeadForm_firstName").sendKeys("Ashiq");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ali");
		//Select Source as Employee Drop Down
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		//Create object of Select Class
		Select dd = new Select(src);
		dd.selectByVisibleText("Website");
		
		WebElement mkt = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd1 = new Select(mkt);
		dd.selectByVisibleText("Automobile");
		
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Ashiq1");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Ali");
		driver.findElementById("createLeadForm_birthDate").sendKeys("08/07/1999");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("5712222222");
		
		driver.findElementByName("submitButton").click();
		
		//Quit all browser tab
		driver.quit();
		
		

	}

}
