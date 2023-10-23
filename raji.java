package mahi;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class raji {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.8.0\\sele\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	WebDriverManager.chromedriver().setup();
	ChromeOptions op=new ChromeOptions();
	op.addArguments("--remote-allow-origins=*");
	driver=new ChromeDriver(op);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	 String url="https://rahulshettyacademy.com/locatorspractice";
	//driver.navigate().to("https://rahulshettyacademy.com/locatorspractice");
	driver.get(url);
	//driver.getTitle();
	System.out.println(driver.getTitle());
	//driver.findElement(By.id("inputUsername")).sendKeys("Arya");
	driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("arya");
	driver.findElement(By.name("inputPassword")).sendKeys("ramya08");
	driver.findElement(By.className("signInBtn")).click();
		//Thread.sleep(5000);
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	driver.findElement(By.linkText("Forgot your password?")).click();
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Arya");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();
	driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("gnana3095@gmail.com");
	driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("9362738419");
	driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
	Thread.sleep(3000);
	System.out.println(driver.findElement(By.cssSelector("p.infoMsg")).getText());
	//driver.close();
	
	
	}
	

}