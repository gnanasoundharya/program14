package mahi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class hard01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.8.0\\sele\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 String url="https://rahulshettyacademy.com/locatorspractice";
		driver.get(url);
		String exp_title="Rahul Shetty Academy - Login Page";
		String act_title=driver.getTitle();
		Boolean bn=exp_title.equals(act_title);
		System.out.println(bn);
		Assert.assertNotNull(bn);
		Assert.assertEquals(act_title,exp_title);
		System.out.println("aray");

		
		
	}

}
