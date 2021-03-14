package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Paybill {
	static WebDriver di;
	
	@Given("User Should Launch the browser")
	public void user_Should_Launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirmala\\Downloads\\chromedriver2\\chromedriver.exe");
		di=new ChromeDriver();
		di.get("http://demo.guru99.com/telecom");
		System.out.println("Given 4");
	  
	}

	@And("Click the pay bill link")
	public void click_the_pay_bill_link() {
		di.findElement(By.xpath("(//a[text()='Pay Billing'])[1]")).click();
		System.out.println("When 4");
	  
	}
	
	@When("paying the bill")
	public void paying_the_bill() {
	   di.findElement(By.xpath("//input[@id='customer_id']")).sendKeys("183834");
	   di.findElement(By.xpath("//input[@name='submit']")).click();
	}


}
