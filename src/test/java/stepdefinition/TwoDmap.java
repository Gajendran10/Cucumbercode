package stepdefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TwoDmap {
	
	static WebDriver drv;
	
	@Given("Launch twod url")
	public void launch_twod_url() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirmala\\Downloads\\chromedriver2\\chromedriver.exe");
		drv=new ChromeDriver();
		drv.get("http://demo.guru99.com/telecom/");
		
	}

	@And("click link twod")
	public void click_link_twod() {
	    
		drv.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		
	}

	@When("fill detail twod")
	public void fill_detail_twod(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	   
		List<Map<String,String>> twodmap= dataTable.asMaps(String.class,String.class);
		drv.findElement(By.xpath("//label[text()='Done']")).click();
	    drv.findElement(By.id("fname")).sendKeys(twodmap.get(0).get("Fname"));
	    drv.findElement(By.id("lname")).sendKeys(twodmap.get(0).get("Lname"));
	    drv.findElement(By.xpath("//input[@id='email']")).sendKeys(twodmap.get(1).get("MailId"));
	    drv.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(twodmap.get(2).get("Address"));
	    drv.findElement(By.id("telephoneno")).sendKeys(twodmap.get(1).get("Phone.No"));
	    Thread.sleep(10000);
	    drv.findElement(By.xpath("//input[@name='submit']")).click();
		
	}

}
