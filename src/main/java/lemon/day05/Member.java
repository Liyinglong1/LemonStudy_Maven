package lemon.day05;

/*����һ����Ա�ࣨMember�����������������ԣ��û���regName���ֻ�����mobilePhone���������leaveAmount��
��дmain���� 
��main����������޲ι��캯��������һ����Ա����tom
��main��������ô��ι��캯��������һ��ѧ������jack
�ڴ��ι��캯����ʹ�ø�������ʼ����Ӧ���Ե�ֵ*/
public class Member {
	String regName;
	String mobilePhone;
	double leaveAmount;
	
	//�޲ι���
	public Member() {
		
	}
	//�вι���
	public Member(String regName,String mobilePhone,double leaveAmount) {
		this.regName = regName;
		this.mobilePhone = mobilePhone;
		this.leaveAmount = leaveAmount;
		System.out.println(regName+mobilePhone+leaveAmount);
	}
	
	public static void main(String[] args) {
		//��main����������޲ι��캯��������һ����Ա����tom
		Member tom = new Member();
		//��main��������ô��ι��캯��������һ��ѧ������jack
		Member jack = new Member("����","18373969442",182.23);
	}
}
