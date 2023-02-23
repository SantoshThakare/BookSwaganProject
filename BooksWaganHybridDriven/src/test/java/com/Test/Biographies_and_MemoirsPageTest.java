package com.Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Base.Base;
import com.Page.Biographies_and_MemoirsPage;
import com.Page.LoginPage;
import com.Utility.Utility;

public class Biographies_and_MemoirsPageTest extends Base {

	public Biographies_and_MemoirsPageTest() {
		super();
	}

    /**
	 *  To Run Initialize method before running each Testcases and To Open
	 * browser
	 */
	@BeforeMethod
	public void triggerDriver() {
		try {


			Utility.intilization(prop.getProperty("browser"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void Biographies_and_Memoirs_Post() {

		loginp = new LoginPage();
		loginp.LoginUser();
		biographies_and_memoirs = new Biographies_and_MemoirsPage();
		biographies_and_memoirs.userBiography_general();
		
	}

	/**
	 * To Run Terminate method after running each Testcases
	 */  

	@SuppressWarnings("static-access")
	@AfterMethod
	public void terminateDriver() {
		try {

			Thread.sleep(4000);
			Utility.closedriver();

		} catch (Exception e) {

		}
	}
}
