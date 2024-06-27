package com.Homefleet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.Homefleet.Utils.Browser;
import com.Homefleet.Utils.DataConfi;
import com.Homefleet.Utils.PropertyReader;

public class PropertyListPage 
{
WebDriver driver;	
 public PropertyListPage(WebDriver driver)
 {
	 this.driver=driver;	 
 }
 public void propertylist() throws Exception
	{
		String propertylist=PropertyReader.getLocater("PropertyList", "propertylisting");
		By propertylistl=By.xpath(propertylist);
		WebElement propertylistL=driver.findElement(propertylistl);
		propertylistL.isDisplayed();
		String data=propertylistL.getText();
		System.out.println(data);
//		action= new Actions(driver);
//		action.click(propertylistL);
		//action.doubleClick(propertylistL);
		 propertylistL.click();
		//Browser.Waitmethod(propertylistL);
		//driver.navigate().back();
	}
	public void isdisplaytextmsgoftitle() throws Exception
	{
		String propertytitle=PropertyReader.getLocater("PropertyList", "propertytext");
		By propertytitlel=By.xpath(propertytitle);
		WebElement propertytitleL=driver.findElement(propertytitlel);
		propertytitleL.isDisplayed();
		String text=propertytitleL.getText();
		System.out.println("property list text ="+text);
		Assert.assertEquals(text, "Property listings","test case pass");	
	}
	public void clickonproperty() throws Exception
	{
		String clickonproperty=PropertyReader.getLocater("PropertyList", "clickOnProperty");
		By clickonpropertyl=By.xpath(clickonproperty);
		WebElement clickonpropertyL=driver.findElement(clickonpropertyl);
		clickonpropertyL.isDisplayed();
		clickonpropertyL.click();
		Thread.sleep(2000);
	}
	public void isdisplaySnapshottextAndValidateOfDetails() throws Exception
	{
		String isdisplayhighlights=PropertyReader.getLocater("PropertyList", "snapshot");
		By isdisplayhighlightl=By.xpath(isdisplayhighlights);
		WebElement isdisplayhighlightL=driver.findElement(isdisplayhighlightl);
		Browser.scrolldown(isdisplayhighlightL);
		String snapshottext=PropertyReader.getLocater("PropertyList", "isdisplaySnapshottext");
		By snapshottextl=By.xpath(snapshottext);
		WebElement snapshottextL=driver.findElement(snapshottextl);
		if(snapshottextL.isDisplayed())
		{
			String snaptext=snapshottextL.getText();
			System.out.println("snaptext ="+snaptext);
			Assert.assertEquals(snaptext,DataConfi.validatetosnapshotText,"test case pass");
			Thread.sleep(2000);
		    String towers=PropertyReader.getLocater("PropertyList", "isdisplaytowers");
			By towerstext=By.xpath(towers);
			WebElement towerstexl=driver.findElement(towerstext);
			if(towerstexl.isDisplayed())
			{
			String text=towerstexl.getText();
			System.out.println("towertext="+text);
			Assert.assertEquals(text,DataConfi.validatetotowers,"test case is pass");
			String towersdetails=PropertyReader.getLocater("PropertyList", "towersdetails");
			By towersdetailsl=By.xpath(towersdetails);
			WebElement towersdetailsL=driver.findElement(towersdetailsl);
			towersdetailsL.isDisplayed();
			String textl=towersdetailsL.getText();
			System.out.println("towerdetails="+textl);
			Assert.assertEquals(textl,DataConfi.validatetotowersdeatils,"test case is pass");
			Thread.sleep(2000);
			}
			
			String units=PropertyReader.getLocater("PropertyList", "isdisplayuinits");
			By unitsl=By.xpath(units);
			WebElement unitsL=driver.findElement(unitsl);
			if(unitsL.isDisplayed())
			{
				String unittext=unitsL.getText();
				System.out.println("unit text ="+unittext);
				Assert.assertEquals(unittext,DataConfi.validatetoUnitstext,"test case is pass");
				Thread.sleep(2000);
				String unitsdetails=PropertyReader.getLocater("PropertyList", "unitdetials");
				By unitsdetail=By.xpath(unitsdetails);
				WebElement unitsdetailL=driver.findElement(unitsdetail);
				unitsdetailL.isDisplayed();
				String textdata=unitsdetailL.getText();
				System.out.println("units details ="+textdata);
				Assert.assertEquals(textdata, DataConfi.validatetoUnitsdetaisl,"test case pass");

			}	
			
			String unitsfacing=PropertyReader.getLocater("PropertyList", "isdipslayunitfacing");
			By unitsfacingl=By.xpath(unitsfacing);
			WebElement unitsfacinglL=driver.findElement(unitsfacingl);
			if(unitsfacinglL.isDisplayed())
			{
				String unitsfacingtext=unitsfacinglL.getText();
				System.out.println("unit facing text="+unitsfacingtext);
				Assert.assertEquals(unitsfacingtext,DataConfi.validatetoUnitsfacingtext,"test case pass");
				Thread.sleep(2000);
				String unitsfacingtextl=PropertyReader.getLocater("PropertyList", "unitfacingdetails");
				By unitsfacingtextL=By.xpath(unitsfacingtextl);
				WebElement unitsfacingtextlL=driver.findElement(unitsfacingtextL);
     			String unitsfacingtexts=unitsfacingtextlL.getText();
     			System.out.println("unit facing details "+unitsfacingtexts);
     			Assert.assertEquals(unitsfacingtexts,DataConfi.validatetoUnitsfacingdetails,"test case pass");
					
			}
			String unitsizerange=PropertyReader.getLocater("PropertyList", "isdisplayunitsizerange");
			By unitsizerangel=By.xpath(unitsizerange);
			WebElement unitsizerangeL=driver.findElement(unitsizerangel);
			if(unitsizerangeL.isDisplayed())
			{
				String Unitsizerangetex=unitsizerangeL.getText();
				System.out.println("unit size range text="+Unitsizerangetex);
				Assert.assertEquals(Unitsizerangetex,DataConfi.validatetoUnitsizetext,"test case pass");
				Thread.sleep(2000);
				String unitsizerangedetaill=PropertyReader.getLocater("PropertyList", "unitsizedetials");
				By unitsizerangedetaillL=By.xpath(unitsizerangedetaill);
				WebElement unitsizerangedetaills=driver.findElement(unitsizerangedetaillL);
     			String unitsizerangedetailltext=unitsizerangedetaills.getText();
     			System.out.println("unit size range details="+unitsizerangedetailltext);
     			Assert.assertEquals(unitsizerangedetailltext,DataConfi.validatetoUnitsizedetails,"test case pass");
					
			}
			String Bedroom=PropertyReader.getLocater("PropertyList", "isdisplayBedrooms");
			By Bedrooml=By.xpath(Bedroom);
			WebElement BedroomL=driver.findElement(Bedrooml);
			if(BedroomL.isDisplayed())
			{
				String bedroomt=BedroomL.getText();
				System.out.println("Bedroom text="+bedroomt);
				Assert.assertEquals(bedroomt,DataConfi.validatetobedroomtext,"test case pass");
				Thread.sleep(2000);
				String bedroomdetials=PropertyReader.getLocater("PropertyList", "bedroomdetials");
				By bedroomdetialsl=By.xpath(bedroomdetials);
				WebElement bedroomdetialslL=driver.findElement(bedroomdetialsl);
     			String bedroomdetialslt=bedroomdetialslL.getText();
     			System.out.println("Bedroom details ="+bedroomdetialslt);
     			Assert.assertEquals(bedroomdetialslt,DataConfi.validatetobedroomdetails,"test case pass");	
			}
			String launchadate=PropertyReader.getLocater("PropertyList", "isdisplayLaunchdate");
			By launchadatel=By.xpath(launchadate);
			WebElement launchadateL=driver.findElement(launchadatel);
			if(launchadateL.isDisplayed())
			{
				String launchdate=launchadateL.getText();
				Assert.assertEquals(launchdate,DataConfi.validatetolaunchdatetext,"test case pass");
				Thread.sleep(2000);
				String launchdetals=PropertyReader.getLocater("PropertyList", "lanuchdetails");
				By launchdetalsl=By.xpath(launchdetals);
				WebElement launchdetalsL=driver.findElement(launchdetalsl);
     			String launchdetaltext=launchdetalsL.getText();
     			Assert.assertEquals(launchdetaltext,DataConfi.validatetolaunchdatedetails,"test case pass");
				
			}
			String possiseoandate=PropertyReader.getLocater("PropertyList", "isdisplayPossessiondate");
			By possiseoandatel=By.xpath(possiseoandate);
			WebElement possiseoandateL=driver.findElement(possiseoandatel);
			if(possiseoandateL.isDisplayed())
			{
				String posidate=possiseoandateL.getText();
				Assert.assertEquals(posidate, DataConfi.validatetoPossessiondatetext,"test case pass");
				Thread.sleep(2000);
				String possiseoandatedetails=PropertyReader.getLocater("PropertyList", "possessiondatedetails");
				By possiseoandatedetailsl=By.xpath(possiseoandatedetails);
				WebElement possiseoandatedetailslL=driver.findElement(possiseoandatedetailsl);
     			String posidetals=possiseoandatedetailslL.getText();
     			Assert.assertEquals(posidetals, DataConfi.validatetoPossessiondatedetails,"test case pass");
				
			}
			String LandSize=PropertyReader.getLocater("PropertyList", "isdisplaylandsize");
			By LandSizel=By.xpath(LandSize);
			WebElement LandSizeL=driver.findElement(LandSizel);
			if(LandSizeL.isDisplayed())
			{
				String landtext=LandSizeL.getText();
			    Assert.assertEquals(landtext,DataConfi.validatetoLandsizetext,"test case pass");
			    String LandSizedetails=PropertyReader.getLocater("PropertyList", "landsizedetails");
				By LandSizedetailsl=By.xpath(LandSizedetails);
				WebElement LandSizedetailslL=driver.findElement(LandSizedetailsl);
				LandSizedetailslL.isDisplayed();
				String landdetails=LandSizedetailslL.getText();
				Assert.assertEquals(landdetails,DataConfi.validatetoLandsizedetails,"test case pass" );
			}
		
		else
		{
			System.out.println("test case is fail");	
		}		
	}
	}
	public void clickonHighlightsSection() throws Exception
	{
		String hightlights=PropertyReader.getLocater("PropertyList", "highlights");
		By highlightsl=By.xpath(hightlights);
		WebElement highlightsL=driver.findElement(highlightsl);
		highlightsL.isDisplayed();
		String hightext=highlightsL.getText();
		System.out.println(hightext);
	
		Assert.assertEquals(hightext,DataConfi.validatetohighlightstext,"test case pass");
		highlightsL.click();
	}
	public void clickonAmenitiesSection() throws Exception
	{
		String Amenitesl=PropertyReader.getLocater("PropertyList", "amenities");
		By AmenitesL=By.xpath(Amenitesl);
		WebElement AmenitestextL=driver.findElement(AmenitesL);
		AmenitestextL.isDisplayed();
		String aneniteis=AmenitestextL.getText();
		System.out.println(aneniteis);
		Assert.assertEquals(aneniteis,DataConfi.validatetoamenitiestxt,"test case pass");
		AmenitestextL.click();
		
		
	}
	public void clickonfloorplanSection() throws Exception
	{
		String floorplan=PropertyReader.getLocater("PropertyList", "plans");
		By floorplanl=By.xpath(floorplan);
		WebElement floorplanL=driver.findElement(floorplanl);
		floorplanL.isDisplayed();
		String floorpla=floorplanL.getText();
		System.out.println(floorpla);
		floorplanL.click();
		
	}
	public void clickSpecfificationSection() throws Exception
	{
		String specfi=PropertyReader.getLocater("PropertyList", "specifications");
		By specfil=By.xpath(specfi);
		WebElement specfilL=driver.findElement(specfil);
		specfilL.isDisplayed();
		String specifitext=specfilL.getText();
		System.out.println(specifitext);
		specfilL.click();
		
	}
	
	public void clickonNearbySection() throws Exception
	{
		String Nearby=PropertyReader.getLocater("PropertyList", "nearby");
		By Nearbyl=By.xpath(Nearby);
		WebElement NearbylL=driver.findElement(Nearbyl);
		NearbylL.isDisplayed();
		String nearby=NearbylL.getText();
		System.out.println(nearby);
		NearbylL.click();
	}
	public void clickonLocationSection() throws Exception
	{
		String location=PropertyReader.getLocater("PropertyList", "location");
		By locationl=By.xpath(location);
		WebElement locationL=driver.findElement(locationl);
		locationL.isDisplayed();
		String locationtex=locationL.getText();
		System.out.println(locationtex);
		locationL.click();
	}
	}
