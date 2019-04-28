package com.class29;

public class FirefoxDriver extends Browser implements Webdriver, Report{

		@Override
		public void openBrowser() {
			System.out.println("Opening Firefox browser");	
		}

		@Override
		public void closeDrier() {
			System.out.println("Closing Firefox browser");	
		}

		@Override
		public void maximizeWindow() {
			System.out.println("Maximizing Firefox window");	
			
		}

		@Override
		public void findElement() {
			System.out.println("Find element in Firefox browser");	
			
		}

		@Override
		public void refreshBrowser() {
			System.out.println("Refresh Firefox browser");
			
		}

		@Override
		public void getReport() {
			System.out.println("Report from Firefox browser");
			
		}

		@Override
		public void takeScreen() {
			System.out.println("Taking screenshot in Firefox browser");
			
		}

		@Override
		public void execute() {
			System.out.println("Executing codes in Firefox browser");
			
		}
}
