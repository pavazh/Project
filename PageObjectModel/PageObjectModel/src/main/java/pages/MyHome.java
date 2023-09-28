package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class MyHome extends BaseClass{
	public MyHome(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public MyLeads clickLeadsLink() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeads(driver);
	}
	
}
