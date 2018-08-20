package scollandframepopups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollintoViewGoIbibo {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\jlt\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get(
				"https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_content=Only%20Goibibo&campaign=DF-Brand-EM&gclid=EAIaIQobChMIzfy6i8_23AIV2TUrCh3u0Q3_EAAYASAAEgJuUPD_BwE");

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		JavascriptExecutor je = (JavascriptExecutor) driver;
 		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.xpath(".//*[@class='orange ico12 fr']"));

		je.executeScript("arguments[0].scrollIntoView(true);", element);
		
		WebDriverWait wait = new WebDriverWait(driver, 100);
 		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		element.click();

		System.out.println(element.getText());

	}

}
