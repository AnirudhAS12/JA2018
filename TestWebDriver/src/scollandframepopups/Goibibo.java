package scollandframepopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\jlt\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(
				"https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_content=Only%20Goibibo&campaign=DF-Brand-EM&gclid=EAIaIQobChMIzfy6i8_23AIV2TUrCh3u0Q3_EAAYASAAEgJuUPD_BwE");

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// js.executeScript("window.scrollBy(0,-500)");

		// js.executeScript("scroll(0,400)");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// System.out.println("Scrolled first time");
		//
		// js.executeScript("scroll(0,800)");
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// System.out.println("Scrolled second time");

		// ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// System.out.println("Scrolled third time");
		//
		// ((JavascriptExecutor)driver).executeScript("scroll(0,-400)");
		// driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		// System.out.println("Scrolled up 1st time");
		driver.findElement(By.xpath(".//*[@id='get_sign_up']")).click();
		//
		driver.switchTo().frame("authiframe");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='authMobile']")).sendKeys("8892941856");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='mobileSubmitBtn']")).click();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='authCredentialRequestOtpBtn']")).click();
		//
		//

	}

}
