package lemon.day06.homework01;

public class Borrow extends Member{
	public boolean recharge(double amount) {
		boolean flag = super.recharge(amount);
		if(flag) {
			System.out.println("Borrow����ֵ�ɹ��������ȥͶ����");
		}else {
			System.out.println("Borrow ,��ֵʧ��");
		}
		return flag;
	}
	
	public void withdrawAmount(double amount) {
		System.out.println("��������ڵ����"+getamount());
		super.withdrawAmount(amount);
		System.out.println("��������ֺ�Ľ��"+getamount());
	}
}
