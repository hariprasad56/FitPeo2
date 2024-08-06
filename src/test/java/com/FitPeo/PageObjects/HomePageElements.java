package com.FitPeo.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FitPeo.TestCases.BaseTest;

public class HomePageElements {
	WebDriver driver;
	BaseTest bt;
	public HomePageElements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//button[@aria-label='open drawer']//*[name()='svg']")private WebElement optionicon;
	@FindBy(xpath="//span[normalize-space()='Revenue Calculator']")private WebElement revenueCalculator;
	
	public void getOptionIcon()
	{
		bt=new BaseTest();
		bt.waits(optionicon, 10);
		optionicon.click();	
		
	}
	public void revenueCalculator()
	{
		bt.waits(revenueCalculator, 10);
		revenueCalculator.click();	
		
	}

}
