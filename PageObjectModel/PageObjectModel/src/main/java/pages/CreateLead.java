package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.BaseClass;

public class CreateLead extends BaseClass {
	public CreateLead(RemoteWebDriver driver) {
		this.driver=driver;
	}
	public CreateLead enterCompanyName(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		return this;
	}
	public CreateLead enterFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		return this;
	}
	public CreateLead enterLastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		return this;
	}
	public ViewLead clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLead(driver);
	}
}
