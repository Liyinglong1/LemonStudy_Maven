package lemon.day07;

import java.util.HashMap;

public class HashMapTest {
	/*
	 * �½�һ���࣬������ȡ��main�����ﴴ��һ��HashMap����ʹ�ý����Ͽν��õ���api��������Ҫ��
	 * 1).�����HashMap����������Լ������������䣬��ֵ�ֱ�Ϊ��name���͡�age����
	 * 2).�ж���������Ƿ�Ϊ�գ�����ӡ�жϵĽ����
	 * 3).��ӡ������ϵĴ�С��
	 * 4).�ж���������Ƿ�������ݡ����塱������ӡ�жϽ���� 
	 * 5).��map���ageɾ���� 
	 * 6).��ȡmap�����м�������ӡ��
	 * 7).��ȡmap������ֵ������ӡ�� 
	 * 8).�����ַ�����ȡmap�����еļ�ֵ�ԣ�����ӡ��
	 */
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		//1).�����HashMap����������Լ������������䣬��ֵ�ֱ�Ϊ��name���͡�age����
		hm.put("name", "liyinglong");
		hm.put("age","2");
		//2).�ж���������Ƿ�Ϊ�գ�����ӡ�жϵĽ��
		System.out.println(hm.isEmpty());
		//��ӡ������ϵĴ�С
		System.out.println(hm.size());
		//	 * 4).�ж���������Ƿ�������ݡ����塱������ӡ�жϽ���� 
		System.out.println(hm.containsValue("����"));
		// 5).��map���ageɾ����
		System.out.println(hm.keySet());
//		System.out.println(hm.remove("age"));
		//6).��ȡmap�����м�������ӡ��
		System.out.println(hm.keySet());
		//7).��ȡmap������ֵ������ӡ�� 
		System.out.println(hm.values());
		//8).�����ַ�����ȡmap�����еļ�ֵ�ԣ�����ӡ��
		//��һ��
		
		System.out.println(hm.get("name"));
		System.out.println(hm);
		//�ڶ���"key= " + key + " and value= " + map.get(key)
		for (String key : hm.keySet()) {
			System.out.println(key+"  "+hm.get(key));
		}
		
	}
}
