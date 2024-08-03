package seleniumDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

		
		//Launch Chrome browser/open Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\qures\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//"C:\Users\qures\Downloads\chromedriver-win64\chromedriver-win64\chromedriver.exe"
		
		//Syntax of object creation - ChromeDriver
		ChromeDriver driver = new ChromeDriver();
		
		//load url or open application
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Maximize window/page
		driver.manage().window().maximize();
		
		//Enter/type username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		
		//Enter/type Password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click login button
		driver.findElementByClassName("decorativeSubmit").click();
		
		//click CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByLinkText("Leads").click();
		
		driver.findElementByLinkText("Create Lead").click();
		
		driver.findElementById("createLeadForm_companyName").sendKeys("ABC");
		
		driver.findElementById("createLeadForm_firstName").sendKeys("Salman");
		
		driver.findElementById("createLeadForm_lastName").sendKeys("Ahmad");
		
		
		driver.findElementByName("submitButton").click();
		
		System.out.println(driver.getTitle());
				
		//driver.findElementByLinkText("Find Leads").click();
		
		//driver.findElementByName("firstName").sendKeys("Salman");
		
		//driver.findElementByName("lastName").sendKeys("Ahmad");
		
		//driver.findElementByName("companyName").sendKeys("ABC");
		
		Thread.sleep(3000);
		
		//Close browser
		driver.close();
		
		
		
		
	}

}
