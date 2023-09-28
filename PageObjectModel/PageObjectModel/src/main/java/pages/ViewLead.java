package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class ViewLead extends BaseClass{
	public ViewLead(RemoteWebDriver driver) {
		this.driver=driver;
	}

	public ViewLead verifyViewLeads() {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		return this;
	}
}
