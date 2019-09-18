package lemon.day07;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/*1:新建一个类，类名自取，main函数里创建一个HashSet对象。使用今天上课讲得到的api完成下面的要求。
1).往这个HashSet对象里添加如下String类型的数据：“张三”，“李四”，“王五”，“张三”，”赵六”
2).判断这个集合是否为空，并打印判断的结果。
3).打印这个集合的大小。 
4).判断这个集合是否包含数据"王五"。 
5).将”张三”这条数据删掉。 
6).利用迭代器迭代获取set集合中的每个元素，并打印。 
7).将set转换成数组。并循环打印数组中的元素 */

public class HashSetTest {
	public static void main(String[] args) {
		//HashSet无序，不可重复
		HashSet<String> str= new HashSet<String>();
		//1).往这个HashSet对象里添加如下String类型的数据：“张三”，“李四”，“王五”，“张三”，”赵六”
		str.add("张三");
		str.add("李四");
		str.add("王五");
		str.add("张三");
		str.add("赵六");
		for (String name: str) {
			System.out.println(name);
		}
		//2).判断这个集合是否为空，并打印判断的结果。
		System.out.println(str.isEmpty());
		//3).打印这个集合的大小。 
		System.out.println(str.size());
		//4).判断这个集合是否包含数据"王五"。 
		System.out.println(str.contains("王五"));
		//5).将”张三”这条数据删掉。 
		System.out.println(str.remove("王五"));
		for (String name: str) {
			System.out.println(name);
		}
		System.out.println("------------------");
		//6).利用迭代器迭代获取set集合中的每个元素，并打印。 
		Iterator<String> integer= str.iterator();
		while(integer.hasNext()) {
			System.out.println(integer.next());
		}
		
		//7).将set转换成数组。并循环打印数组中的元素 */
		Object[] name= str.toArray();
		
		for (Object object : name) {
			System.out.println(object);
		}
	}
}
