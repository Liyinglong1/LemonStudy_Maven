package lemon.day05;

public class CalcAdd {
	//����һ���ࡢ����һ��������������1+2+3+4+...+n��ֵ����main�����е��÷���������n=200ʱ��ֵ 
	static int length = 200;
	//�޲ι���
	public CalcAdd() {
		// TODO Auto-generated constructor stub
		
	}
	//����ѭ���������
	public static  int[] addNumber() {
		int[] array = new int[length];
		for (int i=0;i<array.length;i++) {
			array[i]=i;
		}
		return array;
	}
	
	// int[] array = new int[6]
	//��ѭ����ӵ�������һ��������ܣ�ѭ��ȡ��ֵ��ӣ���ӡsum
	public static void plus() {
		int sum =0;
		int[] array = addNumber();
		for(int i = 0;i<array.length;i++) {
			sum = sum +array[i];
		}
		System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		plus();
	}
}
