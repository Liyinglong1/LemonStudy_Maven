package lemon.day06.homework03;

public class HongKongBird extends Bird{
	public boolean eatMoney(boolean tfmoney,boolean cleanmoney,double amount) {
		boolean flag = super.eatMoney(tfmoney,cleanmoney,amount);
		if(flag) {
			System.out.println("��"+getName()+getAge()+"��"+"������ĵ�Ǯ");
			return true;
		}else {
			System.out.println("������Ĳ���Ǯ");
			return false;
		}
		
	}
}
