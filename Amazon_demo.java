package com.sel;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_demo {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shahul\\eclipse-workspace\\seleniumwork\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//WebElement spring = driver.findElement(By.id("twotabsearchtextbox"));
		
        //Actions act =new Actions(driver);
        
		//act.keyDown(spring,Keys.SHIFT ).sendKeys("mobile").build().perform();
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_WINDOWS);
		r.keyPress(KeyEvent.VK_PRINTSCREEN);
		r.keyRelease(KeyEvent.VK_WINDOWS);
		r.keyRelease(KeyEvent.VK_PRINTSCREEN);
	
	
		

	}

}
