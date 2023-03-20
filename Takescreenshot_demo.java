package com.sel;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshot_demo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shahul\\eclipse-workspace\\seleniumwork\\Driver\\chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Alerts.html");
	    
	    TakesScreenshot s =(TakesScreenshot)driver;
	    File F1=s.getScreenshotAs(OutputType.FILE);
	    File f= new File("C:\\Users\\Shahul\\eclipse-workspace\\seleniumwork\\screenshot\\automation.png");
	    FileHandler.copy(F1, f);
	    
	    
	    
	
	
	
	}

}
