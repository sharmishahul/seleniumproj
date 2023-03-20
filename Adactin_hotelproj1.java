package com.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin_hotelproj1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shahul\\eclipse-workspace\\seleniumwork\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("sharmishahul");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("shasha123!");
		
	    driver.findElement(By.id("login")).click();
	    
	    WebElement country = driver.findElement(By.tagName("select"));
	    Select s=new Select(country);
	    s.selectByValue("New York");
	    WebElement hotel = driver.findElement(By.name("hotels"));
	    Select h = new Select(hotel);
	    h.selectByIndex(2);
	    WebElement roomtype = driver.findElement(By.name("room_type"));
	    Select r =new Select(roomtype);
	    r.selectByIndex(2);
	    WebElement roomno = driver.findElement(By.name("room_nos"));
	    Select n = new Select(roomno);
	    n.selectByIndex(5);
	    
	    WebElement adult = driver.findElement(By.id("adult_room"));
	    Select ad =new Select(adult);
	    ad.selectByIndex(2);
	    WebElement childroom = driver.findElement(By.name("child_room"));
	    Select cr =new Select(childroom);
	    cr.selectByValue("4");
	    driver.findElement(By.name("Submit")).click();
	    driver.findElement(By.name("radiobutton_0")).click();
	    driver.findElement(By.name("continue")).click();
	    WebElement firstname = driver.findElement(By.id("first_name"));
	    firstname.sendKeys("sharmi");
	    WebElement lastname = driver.findElement(By.id("last_name"));
	    lastname.sendKeys("shahul");
	    WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("no.786,dubai cross street,dubai");
		WebElement ccnum = driver.findElement(By.id("cc_num"));
		ccnum.sendKeys("1234567899817652");
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select ct =new Select(cctype);
		ct.selectByValue("VISA");
		WebElement ccexp = driver.findElement(By.id("cc_exp_month"));
		Select ce =new Select(ccexp);
		ce.selectByVisibleText("August");
		WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));
		Select ey =new Select(expiryyear);
		ey.selectByValue("2014");
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("234");
		driver.findElement(By.id("book_now")).click();
		
		
		
		
		
		
	}

}
