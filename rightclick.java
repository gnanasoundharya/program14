package mahi;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.8.0\\sele\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 String url="https://www.google.com";
		//driver.navigate().to("https://rahulshettyacademy.com/locatorspractice");
		driver.get(url);
		WebElement web=driver.findElement(By.linkText("Gmail"));
		//web.click();
		Actions act=new Actions(driver);
		act.contextClick(web).build().perform();		
		

	}

}
