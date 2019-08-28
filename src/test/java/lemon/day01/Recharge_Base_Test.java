package lemon.day01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Recharge_Base_Test {
	
	static Member zero;
	@BeforeSuite
	public void beforeSuite() {
		zero = new Member();
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Suite 后");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Recharge_Base_Test.beforeTest()");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("Recharge_Base_Test.afterTest()");
	}
	
//	@BeforeMethod
//	  public void beforeMethod() {
//		  System.out.println("Recharge_Base_Test.beforeMethod()"+"--------");
//	  }
//
//	  @AfterMethod
//	  public void afterMethod() {
//		  System.out.println("Recharge_Base_Test.afterMethod()"+"--------");
//	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Recharge_Base_Test.beforeClass()");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("Recharge_Base_Test.afterClass()");
	  }
}
