package stepdefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	public static WebDriver div;

	@Before
	public void beforemet()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nirmala\\Downloads\\chromedriver2\\chromedriver.exe");
		div=new ChromeDriver();
		div.get("http://demo.guru99.com/telecom");
		System.out.println("Before");
		div.manage().window().maximize();
	}
	
	@After
	public void aftermet(Scenario scene)
	{
		if(scene.isFailed())
		{
			System.out.println("takescreenshot");
			TakesScreenshot taks=(TakesScreenshot) div;
			try
			{
				FileHandler.copy(taks.getScreenshotAs(OutputType.FILE), new File("D:\\screen.png"));
			} catch(WebDriverException e) {
				
			} catch(IOException io) {
				
			}
			
		}
	}
			@After
			public void aftermet()
			{
				System.out.println("after");
				div.close();
			}
			
		
	
	
}
