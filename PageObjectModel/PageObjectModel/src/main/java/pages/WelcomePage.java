package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class WelcomePage extends BaseClass {
	public WelcomePage(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public WelcomePage welcomepage() {
	String title = driver.getTitle();
	if (title.contains("Leaftaps")) {
		System.out.println("Login Successfull");
	}
	else {
		System.out.println("Login not successfull");
	}
	return this;
	
	}
	public MyHome clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHome(driver);
	}
}
