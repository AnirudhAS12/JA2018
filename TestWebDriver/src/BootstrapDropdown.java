import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\jlt\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/bootstrap-dropdown-example-for-selenium.html?_sm_au_=iVVM73WN6PF2FJSs");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='menu1']")).click();
		
		List<WebElement> dropdown = driver.findElements(By.xpath(".//*[@class='dropdown-menu']//li/a"));
		
		System.out.println("Items in the dropdown :");
		for(WebElement dd :dropdown ) {
//			String items = dd.getText();
			String items = dd.getAttribute("innerHTML");
			
			if(items.contentEquals("JavaScript")) {
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				dd.click();
				break;
			}
			System.out.println(items);
		}
		Thread.sleep(4000);
		

	}

}
