package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.ElementUtil;

public class HomePage
{
	private WebDriver driver;
	private ElementUtil elementUtil;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		elementUtil = new ElementUtil(driver);
	}
		
	private WebElement getHeaderElement(String headerValue)
	{
		String headerXpathValue = "//a[contains(text(), '" + headerValue + "')]";
		return elementUtil.getElement("xpath", headerXpathValue);
	}
	
	public boolean isHeaderExist(String headerValue)
	{
		String header = getHeaderElement(headerValue).getText();
		System.out.println("header = " + header);
		return getHeaderElement(headerValue).isDisplayed();
	}
	
	private WebElement getContactElement(String contactValue)
	{
		String contactXpathValue = "//a[contains(text(), '" + contactValue + "')]";
		return elementUtil.getElement("xpath", contactXpathValue);
	}
	
	private WebElement isContactExist(String contactValue)
	{
		String contactXpathValue = "//a[contains(text(), '" + contactValue + "')]";
		System.out.println("contact = " + contactValue);
		return elementUtil.getElement("xpath", contactXpathValue);
	}
	
}
