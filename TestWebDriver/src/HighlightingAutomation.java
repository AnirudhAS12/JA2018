
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Library.UtilityHighlight;

public class HighlightingAutomation {

public static void main(String []args)
{
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	 System.setProperty("webdriver.chrome.driver", "D:\\jlt\\drivers\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver(options);
	 driver.manage().window().maximize();

	 driver.get("http://www.facebook.com");
	 WebElement username = driver.findElement(By.xpath(".//*[@id='email']"));
	 UtilityHighlight.highLightElement(driver, username);
	 username.sendKeys("anirudhas006@gmail.com");
	 System.out.println("Successfully entered username");
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 
	 WebElement password  = driver.findElement(By.xpath(".//*[@id='pass']"));
	 UtilityHighlight.highLightElement(driver, password);
	 password.sendKeys("one2three4five");
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 System.out.println("Successfully entered password");
	 
	 WebElement Login = driver.findElement(By.xpath(".//*[@id='u_0_2']"));
	 UtilityHighlight.highLightElement(driver, Login);
	 Login.click();
	 System.out.println("Successfully logged in");
	 
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 WebElement dropdown = driver.findElement(By.id("userNavigationLabel"));
	 UtilityHighlight.highLightElement(driver, dropdown);
	 dropdown.click();
	 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 System.out.println("Successfully navigating to logout");
	 
	 WebElement Logout = driver.findElement(By.xpath(".//*[@class='_54nh' and text()='Log Out']"));
	 UtilityHighlight.highLightElement(driver, Logout);
	 Logout.click();
	 System.out.println("Successfully logged out");
	 //	 
//	 
//	 
 
}
}