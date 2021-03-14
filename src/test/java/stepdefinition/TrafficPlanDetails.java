package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TrafficPlanDetails {
	static WebDriver dri;
	@Given("User should lauch the browser")
	public void user_should_lauch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirmala\\Downloads\\chromedriver2\\chromedriver.exe");
		dri= new ChromeDriver();
		dri.get("http://demo.guru99.com/telecom");
		System.out.println("Given 2");
	}

	@And("Click the add traffic plan link")
	public void click_the_add_traffic_plan_link() {
	 dri.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();
	 System.out.println("When 2");
	}
	@When("Add Traffic details")
	public void add_Traffic_details() {
	   dri.findElement(By.id("rental1")).sendKeys("123");
	   dri.findElement(By.id("local_minutes")).sendKeys("200");
	   dri.findElement(By.id("inter_minutes")).sendKeys("400");
	   dri.findElement(By.id("sms_pack")).sendKeys("25");
	   dri.findElement(By.id("minutes_charges")).sendKeys("50");
	   dri.findElement(By.id("inter_charges")).sendKeys("5");
	   dri.findElement(By.id("sms_charges")).sendKeys("1");
	   dri.findElement(By.xpath("//input[@name='submit']")).click();
	}

	
	
}
