package org.brit;

import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Thulir {
	public static void main(String[] args) throws ParseException, InterruptedException,StaleElementReferenceException,ElementClickInterceptedException,ElementNotInteractableException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SakthiNathan\\eclipse-workspace\\SeleniumPractice\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://flpnwc-uqi0q4x7cc.dispatcher.hana.ondemand.com/sites/BIL-S4PRD#Home-show");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"j_username\"]")).sendKeys("thulir30737@gmail.com");;
		driver.findElement(By.xpath("//*[@id=\"j_password\"]")).sendKeys("Thulir@1010");
		driver.findElement(By.xpath("//*[@id=\"logOnFormSubmit\"]")).click();
		Thread.sleep(10000);
		Actions actions = new Actions(driver);
		
		WebElement reports = driver.findElement(By.xpath("//span[text()='Reports']"));
		actions.moveToElement(reports).perform();
		Thread.sleep(2000);
		//WebElement custprodt = driver.findElement(By.xpath("//div[@data-target-semanticobject='sscustprodwsqty']"));
		//actions.moveToElement(custprodt).click();
		
        //driver.findElement(By.xpath("//*[@id=\"__item8\"]")).click();;
		
		driver.findElement(By.xpath("//div[text()='Customer ProdWise Quantity']")).click();;
		Thread.sleep(4000);
        driver.findElement(By.xpath("//span[@id='__xmlview3--inputSODate-arrow']")).click();
	driver.findElement(By.xpath("//li[text()='Manual Selection']")).click();;
		
		
		
}}

