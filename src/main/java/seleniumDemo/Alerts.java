package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\qures\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//driver.get("http://leaftaps.com/opentaps/control/login");
		driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		//Implicitly wait [indirect wait]
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Simple Alert
		driver.findElementByXPath("//button[text()='Click for JS Alert']").click();
		String simpleAlert = driver.switchTo().alert().getText();
		System.out.println(simpleAlert);
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		//Confirmation Alert
		driver.findElementByXPath("//button[test()='Click for JS Confirm']").click();
		String confirmationAlert = driver.switchTo().alert().getText();
		System.out.println(confirmationAlert);
		
		Thread.sleep(2000);
		
		//driver.switchTo().alert().dismiss();
		driver.switchTo().alert().accept();
		
		
		//Prompt Alert
		driver.findElementByXPath("//button[test()='Click for JS Prompt']").clear();
		String promptAlert = driver.switchTo().alert().getText();
		System.out.println(promptAlert);
		
		driver.switchTo().alert().sendKeys("I am none");
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		driver.close();

	}

}
