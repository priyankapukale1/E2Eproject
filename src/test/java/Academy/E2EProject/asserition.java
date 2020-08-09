package Academy.E2EProject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import Academy.E2EProject.*;
import javaresources.base;
import junit.framework.Assert;
import pageobject.Landingpage;
import pageobject.Loginpage;



public class asserition extends base {
	public WebDriver driver;
	public static Logger Log=LogManager.getLogger(base.class.getName()); 

	@BeforeTest 
	
	public void  intialisedrive() throws IOException
	{
	driver=initializeDriver();
      Log.info("driver is intialised");
		driver.get(prop.getProperty("url"));
		Log.info("navigated to homepage");
		}
	
	
	@Test()
	public void homepageNavigation() throws IOException
	{
		
		//driver.get( "http://www.qaclickacademy.com/");
	
	
		Landingpage l=new Landingpage(driver);
		
		Assert.assertEquals(l.gettext().getText(), "FEATUREDCOURSES");
		Log.info("text validated succesfully");
}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
	
	
	
	
	
	
	

