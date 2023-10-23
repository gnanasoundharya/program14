package mahi;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.8.0\\sele\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 String url="https://rahulshettyacademy.com/locatorspractice";
		//driver.navigate().to("https://rahulshettyacademy.com/locatorspractice");
		driver.get(url);
		WebElement web=driver.findElement(By.id("inputUsername"));
		if(web.isEnabled()==true)
				{
			web.sendKeys("Arya");
				}
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i =0; i<links.size(); i++)
		{
			System.out.println(links.get(i).getText());
		}
		
		
		
	}

}
