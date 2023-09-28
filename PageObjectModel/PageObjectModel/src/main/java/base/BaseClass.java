package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utils.Readxl;



public class BaseClass {
	public RemoteWebDriver driver;
	public String excelFileName, sheetName;
	
	@Parameters("browser")
	@BeforeMethod
	public void preCondition(String browser){
		if (browser.equalsIgnoreCase("chrome")) {
			driver= new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
		}
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@AfterMethod
	public void postCondition(){
		driver.close();
		
	}
	@DataProvider
	public String[][] sendData() throws IOException {
		return Readxl.ReadExcel(excelFileName, sheetName);
		
	}
}
