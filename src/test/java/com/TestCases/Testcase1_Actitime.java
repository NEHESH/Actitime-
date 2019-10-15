package com.TestCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.TESTBASE.Actitime_TestBase;

import Pages.Actitime_login_page;


public class Testcase1_Actitime extends Actitime_TestBase{
	

		@Test(dataProvider = "Data_Collections")
		public static void login(Hashtable<String, String> Testdata) throws Exception {
			et = er.startTest("TC_ACTI_007_Create_an_Account_build");

			Actitime_login_page.createAnAccount(Testdata);
			
}
}