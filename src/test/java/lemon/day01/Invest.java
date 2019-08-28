package lemon.day01;

public class Invest extends Member{
	
	public boolean recharge(double amount) {
		boolean flag = super.recharge(amount);
		if(flag) {
			System.out.println("invest����ֵ�ɹ��������ȥͶ����");
		}else {
			System.out.println("invest ,��ֵʧ��");
		}
		
		return flag;
	}

	public void withdrawAmount(double amount) {
		System.out.println("Ͷ�������ڵ����"+getamount());
		super.withdrawAmount(amount);
		System.out.println("Ͷ�������ֺ�Ľ��"+getamount());
	}
}
