package lemon.day06.homework03;

/*�����³������б��
����԰�����ı��ݵĻ�����ĺܴ��������Ǯ�����RMB�Ǽ�Ǯ���������С��10��,���߲��ɾ������Ķ������
1��һֻ��Tom��2��Ľ�����ģ�������һ�Ÿɾ��ġ����Ϊ3��ļ�Ǯ������м�Ŀ��˿�
2��һֻ��Jack��1��Ļ�Ƥ���ģ�������һ�Ÿɾ��ģ����Ϊ10�����Ǯ����������*/

public class Bird {
	private boolean tfmoney; //�Ƿ���Ǯ
	private boolean cleanmoney;//Ǯ�Ƿ�ɾ�
	private double amount;//���
	private int age; //����
	private String name;  //����
	private String kind;//����
	
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
			System.out.println("���ĵ�Ǯ");
			return true;
		}else {
			System.out.println("���Ĳ���Ǯ");
			return false;
		}
	}
	

}
