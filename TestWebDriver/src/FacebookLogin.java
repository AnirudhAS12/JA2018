import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {

	public static void main(String[] args)  {

//		FirefoxDriver firefoxdriver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\jlt\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println("The title of webpage is "+ driver.getTitle());

		
		WebElement text = driver.findElement(By.id("email"));
//		System.out.println("textbox for email is "+text.getText());
		text.sendKeys("anirudhas006@gmail.com");

		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("one2three4five");

		
		WebElement submit = driver.findElement(By.id("u_0_3"));
		submit.click();

		driver.close();
	}

}
