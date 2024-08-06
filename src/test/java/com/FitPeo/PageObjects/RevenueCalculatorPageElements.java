package com.FitPeo.PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FitPeo.TestCases.BaseTest;

public class RevenueCalculatorPageElements {
	public WebDriver driver;
	// BaseTest bt;
	 
	public RevenueCalculatorPageElements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//span[@style='left:10%']")private WebElement left;
	@FindBy(xpath="//input[@id=':R57alklff9da:']")private WebElement sliderTextField;
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[2]/div[1]/label[1]/span[1]/input[1]")private WebElement checkbox9091;
	@FindBy(xpath="//div[@class='MuiBox-root css-1p19z09']//div[2]//label[1]//span[1]//input[1]")private WebElement checkbox9453;
	@FindBy(xpath="//div[3]//label[1]//span[1]//input[1]")private WebElement checkbox9454;
	@FindBy(xpath="//div[8]//label[1]//span[1]//input[1]")private WebElement checkbox9474;
	@FindBy(xpath="//div[@class='MuiBox-root css-m1khva']//p[2]")private WebElement totalRecurringReimValue;
	@FindBy(xpath="//span[@style='left: 0%; width: 28%;']")private WebElement sliderAtPartPoint;
	public void getleftSlider()
	{
		//bt=new BaseTest();	
		BaseTest.waits(left, 30);
		int xDValue=174;
		int xLoc=left.getLocation().getX();
		int yLoc=left.getLocation().getY();
		int val=left.getSize().getWidth();
		BaseTest.actionsDD(driver, left, xLoc+val, yLoc);
		
		
	}
	
	public void getSliderTextField(String value)
	{
		BaseTest.waits(sliderTextField, 60);
		sliderTextField.clear();
		sliderTextField.sendKeys(value);
		
	}
	

	public void getCheckBox9091()
	{
		//BaseTest.waits(checkbox9091, 20);
		checkbox9091.click();
	}

	public void getcheckbox9453()
	{
		//BaseTest.waits(checkbox9453, 20);
		checkbox9453.click();
	}

	public void getcheckBox9454()
	{
		//BaseTest.waits(checkbox9454, 20);
		checkbox9454.click();
	}

	public void getcheckbox9474()
	{
		//BaseTest.waits(checkbox9474, 20);
		checkbox9474.click();
		
	}

	public String getTotalRecurringReimValue()
	{
		BaseTest.waits(totalRecurringReimValue, 30);
		String reValue=totalRecurringReimValue.getText();
		return reValue;
	
	}
	public int getSliderAtPartPoint()
	{
		BaseTest.waits(sliderAtPartPoint, 30);
		int xValueAtPP=sliderAtPartPoint.getLocation().getY();
		
		int xwidth=sliderAtPartPoint.getSize().getWidth();
		return xValueAtPP;
	}
	public int getSliderAtPartPoint1()
	{
		BaseTest.waits(sliderAtPartPoint, 30);
		
		int xwidth=sliderAtPartPoint.getSize().getWidth();
		return xwidth;
	}
	
	 public void scrollPaticularE()
	 {
		 try
		 {
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", left);
		 }
		 catch(Exception e)
		 {
			 System.out.println("move to next step");
		 }
	 }
	 public void scrollFurther()
	 {
		 try
		 {
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", checkbox9091);
		 }
		 catch(Exception e)
		 {
			 System.out.println("move to next step");
		 }
	 }
	 public void scrollFurther1()
	 {
		 try
		 {
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", sliderTextField);
		 }
		 catch(Exception e)
		 {
			 System.out.println("move to next step");
		 }
	 }
	 public void scrollFurther2()
	 {
		 try
		 {
		 JavascriptExecutor js =(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", sliderTextField);
		 }
		 catch(Exception e)
		 {
			 System.out.println("move to next step");
		 }
	 }

}
