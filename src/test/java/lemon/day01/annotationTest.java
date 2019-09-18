package lemon.day01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class annotationTest {
  @Test
  public void f() {
	  System.out.println("annotationTest.f()"+"--------");
  }
  
  @Test
  public void f1() {
	  System.out.println("annotationTest.f1()"+"--------");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("annotationTest.beforeMethod()"+"--------");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("annotationTest.afterMethod()"+"--------");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("annotationTest.beforeClass()"+"--------");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("annotationTest.afterClass()"+"--------");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("annotationTest.beforeTest()"+"--------");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("annotationTest.afterTest()"+"--------");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("annotationTest.beforeSuite()"+"--------");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("annotationTest.afterSuite()"+"--------");
  }

}
