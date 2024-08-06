package com.FitPeo.TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.FitPeo.PageObjects.HomePageElements;
import com.FitPeo.PageObjects.RevenueCalculatorPageElements;

public class VerifyRevenueCalculatorPage extends BaseTest {
	SoftAssert sf;
	@Test()
	public void validateRevenueCalculator() throws IOException
	{
		
		HomePageElements hpe=new HomePageElements(driver);
		hpe.getOptionIcon();
		hpe.revenueCalculator();
	    String actualTitle=driver.getTitle();
		String expTitle="Remote Patient Monitoring (RPM) - fitpeo.com";
		 sf=new SoftAssert();
	    if(expTitle.equals(actualTitle))
		{
			
			sf.assertTrue(true);
			log.info("Revenue calculator is sucessfully opened");
			
		}
		sf.assertAll();
		RevenueCalculatorPageElements rcpe=new RevenueCalculatorPageElements(driver);
		rcpe.scrollPaticularE();
//		try
//		{
//    	rcpe.getleftSlider();
//		}catch(Exception e)
//		{
//			System.out.println("move to next.......");
//		}
		String desiredValue="560";
		rcpe.getSliderTextField(desiredValue);
		int valueAtpp=rcpe.getSliderAtPartPoint();
		int valuew=rcpe.getSliderAtPartPoint1();
		String valueAtp=String.valueOf(valuew);
		String valueAtPPS=String.valueOf(valueAtpp);
		System.out.println(valueAtPPS+valueAtp);
		if(desiredValue.equalsIgnoreCase(valueAtPPS))
		{
			sf.assertTrue(true);
			log.info("test is pass");
		}
		else
		{
			sf.assertTrue(false);
			log.info("test is fail");
			takeScreenshot("VerifyRevenueCalculatorPage");
		}
		sf.assertAll();
		String div="820";
		rcpe.getSliderTextField(div);
		rcpe.scrollFurther();
		rcpe.getCheckBox9091();
		rcpe.getcheckbox9453();
		rcpe.getcheckBox9454();
		rcpe.getcheckbox9474();
		rcpe.scrollFurther1();
		String actualReimValue=rcpe.getTotalRecurringReimValue();
		System.out.println(actualReimValue);
		String estiReimValue="$110700";
		if(estiReimValue.equalsIgnoreCase(actualReimValue))
		{
			sf.assertTrue(true);
			log.info("test is pass");
			
		}
		else
		{
			sf.assertTrue(false);
			log.info("test is fail");
			takeScreenshot("VerifyRevenueCalculatorPage");
			
		}
		sf.assertAll();
		
		
		
	}

}
