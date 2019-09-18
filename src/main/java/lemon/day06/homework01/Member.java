package lemon.day06.homework01;

public class Member {
	
/*	一：采用面向对象三大特性对前程贷进行编码，要求如下：

    （1）包含会员类、投资人类、借款人类

    （2）实现会员的注册、登录(简单逻辑即可)、充值、提现方法*/
	
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

	
	//register 方法
	public void register(String memberMobile,String memberPwd) {
		if(memberMobile.length()==11 && memberPwd !="" && memberPwd.length()<=8) {
			System.out.println("注册成功");
			this.memberMobile = memberMobile;
			this.memberPwd = memberPwd;
		}else {
			System.out.println("输入错误，注册失败");
		}
	}
	
	//login 方法
	public void login(String memberMobile,String memberPwd) {
		if(memberMobile.length()==11 && memberPwd !="" && memberPwd.length()<=8) {
			System.out.println("登录成功");
		}else {
			System.out.println("输入错误，登录失败");
		}
	}
	
	//Recharge 方法 
	public boolean recharge(double amount) {
//		 this.amount += amount;
		  if(amount>500 && amount<500000) {
			  this.setAMOUNT(getamount()+amount);
			  System.out.println("member充值成功");
			  System.out.println("余额"+this.amount);
			  return true;
		  }else {
			  System.out.println("member充值失败");
			  System.out.println("余额"+this.amount);
			  return false;	 
		  }
		
	}
	
	//withdrawAmount 方法
	public void withdrawAmount(double amount) {
		this.setAMOUNT(getamount()-amount);
	}
	
}