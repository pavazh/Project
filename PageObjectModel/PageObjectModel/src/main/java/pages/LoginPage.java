package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class LoginPage extends BaseClass{
	public LoginPage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	
	public LoginPage enterUsername(String uname){
	driver.findElement(By.id("username")).sendKeys(uname);
	return this;
	}
	
	public LoginPage enterPassword(String pword){
		driver.findElement(By.id("password")).sendKeys(pword);
		return this;
		}
	public WelcomePage clickLogin(){
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage(driver);
		}
}
