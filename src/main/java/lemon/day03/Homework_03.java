package lemon.day03;

public class Homework_03 {
	
	public Homework_03() {   //����ǹ��췽��
		
	}
	public void dog() {//������ǹ��췽��
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ��ӡ����
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		/*
		 * дһ�γ���ֱ����0��100֮�����е�ż���ĺ��Լ������ĺ�
		 */
		int sum = 0;//Ĭ��Ϊ0
		for(int i=0;i<100;i++) {
			if(i%2==0) {
				sum = sum+i;
			}
		}
		System.out.println("0��100֮�����е�ż���ĺ��Լ������ĺ�"+sum);
		
		
		/*
		 * дһ�γ�����1+2+3+...+999+1000��ֵ
		 */
		
		int result=0;
		for(int i=0;i<=1000;i++) {
			result = result +i;
		}
		System.out.println("ֵΪ"+result);
		
		
		//�žų˷���
		for (int i=1;i<=9;i++){

            for (int a=1;a<=i;a++){
                System.out.print(a+"*"+i+"="+(a*i)+"   ");
            }
            System.out.println();
        }
	}
	

}
