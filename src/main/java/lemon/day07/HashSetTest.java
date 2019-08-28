package lemon.day07;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*1:�½�һ���࣬������ȡ��main�����ﴴ��һ��HashSet����ʹ�ý����Ͽν��õ���api��������Ҫ��
1).�����HashSet�������������String���͵����ݣ����������������ġ��������塱��������������������
2).�ж���������Ƿ�Ϊ�գ�����ӡ�жϵĽ����
3).��ӡ������ϵĴ�С�� 
4).�ж���������Ƿ��������"����"�� 
5).������������������ɾ���� 
6).���õ�����������ȡset�����е�ÿ��Ԫ�أ�����ӡ�� 
7).��setת�������顣��ѭ����ӡ�����е�Ԫ�� */

public class HashSetTest {
	public static void main(String[] args) {
		//HashSet���򣬲����ظ�
		HashSet<String> str= new HashSet<String>();
		//1).�����HashSet�������������String���͵����ݣ����������������ġ��������塱��������������������
		str.add("����");
		str.add("����");
		str.add("����");
		str.add("����");
		str.add("����");
		for (String name: str) {
			System.out.println(name);
		}
		//2).�ж���������Ƿ�Ϊ�գ�����ӡ�жϵĽ����
		System.out.println(str.isEmpty());
		//3).��ӡ������ϵĴ�С�� 
		System.out.println(str.size());
		//4).�ж���������Ƿ��������"����"�� 
		System.out.println(str.contains("����"));
		//5).������������������ɾ���� 
		System.out.println(str.remove("����"));
		for (String name: str) {
			System.out.println(name);
		}
		System.out.println("------------------");
		//6).���õ�����������ȡset�����е�ÿ��Ԫ�أ�����ӡ�� 
		Iterator<String> integer= str.iterator();
		while(integer.hasNext()) {
			System.out.println(integer.next());
		}
		
		//7).��setת�������顣��ѭ����ӡ�����е�Ԫ�� */
		Object[] name= str.toArray();
		
		for (Object object : name) {
			System.out.println(object);
		}
	}
}
