package com.project;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class mavenExamples1 {
	WebDriver driver;
	
	@Test
	public void mevantest() {
		
//	    System.setProperty("webdriver.chrome.driver","C:\\Users\\aboba\\Documents\\IT Class\\Testing Class Note\\Drivers\\chromedriver.exe");
//		 driver = new ChromeDriver();
//		 driver.get("http://www.google.com");
		
		
		System.setProperty("phantomjs.binary.path","C:\\Users\\aboba\\Documents\\IT Class\\Testing Class Note\\Drivers\\phantomjs-2.1.1-windows\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		WebDriver driver = new PhantomJSDriver();
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//a[contains(.,'Gmail')]")).click();
		
		
		
		
		String title = driver.getCurrentUrl();
		System.out.println(title);
	}
	

}
