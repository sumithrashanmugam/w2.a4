package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Html {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
	    driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		System.out.println("the title of this page is"+driver.getTitle());
		System.out.println("the Url is: " + driver.getCurrentUrl());
		System.out.println("the source" + "is"+driver.getPageSource());
        driver.findElement(By.id("email")).sendKeys("ss123@gmail.com");
        System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
}
}