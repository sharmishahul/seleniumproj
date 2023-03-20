package com.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Proj_day2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shahul\\eclipse-workspace\\seleniumwork\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.navigate().to("https://www.flipkart.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.navigate().back();
		Thread.sleep(3000);
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		
		String title3 = driver.getTitle();
		System.out.println(title3);
		
		String currentUrl3 = driver.getCurrentUrl();
		System.out.println(currentUrl3);
		Thread.sleep(3000);
		driver.navigate().refresh();
		
		
		

	}

}
