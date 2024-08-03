package seleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowserTesting {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		//WebDriver driver = WebDriverManager.edgedriver().create();
		//WebDriver driver = WebDriverManager.firefoxdriver().create();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//String title = driver.getTitle();
				//System.out.println(title);
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				//Enter 'Face book login' in Google search box
				driver.findElement(By.name("q")).sendKeys("facebook login");
				
				Thread.sleep(2000);
				
				driver.quit();

	}

}
