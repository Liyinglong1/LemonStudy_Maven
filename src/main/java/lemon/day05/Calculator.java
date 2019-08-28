package lemon.day05;

/*创建一个类:Calculator，  要求： 编写函数实现两个int数的加减乘除 
新建一个类:Tester 要求： 在Tester类调用计算器的加减乘除函数完成两个int类型数据的运算
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
