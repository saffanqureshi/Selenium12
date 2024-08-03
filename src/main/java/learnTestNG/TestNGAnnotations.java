package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	@Test
	public void testNGAnnotations() throws InterruptedException {
				
			System.out.println("Test");
		
	}
	@Test(priority=0)
	public void testNGAnnotations1() throws InterruptedException {
				
			System.out.println("Test1");
		
	}
	@Test(priority=3)
	public void testNGAnnotations2() throws InterruptedException {
				
			System.out.println("Test2");
		
	}
	@Test(priority=2)
	public void testNGAnnotations3() throws InterruptedException {
				
			System.out.println("Test3");
		
	}
		@BeforeTest
		public void beforeTest() {
			System.out.println("beforeTest");
		}
		@BeforeClass
		public void beforeclass() {
			System.out.println("beforeClass");
		}
		@BeforeSuite
		public void beforeSuite() {
			System.out.println("beforeSuite");
		}
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("beforeMethod");
		}
	
	
		@AfterTest
		public void afterTest() {
			System.out.println("afterTest");
		}
		@AfterSuite
		public void afterSuite() {
			System.out.println("afterSuite");
		}
		@AfterMethod
		public void afterMethod() {
			System.out.println("afterMethod");
		}
		@AfterClass
		public void afterClass() {
			System.out.println("afterClass");
		}
	
}
