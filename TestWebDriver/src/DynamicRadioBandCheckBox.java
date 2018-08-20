import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicRadioBandCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\jlt\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html?_sm_au_=iVVM73WN6PF2FJSs");
		
		List<WebElement> radio = driver.findElements(By.xpath(".//*[@name='lang' and @type='radio']"));
		
		for(WebElement ele : radio) {
			String names = ele.getAttribute("value");
	
			System.out.println(names);
			
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			if(names.equalsIgnoreCase("Python")) {
				ele.click();
//				break;
			}

		}
		
		List<WebElement> checkbox = driver.findElements(By.xpath(".//*[@type='checkbox' and @name='lang']"));
		for(WebElement cb : checkbox) {
			String vals = cb.getAttribute("id");
			System.out.println(vals);
			
			if(vals.contentEquals("code")) {
				cb.click();
				break;
			}
		}
		

	}

}
