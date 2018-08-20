package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\jlt\\drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
	driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	WebDriverWait wait =new WebDriverWait(driver, 10);
	WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='demo']")));
//	WebElement element = driver.findElement(By.xpath(".//*[@id='demo']"));
	
	boolean status = element.isDisplayed();
	
	if(status) {
		System.out.println("Element present, Test Passed");
	}
	else {
		System.out.println("Test Failed");
	}
	}

}
