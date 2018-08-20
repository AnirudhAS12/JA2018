package Library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility {

	public static void TakeScreenShot(WebDriver driver, String ssname) {
		
		try {
	
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(source, new File("./ScreenShots/"+ssname+".png"));
		 
		System.out.println("Screenshot taken");
		driver.close();		
		}
		catch(Exception e) {
			System.out.println("There was an error while capturing" + e.getMessage());
		}
	}
	
	
}
