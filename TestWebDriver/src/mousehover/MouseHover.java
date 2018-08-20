package mousehover;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\jlt\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		
		WebElement ele = driver.findElement(By.xpath(".//*[@class='dropbtn' and text()='Automation Tools']"));
		
		Actions act =new Actions(driver);
		
		act.moveToElement(ele).perform();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		List<WebElement> links = driver.findElements(By.xpath(".//*[@class='dropdown-content']//a"));
		
		for(WebElement link : links ) {
			String linkname = link.getText();
			System.out.println(linkname);
			
			if(linkname.equalsIgnoreCase("TestNG")) {
				link.click();
				System.out.println("Clicked and link working");
				break;
			}
			else {
				System.out.println("not testing that link "+linkname);
			}
		}
		
		
	}

}
