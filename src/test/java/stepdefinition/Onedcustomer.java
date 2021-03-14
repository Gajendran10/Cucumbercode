package stepdefinition;



import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class Onedcustomer {

	static WebDriver dri;
	
	@Given("User should launch browser")
	public void user_should_launch_browser() {
	   System.out.println("Given 1");
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirmala\\Downloads\\chromedriver2\\chromedriver.exe");
	   dri = new ChromeDriver();
		dri.get("http://demo.guru99.com/telecom");
	}

	@And("click to add customer link")
	public void click_to_add_customer_link() {
		dri.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		System.out.println("Given 2");

	}

	/*
	 * @When("User provided detail") public void
	 * user_provided_detail(io.cucumber.datatable.DataTable dataTable) {
	 * List<String> oned= dataTable.asList();
	 * dri.findElement(By.xpath("//label[text()='Done']")).click();
	 * dri.findElement(By.id("fname")).sendKeys(oned.get(0));
	 * dri.findElement(By.id("lname")).sendKeys(oned.get(1));
	 * dri.findElement(By.xpath("//input[@id='email']")).sendKeys(oned.get(2));
	 * dri.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(oned.get(3));
	 * dri.findElement(By.id("telephoneno")).sendKeys(oned.get(4));
	 * dri.findElement(By.xpath("//input[@name='submit']")).click();
	 * 
	 * 
	 * }
	 */
	@When("adding custome info")
	public void adding_custome_info(io.cucumber.datatable.DataTable dataTable) throws InterruptedException{
		System.out.println("Given4");
		//dri = new ChromeDriver();
	    Map<String,String> OneMap=dataTable.asMap(String.class, String.class);
	    dri.findElement(By.xpath("//label[text()='Done']")).click();
	    dri.findElement(By.id("fname")).sendKeys(OneMap.get("fname"));
	    dri.findElement(By.id("lname")).sendKeys(OneMap.get("Lname"));
	    dri.findElement(By.xpath("//input[@id='email']")).sendKeys(OneMap.get("mail"));
	    dri.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(OneMap.get("address"));
	    dri.findElement(By.id("telephoneno")).sendKeys(OneMap.get("ph.no"));
	    Thread.sleep(10000);
	    dri.findElement(By.xpath("//input[@name='submit']")).click();
	    
	    
	}
}
