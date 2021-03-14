package stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TwoDList {
	
	static WebDriver div;
	
	@Given("User launch brow")
	public void user_launch_brow() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirmala\\Downloads\\chromedriver2\\chromedriver.exe");
	div=new ChromeDriver();
	div.get("http://demo.guru99.com/telecom");
		
	}

	@And("Click cus link")
	public void click_cus_link() {
	   
		div.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("add cus detail")
	public void add_cus_detail(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

	List<List<String>> twodlis= dataTable.asLists(String.class);
	div.findElement(By.xpath("//label[text()='Done']")).click();
    div.findElement(By.id("fname")).sendKeys(twodlis.get(0).get(0));
    div.findElement(By.id("lname")).sendKeys(twodlis.get(0).get(3));
    div.findElement(By.xpath("//input[@id='email']")).sendKeys(twodlis.get(1).get(2));
    div.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(twodlis.get(2).get(3));
    div.findElement(By.id("telephoneno")).sendKeys(twodlis.get(1).get(4));
    Thread.sleep(10000);
    div.findElement(By.xpath("//input[@name='submit']")).click();
		
	}

}
