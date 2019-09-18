package lemon.day05;


/*定义一个会员类（Member），该类有三个属性：用户名regName，手机号码mobilePhone，可用余额leaveAmount，
编写main函数 
在main函数里调用无参构造函数来创建一个会员对象tom
在main函数里调用带参构造函数来创建一个学生对象jack
在带参构造函数中使用各参数初始化对应属性的值*/
public class Member {
	String regName;
	String mobilePhone;
	double leaveAmount;
	
	//无参构造
	public Member() {
		
	}
	//有参构造
	public Member(String regName,String mobilePhone,double leaveAmount) {
		this.regName = regName;
		this.mobilePhone = mobilePhone;
		this.leaveAmount = leaveAmount;
		System.out.println(regName+mobilePhone+leaveAmount);
	}
	
	public static void main(String[] args) {
		//在main函数里调用无参构造函数来创建一个会员对象tom
		Member tom = new Member();
		//在main函数里调用带参构造函数来创建一个学生对象jack
		Member jack = new Member("李四","18373969442",182.23);
	}
}