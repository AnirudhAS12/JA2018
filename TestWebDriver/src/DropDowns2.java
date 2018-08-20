import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns2 
{
	@Test
	public void selectdropdownvalues() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "D:\\jlt\\drivers\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement month_dropdown =  driver.findElement(By.id("month"));
	Select month = new Select(month_dropdown);
	
	WebElement default_month = month.getFirstSelectedOption();
	System.out.println("Before clicking the selected value is "+default_month.getText() );
	
	month.selectByIndex(3);
	Thread.sleep(2000);
	
	WebElement selected_month = month.getFirstSelectedOption();
	System.out.println("After clicking the selected value is "+selected_month.getText() );
	
	month.selectByValue("10");
	Thread.sleep(2000);
	
	WebElement selected_month2 = month.getFirstSelectedOption();
	System.out.println("After clicking again the selected value is "+selected_month2.getText() );
	}
}
