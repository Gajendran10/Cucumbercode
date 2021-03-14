package stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerDetail {
	static WebDriver driv;

	@Given("User should launch the browser")
	public void user_should_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirmala\\Downloads\\chromedriver2\\chromedriver.exe");
		driv = new ChromeDriver();
		driv.get("http://demo.guru99.com/telecom");
		System.out.println("Given 1");
	}

	@And("click the add customer link")
	public void click_the_add_customer_link() {
		driv.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		System.out.println("Given 2");

	}
// scenario - bdd
	@When("User Provide valid details")
	public void user_Provide_valid_details() {
		driv.findElement(By.xpath("//label[text()='Done']")).click();
		driv.findElement(By.id("fname")).sendKeys("Gajen");
		driv.findElement(By.id("lname")).sendKeys("M");
		driv.findElement(By.xpath("//input[@id='email']")).sendKeys("gggg@gmail.com");
		driv.findElement(By.xpath("//textarea[@name='addr']")).sendKeys("Karur");
		driv.findElement(By.id("telephoneno")).sendKeys("7849200222");
		driv.findElement(By.xpath("//input[@name='submit']")).click();
		System.out.println("When 1");
	}

	// scenario outline --tdd
	@When("User Provide valid details{string},{string},{string},{string},{string}")
	public void user_Provide_valid_details(String fname, String lname, String email, String Address, String PhoneNo) {
		System.out.println("When 2");
		driv.findElement(By.xpath("//label[text()='Done']")).click();
		driv.findElement(By.id("fname")).sendKeys(fname);
		driv.findElement(By.id("lname")).sendKeys(lname);
		driv.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driv.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(Address);
		driv.findElement(By.id("telephoneno")).sendKeys(PhoneNo);
		driv.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		//System.out.println("Then 1");
		//Assert.assertTrue(driv.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());

	}

}
