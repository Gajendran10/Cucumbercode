package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Trafficplan  {
	static WebDriver drive;
	@Given("User Should launch the browser")
	public void user_Should_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirmala\\Downloads\\chromedriver2\\chromedriver.exe");
		drive= new ChromeDriver();
		drive.get("http://demo.guru99.com/telecom");
		System.out.println("Given 3");
	}
	
	@And("Click the add traffic plan to customer")
	public void click_the_add_traffic_plan_to_customer()  {
		drive=new ChromeDriver();
		//drive.wait(5000);
drive.findElement(By.xpath("(//a[contains(text(),'Add Tariff Plan to Customer')])[1]")).click();
System.out.println("When 3");
	}
	@When("Adding traffic plan to customer")
	public void adding_traffic_plan_to_customer() {
	 drive.findElement(By.xpath("//input[@id='customer_id']")).sendKeys("183834");
	 drive.findElement(By.xpath("//input[@name='submit']")).click();
	}
}
