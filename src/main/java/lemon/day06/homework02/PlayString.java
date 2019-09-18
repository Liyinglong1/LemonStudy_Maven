package lemon.day06.homework02;


/*ʵ�ٲ���������String���API
�ж��Ƿ���ָ���ַ�����ͷ���β startsWith endWith 
�ַ�����ȡ substring 
�ַ������ split 
�ַ������� indexOf lastIndexOf contains 
�ַ����Ƚ� equals equalsIgnoreCase 
�ַ���ƴ�� concat 
�п� isEmpty
ȥ�����ҿո� trim 
�ַ������� length 
ת��Сд toUpperCase toLowerCase 
�滻 replace replaceFirst replaceAll 
�ַ������� valueOf */
public class PlayString {
	public static void main(String[] args) {
		String str  = "Hello Lemon Study";
		String str1  = " Hello Lemon Study";
		String str2  = "Lemon Hello Lemon Study";
		//�ж��Ƿ���ָ���ַ�����ͷ���β startsWith endWith 
		System.out.println(str.startsWith("H"));
		System.out.println(str.endsWith("s"));
		
		//�ַ�����ȡ substring 
		System.out.println(str.substring(6));
		System.out.println(str.substring(1, 2));
		
		//�ַ������ split 
		System.out.println("------------------");
		System.out.println(str.split("e",2)[0]);   //n-1��
		
		System.out.println(str.split("e",3)[1]);
		System.out.println(str.split("e",3)[2]);
		//�ַ������� indexOf lastIndexOf contains 
		System.out.println(str.indexOf("Le"));
		System.out.println(str.lastIndexOf("e"));
		System.out.println(str.contains("Lemon"));  //�Ƿ����
		
		//�ַ����Ƚ� equals equalsIgnoreCase 
		System.out.println(str.equals("Hello Lemon Study"));
		System.out.println(str.equalsIgnoreCase("hello Lemon Study")); //���Դ�Сд�Ƚ�
		
		//�ַ���ƴ�� concat 
		System.out.println(str.concat("good"));
		
		//�п� isEmpty
		System.out.println(str.isEmpty());
		
		//ȥ�����ҿո� trim 
		System.out.println(str1.trim());
		
		//�ַ������� length 
		System.out.println(str.length());
		
		//ת��Сд toUpperCase toLowerCase 
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		//�滻 replace replaceFirst replaceAll 
		System.out.println(str2.replace("Lemon","Google"));
		System.out.println(str2.replaceFirst("Lemon","Google"));
		System.out.println(str2.replaceAll("Lemon","Google"));
		
		//�ַ������� valueOf
		System.out.println(str.valueOf(str));
	}

}
