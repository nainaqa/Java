package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\sel Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
        driver.findElement(By.xpath("html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input")).click();
        System.out.println(driver.switchTo().alert().getText());
        //driver.switchTo().alert().sendKeys("");
        driver.switchTo().alert().accept();//positive scenario
        //driver.switchTo().alert().dismiss();
	}

}
