package com.HomeFleets.TestScripts;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Homefleet.Utils.Browser;
import com.Homefleet.Utils.PropertyReader;
import com.Homefleet.pages.HomePage;
import com.Homefleet.pages.PropertyListPage;

public class PropertyListTest 
{
	
	WebDriver driver;
	PropertyListPage page;
	@BeforeMethod
	public void Setup() throws Exception
	{
		List<String> info = PropertyReader.getdataa("browser", 1);
		String browsername = info.get(0), drivername = info.get(1), url = info.get(2);
		driver = Browser.LanchBrowser(browsername, drivername);
		driver = Browser.openUrl(url);
	}
	@AfterMethod
	public void closebrowser()
	{
		//driver.close();
		//driver=Browser.closebrowser();
	}
	@Test
	public void VerifyTheFunctionalityOfPropertys() throws Exception
	{
		page=new PropertyListPage(driver);		
		page.propertylist();
		Thread.sleep(2000);
		page.isdisplaytextmsgoftitle();
		page.clickonproperty();
		page.isdisplaySnapshottextAndValidateOfDetails();
		page.clickonHighlightsSection();
		page.clickonAmenitiesSection();
		page.clickonfloorplanSection();
		page.clickSpecfificationSection();
		page.clickonNearbySection();
		page.clickonLocationSection();
		
		
	
		
	}

}
