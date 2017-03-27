package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.FileUtils;



public class ScreenShot {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com/");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		
		FileUtils.copyFile(scrFile, new File("C:\\Users\\laxmiprasanna\\Documents\\Mock Interview\\screenshot.png"));
	}

}
