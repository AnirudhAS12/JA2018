package mousehover;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NotClickable {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\jlt\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.yahoo.com");
		
		driver.findElement(By.id("login-username")).sendKeys("anirudh.a.s@yahoo.com");
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement checkbox = driver.findElement(By.xpath(".//*[@for='persistent']"));
		act.moveToElement(checkbox).click().build().perform();
		System.out.println("Successfully unchecked the checkbox");
		
		
		
	}
}
