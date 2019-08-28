package lemon.day06.homework01;

public class Test {
	public static void main(String[] args) {
		Member jack = new Member();
		Member rose = new Invest();
		Member john = new Borrow();
		//Test register
		jack.register("13555555555", "12345678");
		//Test login
		jack.login(jack.getMemberMobile(), jack.getMemberPwd());
		//member recharge Test
		jack.recharge(1);
		jack.recharge(2000);
		
		//·â×°   recharge Test
		rose.recharge(5000);
		john.recharge(6000);
		
		//withdrawAmount  Test
		rose.withdrawAmount(2000);
		john.withdrawAmount(3000);
	}
}
