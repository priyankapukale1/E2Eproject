package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Landingpage {

	public WebDriver driver;
	
	By signin=By.cssSelector("a[href*='sign_in']");
	By Text=By.cssSelector("[class='text-center']");
	
	public Landingpage(WebDriver driver) {  //created constructor to give life to the driver
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getlogin()
	{
		return driver.findElement(signin);
	}
	public WebElement gettext()
	{
		return driver.findElement(Text);
	}

}
