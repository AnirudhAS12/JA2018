package verifyerrormessages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class VerifyError {
	
	@Test
	public void verifymessages() {
		System.setProperty("webdriver.chrome.driver", "D:\\jlt\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.gmail.com");
		
		String Title = driver.getTitle();
		Assert.assertEquals("Gmail", Title);
		
		driver.findElement(By.xpath(".//*[@role='button' and @id='identifierNext']")).click();
		
		String errormsg = driver.findElement(By.xpath(".//*[@class='dEOOab RxsGPe']")).getText();
		
		Assert.assertEquals(errormsg, "Enter an email or phone number");
		
		System.out.println("Test case passed");
		
	}

}
