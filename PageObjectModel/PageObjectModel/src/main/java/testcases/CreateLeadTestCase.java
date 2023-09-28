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

public class CreateLeadTestCase extends BaseClass{
	@BeforeTest
	public void setValues() {
		excelFileName="Login";
		sheetName="Sheet2";
		}
	@Test(dataProvider="sendData")
	public void runCreateLead(String uname, String pword, String cname, String lname, String fname){
		LoginPage lp=new LoginPage(driver);
		lp.enterUsername(uname).enterPassword(pword).clickLogin().welcomepage()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(cname)
		.enterFirstName(fname)
		.enterLastName(lname)
		.clickCreateLeadButton()
		.verifyViewLeads();
			}

}
