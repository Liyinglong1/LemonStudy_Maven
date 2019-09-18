package lemon.day01;

public class Borrow extends Member{
	public boolean recharge(double amount) {
		boolean flag = super.recharge(amount);
		if(flag) {
			System.out.println("Borrow，充值成功");
		}else {
			System.out.println("Borrow 充值失败");
		}
		return flag;
	}
	
	public void withdrawAmount(double amount) {
		System.out.println("现在的金额"+getamount());
		super.withdrawAmount(amount);
		System.out.println("现在的金额"+getamount());
	}
}
