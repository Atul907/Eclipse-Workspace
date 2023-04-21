package com.test;


import java.io.IOException;
import org.testng.annotations.Test;
import com.Base.BaseTest;

public class LoginTest extends BaseTest {

	@Test
	public void Login() throws IOException  {
		
		lp.loginHRM2();
		
	}
}
