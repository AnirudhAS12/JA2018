package captureScreenShot;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Library.Utility;

public class GmailScreenShot {
	
	@Test
	public void takeScreenShot() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\jlt\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.gmail.com");
		
		Utility.TakeScreenShot(driver, "open gmail");
		
		driver.findElement(By.xpath(".//*[@id='identifierId' and @type='email']")).sendKeys("iamanirudhas@gmail.com");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='identifierNext' and @role='button']")).click();
		driver.findElement(By.xpath(".//*[@name='password' and @type='password']")).sendKeys("password");
		
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		
//		FileUtils.copyFile(source, new File("./ScreenShots/gmailLogin.png"))
//		 
//		System.out.println("Screenshot taken");
//		driver.close();
		
		Utility.TakeScreenShot(driver, "TypedUserName");
		
		
	}

}
