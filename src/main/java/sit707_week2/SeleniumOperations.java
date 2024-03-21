package sit707_week2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) throws IOException {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver-win64\\chromedriver.exe");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		sleep(2);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement element_firstname = driver.findElement(By.id("firstname"));
		System.out.println("Found element: " + element_firstname);
		// Send first name
		element_firstname.sendKeys("Kema");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		WebElement element_lastname = driver.findElement(By.id("lastname"));
		System.out.println("Found element: " + element_lastname);
		// Send Last name
		element_lastname.sendKeys("Dissanayake");
		
		WebElement element_phoneNumber = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found element: " + element_phoneNumber);
		// Send Phone Number
		element_phoneNumber.sendKeys("0412545854");
		
		WebElement element_email = driver.findElement(By.id("email"));
		System.out.println("Found element: " + element_email);
		// Send Email Address
		element_email.sendKeys("kemasanka981@gmail.com");
		
		WebElement elememt_password = driver.findElement(By.id("password"));
		System.out.println("Found element: " + elememt_password);
		// Send Password
		elememt_password.sendKeys("kemaSanka990@");
		
		WebElement elememt_confirm_password = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found element: " + elememt_confirm_password);
		// Send Password to confirm
		elememt_confirm_password.sendKeys("kemaSanka990@");
		
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
		WebElement createAccount = driver.findElement(By.xpath("//button[@data-testid='account-action-btn']"));
		createAccount.click(); 
		System.out.println("Created an Account in with Click");
		
		
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code

	    File screenshot = ((TakesScreenshot) driver)

	                            .getScreenshotAs(OutputType.FILE);

	    FileUtils.copyFile(screenshot, new File("C:\\Users\\kemas\\Desktop\\Deakin University\\Trimester 2 2024\\SIT707\\New folder\\2.1P-resources\\img\\screenshot.jpg"));

		
		// Sleep a while
		sleep(200);
		
		// close chrome driver
		driver.close();	
	}
	
	public static void digitalocean_registration_page(String url) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver-win64\\chromedriver.exe");
		
		
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);

		driver.get(url);
		
		sleep(2);
		
		WebElement element_firstname = driver.findElement(By.id("name"));
		System.out.println("Found element: " + element_firstname);
		// Send first name
		element_firstname.sendKeys("Kema");
		
		WebElement element_email = driver.findElement(By.id("email"));
		System.out.println("Found element: " + element_email);
		// Send Last name
		element_email.sendKeys("kemasanka981@gmail.com");
		
		WebElement element_password = driver.findElement(By.id("password"));
		System.out.println("Found element: " + element_password);
		// Send Last name
		element_password.sendKeys("KemaText@12345");
				
		WebElement signUp = driver.findElement(By.xpath("//button[@data-tracking-id='registration--registrationForm-sign-up-button']"));
		signUp.click(); 
		System.out.println("Signed up with Click");
		
		
	    File screenshot = ((TakesScreenshot) driver)

	                            .getScreenshotAs(OutputType.FILE);

	    FileUtils.copyFile(screenshot, new File("C:\\Users\\kemas\\Desktop\\Deakin University\\Trimester 2 2024\\SIT707\\New folder\\2.1P-resources\\img\\screenshot.jpg"));

		
		// Sleep a while
		sleep(200);
		
		// close chrome driver
		driver.close();	
	}
	
}
