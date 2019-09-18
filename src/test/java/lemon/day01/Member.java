package lemon.day01;

public class Member {
	

	private String memberName;
	private String memberMobile; 
	private String memberPwd;
	private double amount;
	
	public String getmemberName() {
		return memberName;
	}
	
	public void SetmemberName(String memberName) {
		this.memberName = memberName;
	}
	
	public String getMemberMobile() {
		return memberMobile;
	}

	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public double getamount() {
		return amount;
	}

	public void setAMOUNT(double amount) {
		this.amount = amount;
	}

	
	//register ����
	public void register(String memberMobile,String memberPwd) {
		if(memberMobile.length()==11 && memberPwd !="" && memberPwd.length()<=8) {
			System.out.println("ע��ɹ�");
			this.memberMobile = memberMobile;
			this.memberPwd = memberPwd;
		}else {
			System.out.println("�������ע��ʧ��");
		}
	}
	
	//login ����
	public void login(String memberMobile,String memberPwd) {
		if(memberMobile.length()==11 && memberPwd !="" && memberPwd.length()<=8) {
			System.out.println("��¼�ɹ�");
		}else {
			System.out.println("������󣬵�¼ʧ��");
		}
	}
	
	//Recharge ���� 
	public boolean recharge(double amount) {
//		 this.amount += amount;
		  if(amount>500 && amount<500000) {
			  this.setAMOUNT(getamount()+amount);
			  System.out.println("充值成功");
			  System.out.println("现在的金额"+this.amount);
			  return true;
		  }else {
			  System.out.println("充值失败");
			  System.out.println("现在的金额"+this.amount);
			  return false;	 
		  }
		
	}
	
	//withdrawAmount ����
	public void withdrawAmount(double amount) {
		this.setAMOUNT(getamount()-amount);
	}
	
}