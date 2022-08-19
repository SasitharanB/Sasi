package Seleniumtrainday1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		 
			System.setProperty("webdriver.msedge.driver",
					"C:\\Users\\sasitharanb\\eclipse-workspace\\Sasi\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
				  driver.get("https://demoqa.com/alerts");
				  driver.findElement( By.id("alertButton")).click();
				  Thread.sleep(3000);
				  driver.switchTo().alert().accept();
				  driver.findElement( By.id("timerAlertButton")).click();
				  Thread.sleep(6000);
				  driver.switchTo().alert().accept();
				  driver.findElement( By.id("confirmButton")).click();
				  Thread.sleep(2000);
				  driver.switchTo().alert().dismiss();
				  driver.findElement( By.id("promtButton")).click();
				  Thread.sleep(2000);
				  Alert alert = driver.switchTo().alert();
				  alert.sendKeys("sasi");
				  alert.accept();
				  
				  
		}
				 
	}


