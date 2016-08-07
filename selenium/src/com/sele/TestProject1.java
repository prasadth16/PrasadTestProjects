package com.sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestProject1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// initiate browser
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");

		driver.navigate().back();
		driver.quit();
		

	}

}
