package lemon.day06.homework03;

/*对如下场景进行编程
动物园有鹦鹉表演的活动，鹦鹉很聪明，会叼钱，如果RMB是假钱、或者面额小于10块,或者不干净，鹦鹉都不会叼
1：一只叫Tom的2岁的金刚鹦鹉，发现了一张干净的、面额为3块的假钱，它不屑的看了看
2：一只叫Jack的1岁的虎皮鹦鹉，发现了一张干净的，面额为10块的真钱，它叼走了*/

public class Bird {
	private boolean tfmoney; //是否真钱
	private boolean cleanmoney;//钱是否干净
	private double amount;//面额
	private int age; //年龄
	private String name;  //名字
	private String kind;//种类
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isTfmoney() {
		return tfmoney;
	}

	public void setTfmoney(boolean tfmoney) {
		this.tfmoney = tfmoney;
	}

	public boolean isCleanmoney() {
		return cleanmoney;
	}

	public void setCleanmoney(boolean cleanmoney) {
		this.cleanmoney = cleanmoney;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public boolean eatMoney(boolean tfmoney,boolean cleanmoney,double amount) {
		if(tfmoney && cleanmoney && amount>=10) {
			System.out.println("鹦鹉叼钱");
			return true;
		}else {
			System.out.println("鹦鹉不叼钱");
			return false;
		}
	}
	

}
