package lemon.day06.homework03;

public class Budgerigar extends Bird {
	public boolean eatMoney(boolean tfmoney,boolean cleanmoney,double amount) { 
		boolean flag = super.eatMoney(tfmoney,cleanmoney,amount);
		if(flag) {
			System.out.println("½Ğ"+getName()+getAge()+"Ëê"+"»¢Æ¤ğĞğÄµğÇ®");
			return true;
		}else {
			System.out.println("»¢Æ¤ğĞğÄ²»µğÇ®");
			return false;
		}
	}
}
