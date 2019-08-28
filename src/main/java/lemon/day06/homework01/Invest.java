package lemon.day06.homework01;

public class Invest extends Member{
	
	public boolean recharge(double amount) {
		boolean flag = super.recharge(amount);
		if(flag) {
			System.out.println("invest，充值成功，你可以去投资了");
		}else {
			System.out.println("invest ,充值失败");
		}
		
		return flag;
	}

	public void withdrawAmount(double amount) {
		System.out.println("投资人现在的余额"+getamount());
		super.withdrawAmount(amount);
		System.out.println("投资人提现后的金额"+getamount());
	}
}
