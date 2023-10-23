package assingment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\selenium-java-4.8.0\\sele\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
 //driver.navigate().to("https://www.blinkist.com/en/nc/books");
// driver.findElement(By.name("login[email]")).sendKeys("gnanasoundharyas@gmail.com");
 //driver.findElement(By.id("login-popup_login_password")).sendKeys("ramya95@Sound");

//driver.navigate().to("https://www.amazon.in");
String url="https://www.amazon.in";
driver.get(url);
driver.manage().window().maximize();//to max
driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();//hello,singin
//driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).isDisplayed();//dropdown list
//driver.findElement(By.className("nav-action-inner")).click();//button singin 
driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9362738419");//mailid or mobile no
driver.findElement(By.xpath("//input[@id='continue']")).click();//continue button
driver.findElement(By.id("ap_password")).sendKeys("ramya95@Sound");//password
//driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();//sign button
//driver.findElement(By.id("ap_change_login_claim")).click();//change(not taken)
driver.findElement(By.id("auth-fpp-link-bottom")).click();//forgot passward(not taken);
Thread.sleep(6000);
driver.close();







	}

}
