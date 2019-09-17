
package lemon.day04;

//小朋友搬桌子
public class MoveTable {
	static int age = 7;
	static char sex = '女';
	public static void main(String[] args) {
		if(age>7) {
			System.out.println("可以搬动桌子");
		}else if(age>5 && sex=='男') {
			System.out.println("可以搬动桌子");
		}else {
			System.out.println("你还太小了,搬不动的");
		}
	}
}