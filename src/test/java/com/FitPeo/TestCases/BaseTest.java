package com.FitPeo.TestCases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	static WebDriver driver;
	public Logger log;
	SimpleDateFormat sdf;
	Date date;
	String dateformat;
	String Repname;
	@Parameters("browser")
	@BeforeClass
	public  void setup(String browser)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable notifications");
		options.setBinary("C:\\Users\\bobbi\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
//		DesiredCapabilities cp=new DesiredCapabilities();
//		cp.setCapability(ChromeOptions.CAPABILITY, options);
//		options.merge(cp);
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("WebDriver.chrome.driver", "C:\\Users\\bobbi\\Downloads\\chromedriver-win64(1)\\chromedriver-win64\\chromedriver.exe");
		    driver=new ChromeDriver(options);
		
		}else
		{
			//System.setProperty("WebDriver.gecko.driver", co.getfirefoxpath());
			driver=new FirefoxDriver();
		}
		
	
	     log=LogManager.getLogger("BaseTest.class");
	     DOMConfigurator.configure("Log4j.xml");
	     log.info("Enter the url");
	     driver.get("https://www.fitpeo.com/");
	     driver.manage().window().maximize();
	     

}
	 public void takeScreenshot(String tname) throws IOException
	   {
		   TakesScreenshot shot=(TakesScreenshot)driver;
		   File src=shot.getScreenshotAs(OutputType.FILE);
		   sdf=new SimpleDateFormat("dd-MM-YYYY,HH.mm.ss");
		   date=new Date();
		   dateformat=sdf.format(date);
		   Repname=tname+dateformat+".png";
		   File dst =new File(System.getProperty("user.dir")+"/Screenshots/"+Repname);
		   Files.copy(src, dst);
		
		  System.out.println("Screenshot taken");
	   }
	 
	 public static void waits(WebElement element,long time)
	 {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	 }
	 
	 public static void actionsDD(WebDriver driver,WebElement element,int xValue, int yValue)
		{
			Actions ac=new Actions(driver);
			ac.dragAndDropBy(element, xValue, yValue).perform();
		}
	 @AfterClass
		public  void teardown()
		{
			driver.quit();
		}
		
}
