
package lemon.day04;

//灏忔湅鍙嬫惉妗屽瓙
public class MoveTable {
	static int age = 7;
	static char sex = '男';
	public static void main(String[] args) {
		if(age>7) {
			System.out.println("鍙互鎼姩妗屽瓙");
		}else if(age>5 && sex=='女') {
			System.out.println("鍙互鎼姩妗屽瓙");
		}else {
			System.out.println("浣犺繕澶皬浜�,鎼笉鍔ㄧ殑");
		}
	}
}