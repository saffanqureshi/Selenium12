package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		String month="September, 2023";
		String day="30";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElementById("username").sendKeys("DemoCSR");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		
		//Click on Calendar icon near from the birth date field
		driver.findElementByXPath("//img[@id='createLeadForm_birthDate-button']").click();
		while (true) {
			//Capture month and year from the calendar and store in variable in while loop
		String text = driver.findElementByXPath("//td[@class='title']").getText();
		System.out.println(text);
		if (text.equals(month)) {//when find month variable =September, 2025 then comes out from the while loop
			break;//when condition will met the loop will end
		}
		
		else{
			//continue clicking on next month button until found the September 2025
			driver.findElementByXPath("(//div[@unselectable='on'])[6]").click();
		}
		}
	}

}
