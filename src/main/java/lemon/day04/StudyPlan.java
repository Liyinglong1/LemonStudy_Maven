package lemon.day04;

//ʹ��switch�ṹʵ��ΪС������ѧϰ�ƻ�������һ����������������ѧϰ��̣����ڶ��������ġ�������ѧϰӢ���������Ϣ
public class StudyPlan {
	static int day = 7;
	public static void main(String[] args) {
		switch(day) {
		case 1:
		case 3:
		case 5:
			System.out.println("ѧϰ���");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("ѧϰӢ��");
			break;
		case 7:
			System.out.println("��Ϣһ��");
			break;
		}
	}
}