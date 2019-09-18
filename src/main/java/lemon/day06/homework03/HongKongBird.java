package lemon.day06.homework03;

public class HongKongBird extends Bird{
	public boolean eatMoney(boolean tfmoney,boolean cleanmoney,double amount) {
		boolean flag = super.eatMoney(tfmoney,cleanmoney,amount);
		if(flag) {
			System.out.println("½Ğ"+getName()+getAge()+"Ëê"+"½ğ¸ÕğĞğÄµğÇ®");
			return true;
		}else {
			System.out.println("½ğ¸ÕğĞğÄ²»µğÇ®");
			return false;
		}
		
	}
}
