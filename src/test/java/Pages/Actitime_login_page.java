package Pages;

import java.util.Hashtable;

import org.testng.Assert;

import com.TESTBASE.Actitime_TestBase;

import Commonmethods.CommonMethods;

public class Actitime_login_page extends Actitime_TestBase {
	
	public static void createAnAccount(Hashtable<String, String> Testdata) throws Exception {
		String Actual_title = driver.getTitle();

		Assert.assertEquals(Actual_title, "actiTIME - Time Tracking Software for Boosting Your Business");
		
		passLogStatus("User has been redirected to the " + Actual_title + " Application.");
		
		CommonMethods.clickOnWebElement("xlogin", "Login Button should be clicked");
		CommonMethods.sendkeys("xfirst_name", Testdata.get("First_Name"), "First Name");
		CommonMethods.sendkeys("xlast_name", Testdata.get("Last_Name"), "Last Name");
		
		
		
		

}}
