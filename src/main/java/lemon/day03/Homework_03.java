package lemon.day03;

public class Homework_03 {
	
	public Homework_03() {   //这个是构造方法
		
	}
	public void dog() {//这个不是构造方法
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 打印如下
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		/*
		 * 写一段程序分别求出0到100之间所有的偶数的和以及奇数的和
		 */
		int sum = 0;//默认为0
		for(int i=0;i<100;i++) {
			if(i%2==0) {
				sum = sum+i;
			}
		}
		System.out.println("0到100之间所有的偶数的和以及奇数的和"+sum);
		
		
		/*
		 * 写一段程序求1+2+3+...+999+1000的值
		 */
		
		int result=0;
		for(int i=0;i<=1000;i++) {
			result = result +i;
		}
		System.out.println("值为"+result);
		
		
		//九九乘法表
		for (int i=1;i<=9;i++){

            for (int a=1;a<=i;a++){
                System.out.print(a+"*"+i+"="+(a*i)+"   ");
            }
            System.out.println();
        }
	}
	

}
