package com.adacitin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\adacitin\\feature\\Adacitin.feature",
					glue="com.adacition.sd"
					
					//monochrome=true
					//dryRun=false,
					//publish=true,
					//plugin= {"html:target/cucumber-report.html","pretty"}

		)

public class Runner_class {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void start() {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
	driver = new ChromeDriver(op);
		
	}
	
	@AfterClass
	public static void end() {
		
		driver.quit();
	}
	
	
	

}
