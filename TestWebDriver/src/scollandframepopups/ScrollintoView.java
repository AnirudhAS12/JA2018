package scollandframepopups;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollintoView {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\jlt\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");

		JavascriptExecutor je = (JavascriptExecutor) driver;

		WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));

		je.executeScript("arguments[0].scrollIntoView(true);", element);

		System.out.println(element.getText());

	}

}
