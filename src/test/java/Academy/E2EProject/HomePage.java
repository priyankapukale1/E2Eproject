package Academy.E2EProject;
import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import java.io.IOException;
import Academy.E2EProject.*;
import javaresources.base;
import pageobject.Landingpage;
import pageobject.Loginpage;



public class HomePage extends base {
	public WebDriver driver;
	public static Logger Log=LogManager.getLogger(base.class.getName()); 
	@BeforeTest 
	public void  intialisedrive() throws IOException
	{
	driver=initializeDriver();
	
	}


	@Test(dataProvider="getdata")
	public void homepageNavigation(String Username, String Password) throws IOException
	{
    driver.get(prop.getProperty("url"));
	Landingpage l=new Landingpage(driver);
    l.getlogin().click();
    Loginpage ln=new Loginpage(driver);
    Log.info("logged in successfully");
    ln.getemail().sendKeys(Username);
    ln.getpassword().sendKeys(Password);
    ln.getlogin().click();
}
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data=new Object[2][2]; // row stands for how many different data typs test should run;column many values per each test
		data[0][0]="restrictuser@gmail.com";
		data[0][1]="pwd123";
		
		data[1][0]="nonrestrictuser@gmail.com";
		data[1][1]="pwd1234";
		
	
		
		return data;
		
	
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
	
	
	
	
	
	

