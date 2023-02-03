package Selenium_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Google {
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 
	 WebDriver driver = new ChromeDriver();

	 driver.get("http://www.google.co.in");
	 
	 driver.findElement(By.name("q")).sendKeys("Java"+Keys.ENTER);
	 
	} 
}
