package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.testBase.TestBase;

public class LoginTest extends TestBase
{
	String expected_url="https://www.apps.dalalstreet.ai/dashboard";

	@Test
	public void verifyLoginTest()
	{
		Assert.assertEquals(util.getUrl(), expected_url);
		dashboard.profileGetText();
	}
}
