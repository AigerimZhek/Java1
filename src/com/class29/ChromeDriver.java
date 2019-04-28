package com.class29;

public class ChromeDriver extends Browser implements Webdriver, Report{

	@Override
	public void openBrowser() {
		System.out.println("Opening Chrome browser");	
	}

	@Override
	public void closeDrier() {
		System.out.println("Closing Chrome browser");	
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Maximizing Chrome window");	
		
	}

	@Override
	public void findElement() {
		System.out.println("Find element in Chrome browser");	
		
	}
	

	@Override
	public void refreshBrowser() {
		System.out.println("Refresh Chrome browser");
		
	}

	@Override
	public void getReport() {
		System.out.println("Report from Chrome browser");
		
	}

	@Override
	public void takeScreen() {
		System.out.println("Taking screenshot in Chrome browser");
		
	}

	@Override
	public void execute() {
		System.out.println("Executing codes in Chrome browser");
		
	}
}
