package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDefination {
	ChromeDriver driver;
	@Given("launch chrome browser and load url")
	public void launch_chrome_browser_and_load_url() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//WebDriver driver = WebDriverManager.chromedriver().create();
		//WebDriver driver = WebDriverManager.edgedriver().create();
		driver.navigate().to("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	@Given("enter username as (.*)")
	public void enter_username_as_demo_sales_manager(String uname) {
		//driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElementById("username").sendKeys(uname);
	}
	@Given("enter password as (.*)")
	public void enter_password_as_crmsfa(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("click login button")
	public void click_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("its navigated to homepage")
	public void its_navigated_to_homepage() {
	    System.out.println(driver.getTitle());
	}
	@Then("click the logout button")
	public void click_the_logout_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}
	@Given("enter username as ssssss")
	public void enter_username_as_ssssss() {
		driver.findElement(By.id("username")).sendKeys("ssssss");
	}
	@Then("its navigate to same Page")
	public void its_navigate_to_same_page() {
		System.out.println(driver.getTitle());
	}
	@Then("verify error msg")
	public void verify_error_msg() {
	    WebElement errormsg = driver.findElement(By.xpath("//div[@id='errorDiv']"));
	    if (errormsg.equals("The Following Errors Occurred:following error occurred during login: User not found.")) {;
	    System.out.println("Error message is matched");
	}
	else {
		System.out.println("Error message is not matched");
	}

	}}
