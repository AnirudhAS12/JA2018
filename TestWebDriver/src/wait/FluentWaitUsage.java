package wait;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;


public class FluentWaitUsage {

public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver", "D:\\jlt\\drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
	
	Wait<WebDriver> wait =new FluentWait<WebDriver>(driver)
			.withTimeout(10, TimeUnit.SECONDS)
			.pollingEvery(250, TimeUnit.MILLISECONDS)
			.ignoring(NoSuchElementException.class);
	
		WebElement element =wait.until(new Function<WebDriver, WebElement>()
				{
			public WebElement apply(WebDriver driver) 
			{
				
				WebElement ele = driver.findElement(By.xpath(".//*[@id='demo']"));
				String value = ele.getAttribute("innerHTML");
				
				if(value.equalsIgnoreCase("WebDriver")) {
					return ele;
				}
				else {
					System.out.println("Test on screen "+ value);
					return null;
				}
				
						
//				return driver.findElement(By.xpath(".//*[text()='WebDriver']"));
			}
			
				});
		
		boolean status = element.isDisplayed();
		
		if(status) {
			System.out.println("Element present, Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
}


}