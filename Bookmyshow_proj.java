package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookmyshow_proj {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shahul\\eclipse-workspace\\seleniumwork\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://in.bookmyshow.com/explore/home/chennai");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@alt='Dada']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[text()='Book tickets']")).click();
	driver.findElement(By.xpath("//*[@class='showtime-pill']")).click();
    driver.findElement(By.id("btnPopupAccept")).click();
    Thread.sleep(2000);
   
    driver.findElement(By.id("proceed-Qty")).click();
   
    driver.findElement(By.xpath("//a[@class='_available']")).click();
	}

}
