package com.class29;

public class Test {

	public static void main(String[] args) {
		
		Webdriver driver = new ChromeDriver();
		driver.closeDrier();
		driver.execute();
		driver.findElement();
		driver.m2();
		driver.maximizeWindow();
		driver.openBrowser();
		driver.takeScreen();
		
		TakeScreenshot.m1();
		System.out.println("------------------------------------------");
		
		driver = new FirefoxDriver();
		driver.closeDrier();
		driver.execute();
		driver.findElement();
		driver.m2();
		driver.maximizeWindow();
		driver.openBrowser();
		driver.takeScreen();

	}

}
