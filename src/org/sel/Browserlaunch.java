package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\Selenium\\driv\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://touch.facebook.com/?_rdr");
	}

}
