package lemon.day01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessTest extends Recharge_Base_Test{
  @Test
  public void f() {
	 double amount = zero.getamount();
	 zero.recharge(1000);
	 Assert.assertEquals(amount, zero.getamount()-1000);
  }
  @Test
  public void f1() {
	double amount = zero.getamount();
	zero.recharge(-1000);
	Assert.assertEquals(amount, zero.getamount());
		 
  }
  @Test
  public void f2() {
	double amount = zero.getamount();
	zero.recharge(500001);
	Assert.assertEquals(amount, zero.getamount());
  }
  
}


  