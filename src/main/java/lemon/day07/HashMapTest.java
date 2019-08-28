package lemon.day07;

import java.util.HashMap;

public class HashMapTest {
	/*
	 * 新建一个类，类名自取，main函数里创建一个HashMap对象。使用今天上课讲得到的api完成下面的要求。
	 * 1).往这个HashMap对象里添加自己的姓名和年龄，键值分别为”name”和”age”。
	 * 2).判断这个集合是否为空，并打印判断的结果。
	 * 3).打印这个集合的大小。
	 * 4).判断这个集合是否包含数据“王五”，并打印判断结果。 
	 * 5).将map里的age删掉。 
	 * 6).获取map的所有键，并打印。
	 * 7).获取map的所有值，并打印。 
	 * 8).用两种方法获取map里所有的键值对，并打印。
	 */
	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();
		//1).往这个HashMap对象里添加自己的姓名和年龄，键值分别为”name”和”age”。
		hm.put("name", "liyinglong");
		hm.put("age","2");
		//2).判断这个集合是否为空，并打印判断的结果
		System.out.println(hm.isEmpty());
		//打印这个集合的大小
		System.out.println(hm.size());
		//	 * 4).判断这个集合是否包含数据“王五”，并打印判断结果。 
		System.out.println(hm.containsValue("王五"));
		// 5).将map里的age删掉。
		System.out.println(hm.keySet());
//		System.out.println(hm.remove("age"));
		//6).获取map的所有键，并打印。
		System.out.println(hm.keySet());
		//7).获取map的所有值，并打印。 
		System.out.println(hm.values());
		//8).用两种方法获取map里所有的键值对，并打印。
		//第一种
		
		System.out.println(hm.get("name"));
		System.out.println(hm);
		//第二种"key= " + key + " and value= " + map.get(key)
		for (String key : hm.keySet()) {
			System.out.println(key+"  "+hm.get(key));
		}
		
	}
}
