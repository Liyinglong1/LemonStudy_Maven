package lemon.day05;

public class CalcAdd {
	//定义一个类、定义一个方法用来计算1+2+3+4+...+n的值，在main方法中调用方法，计算n=200时的值 
	static int length = 200;
	//无参构造
	public CalcAdd() {
		// TODO Auto-generated constructor stub
		
	}
	//数组循环添加数据
	public static  int[] addNumber() {
		int[] array = new int[length];
		for (int i=0;i<array.length;i++) {
			array[i]=i;
		}
		return array;
	}
	
	// int[] array = new int[6]
	//把循环添加的数据用一个数组接受，循环取出值相加，打印sum
	public static void plus() {
		int sum =0;
		int[] array = addNumber();
		for(int i = 0;i<array.length;i++) {
			sum = sum +array[i];
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		plus();
	}
}
