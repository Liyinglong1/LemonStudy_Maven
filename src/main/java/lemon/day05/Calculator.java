package lemon.day05;

/*����һ����:Calculator��  Ҫ�� ��д����ʵ������int���ļӼ��˳� 
�½�һ����:Tester Ҫ�� ��Tester����ü������ļӼ��˳������������int�������ݵ�����
*/

public class Calculator { 
	
	int sum;
	public int add(int a,int b) {
		sum = a+b;
		return sum;
	}
	public int subtract(int a,int b) {
		sum = a-b;
		return sum;
	}
	public int multiplication(int a,int b) {
		sum = a*b;
		return sum;
	}
	public int division(int a,int b) {
		sum = a/b;
		return sum;
	}
	
	
}
