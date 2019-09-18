package lemon.day18.section02;

public class StaticBlock {
	
	static {
		System.out.println("调用到了static块");
	}
	
	public static void f1(){
		System.out.println("StaticBlock.f1()");
	}

}
