package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class E2E {
	
	ChromeOptions chromeOptions = null;
	WebDriver driver = null;
	
	@Given("^user is on H&M Home Page$")
	public void user_is_on_H_M_Home_Page() throws Throwable {

		 ChromeOptions chromeOptions = new ChromeOptions();
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver(chromeOptions);
		 
		 driver.manage().window().maximize();
		 driver.get("https://www2.hm.com/en_in/index.html");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("/html/body/div[10]/div[3]/div/div/div[2]/div/div/button")).click();
		 Thread.sleep(2000);
		
	}

	@Given("^user logins into account$")
	public void user_logins_into_account() throws Throwable {

		driver.findElement(By.xpath("/html/body/header/nav/ul[1]/li[1]/div/a[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[12]/div/div/form/div[1]/input")).sendKeys("utkarsh20th@gmail.com");
		driver.findElement(By.xpath("/html/body/div[12]/div/div/form/div[2]/input")).sendKeys("OINPO9889c09e07r");
		driver.findElement(By.xpath("/html/body/div[12]/div/div/form/button")).click();
		Thread.sleep(10000);
		
	}

	@When("^user searches for cloth item$")
	public void user_searches_for_cloth_item() throws Throwable {

		WebElement ele = driver.findElement(By.xpath("/html/body/header/nav/div[1]/section/form/input"));
		ele.sendKeys("socks");
		Thread.sleep(2000);
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		ele = driver.findElement(By.xpath("/html/body/main/div[3]/div/div[1]/ul/li[2]/article/div[2]/h3/a"));
		ele.click();
		Thread.sleep(5000);
		
	}

	@Then("^user selects size$")
	public void user_selects_size() throws Throwable {

		WebElement ele = driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[1]/div[1]/div/div[3]/div[1]/div/button/span"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(500);
		ele.click();
		driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[1]/div[1]/div/div[3]/div[1]/div/ul/li[2]/div/button/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/div[1]/div[1]/div/div[3]/div[1]/button")).click();
		Thread.sleep(5000);
		
	}

	@Then("^user goes to cart$")
	public void user_goes_to_cart() throws Throwable {

		WebElement ele = driver.findElement(By.xpath("/html/body/header/nav/ul[1]/li[4]/span/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(500);
		ele.click();
		Thread.sleep(5000);
		ele = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/section[2]/div/div/div[1]/div[3]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(500);
		ele.click();
		Thread.sleep(5000);
		
	}

	@Then("^user enters address and payment details$")
	public void user_enters_address_and_payment_details() throws Throwable {

		WebElement ele = driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/section/section[1]/button"));
		ele.click();
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/section/section[1]/div/form/fieldset[2]/checkout-personal-details-form[1]/div[2]/div[1]/input"));
		ele.clear();
		ele.sendKeys("FirstName");
		ele = driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/section/section[1]/div/form/fieldset[2]/checkout-personal-details-form[1]/div[2]/div[2]/input"));
		ele.clear();
		ele.sendKeys("LastName");
		ele = driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/section/section[1]/div/form/fieldset[2]/checkout-personal-details-form[2]/div[3]/div[1]/input"));
		ele.clear();
		ele.sendKeys("Ansal Apartment");
		ele = driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/section/section[1]/div/form/fieldset[2]/checkout-personal-details-form[2]/div[3]/div[3]/input"));
		ele.clear();
		ele.sendKeys("122001");
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[13]/div[2]/div/form/div[2]/button[2]")).click();
		Thread.sleep(5000);
		ele = driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/section/section[2]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(500);
		ele.click();
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/section/section[2]/div/form/div/div/div[2]/div[2]/input"));
		ele.clear();
		ele.sendKeys("1234567894");
		driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/section/section[2]/div/form/div/button")).click();
		Thread.sleep(2000);
		
		ele = driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/section/section[3]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(500);
		ele.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/section/section[3]/div/div[1]/fieldset/ul/li[2]/div/label/span[1]/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/main/div[1]/div[3]/section/section[3]/div/div[1]/fieldset/ul/li[3]/div/label/span/span")).click();
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath("/html/body/main/div[1]/div[4]/form/div[2]/button"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(500);
		
		ele = driver.findElement(By.xpath("/html/body/header/div/a"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(500);
		ele.click();
		Thread.sleep(5000);
		
	}

	@Then("^then checks out and logout$")
	public void then_checks_out_and_logout() throws Throwable {

		Actions action = new Actions(driver);
        WebElement ele = driver.findElement(By.xpath("/html/body/header/nav/ul[1]/li[1]/div/a[2]"));
        action.moveToElement(ele).perform();
        Thread.sleep(2000);
        ele = driver.findElement(By.xpath("/html/body/header/nav/ul[1]/li[1]/div/div[2]/ul/li[3]/a"));
        ele.click();
        Thread.sleep(7000);driver.quit();
        
	}


}
