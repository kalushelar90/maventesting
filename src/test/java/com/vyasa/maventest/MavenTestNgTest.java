package com.vyasa.maventest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MavenTestNgTest {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\1_JAVA\\3_JavaPrograming\\TestNgDemo\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	}
	@Test
	public void verifyTitle() {
		String actuaTitle=	driver.getTitle();
		String expecteTitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		Assert.assertEquals(actuaTitle, expecteTitle);	
	}
	@AfterMethod
	public void close() {
	driver.quit();	
	}
}
