package lemon.day04;

//使用switch结构实现为小明定制学习计划，星期一、星期三、星期五学习编程，星期二、星期四、星期六学习英语，星期日休息
public class StudyPlan {
	static int day = 7;
	public static void main(String[] args) {
		switch(day) {
		case 1:
		case 3:
		case 5:
			System.out.println("学习编程");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("学习英语");
			break;
		case 7:
			System.out.println("休息一天");
			break;
		}
	}
}