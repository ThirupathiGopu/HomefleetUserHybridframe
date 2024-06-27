package com.Homefleet.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.Homefleet.Utils.Browser;
import com.Homefleet.Utils.PropertyReader;



public class HomePage 
{
	WebDriver driver;
	Actions action ;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void isdisplaytext() throws Exception
	{
		
		String textdata=PropertyReader.getLocater("Homepage", "logo");
		By textdatal=By.xpath(textdata);
		WebElement textdataL=driver.findElement(textdatal);
//		String data=textdataL.getText();
//		System.out.println(data);
		textdataL.click();
	}
			
	public void propertylist() throws Exception
	{
		String propertylist=PropertyReader.getLocater("Homepage", "propertylisting");
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
		String propertytitle=PropertyReader.getLocater("Homepage", "propertytext");
		By propertytitlel=By.xpath(propertytitle);
		WebElement propertytitleL=driver.findElement(propertytitlel);
		propertytitleL.isDisplayed();
		String text=propertytitleL.getText();
		System.out.println(text);
		Assert.assertEquals(text, "Property listings","test case pass");
		
	}
    public void blogs() throws Exception
    {
    	String blog=PropertyReader.getLocater("Homepage", "blog");
		By blogl=By.xpath(blog);
		WebElement blogL=driver.findElement(blogl);
		blogL.click();
		Browser.Waitmethod(blogL);
    }
    public void clickonVillas() throws Exception
    {
    	String Villas=PropertyReader.getLocater("Homepage", "villa");
		By Villasl=By.xpath(Villas);
		WebElement VillasL=driver.findElement(Villasl);
		VillasL.click();
		Browser.Waitmethod(VillasL);
    }
    
    public void clickonApartment() throws Exception
    {
    	String apartment=PropertyReader.getLocater("Homepage", "apartmentl");
		By apartmentl=By.xpath(apartment);
		WebElement apartmentL=driver.findElement(apartmentl);
		apartmentL.click();
		Browser.Waitmethod(apartmentL);
    	
    }
    
}
