import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFacebookRegistration {
	
	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "D:\\jlt\\drivers\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		String title = driver.getTitle();
		boolean value=title.contains("Facebook – log in or sign up");
		System.out.println("status value is"+value);
		
		driver.findElement(By.xpath(".//*[@id='u_0_j']")).sendKeys("Anirudh");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(".//*[@id='u_0_a']")).click();
		Thread.sleep(3000);
		
		Select sel1 = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		sel1.selectByVisibleText("Jul");
		Thread.sleep(3000);
		Select sel2 = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		sel2.selectByValue("12");
		Thread.sleep(2000);
		
		Select sel3 = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		sel3.selectByValue("1995");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='reg_pages_msg']")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath(".//@[@id='u_0_11']")).click();
		driver.navigate().back();

	}
}
