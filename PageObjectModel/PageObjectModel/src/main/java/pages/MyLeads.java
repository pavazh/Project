package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class MyLeads extends BaseClass{
	public MyLeads(RemoteWebDriver driver) {
		this.driver=driver;
	}

	

	public CreateLead clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLead(driver);
	}
	
	
}
