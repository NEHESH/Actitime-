package com.TestCases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.TESTBASE.Actitime_TestBase;

import Pages.Actitime_home_page;

public class Testcase_2 extends Actitime_TestBase {

	
	@Test(dataProvider = "Data_Collections")
	public static void login(Hashtable<String, String> Testdata) throws Exception {
		
		Actitime_home_page.createAnTask(Testdata);
	}
}
