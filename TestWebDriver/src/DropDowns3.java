import java.util.List;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

//import junit.framework.Assert;

public class DropDowns3 
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
	
	List<WebElement> month_list = month.getOptions();
	int total_no_months = month_list.size();
	System.out.println("Total months in dropdown "+ total_no_months);
	
	Assert.assertEquals(total_no_months, 13);
	System.out.println("Months are:");
	for(WebElement ele : month_list) {
		String name= ele.getText();
		System.out.println( name);
		
	}
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
 