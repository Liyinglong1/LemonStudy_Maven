package lemon.day18.section02;

public class Tester {

	public static void main(String[] args) throws Exception{
		StaticBlock.f1();
		
		StaticBlock staticBlock = new StaticBlock();
		
		Class.forName("lemon.day18.section02.StaticBlock");
	}

}
