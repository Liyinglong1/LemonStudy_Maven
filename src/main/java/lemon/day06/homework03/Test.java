package lemon.day06.homework03;

public class Test {
	public static void main(String[] args) {
		Bird Tom = new HongKongBird();
		Tom.setName("Tom");
		Tom.setAge(2);
		Tom.eatMoney(false, true, 3);
		
		Bird Jack = new Budgerigar();
		Jack.setName("Jack");
		Jack.setAge(1);
		Jack.eatMoney(true, true, 11);
	}
}
