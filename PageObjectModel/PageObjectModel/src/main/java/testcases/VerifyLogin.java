package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.CreateLead;
import pages.LoginPage;
import pages.MyHome;
import pages.MyLeads;
import pages.ViewLead;
import pages.WelcomePage;

public class VerifyLogin extends BaseClass{
	@BeforeTest
	public void setValues() {
		excelFileName="Login";
		sheetName="Sheet1";
		}
	@Test(dataProvider="sendData")
	public void runLogin(String uname, String pword){
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(uname).enterPassword(pword).clickLogin().welcomepage();
		
			}

}
