package Selenium_Package;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TestNG_Assersions {
  @Test
  public void Testcase1()
  {
	  Assert.assertEquals("Google Page is displayed", "Google", "Google");
  }
}
