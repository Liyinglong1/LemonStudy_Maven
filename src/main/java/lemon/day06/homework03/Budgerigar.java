package lemon.day06.homework03;

public class Budgerigar extends Bird {
	public boolean eatMoney(boolean tfmoney,boolean cleanmoney,double amount) { 
		boolean flag = super.eatMoney(tfmoney,cleanmoney,amount);
		if(flag) {
			System.out.println("��"+getName()+getAge()+"��"+"��Ƥ���ĵ�Ǯ");
			return true;
		}else {
			System.out.println("��Ƥ���Ĳ���Ǯ");
			return false;
		}
	}
}
