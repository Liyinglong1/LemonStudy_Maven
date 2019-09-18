package lemon.day07;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSONObject;

public class JsonChange {
//	3：将如下Json字符串转成Java对象
//	1). {"name": "tom","age": "26","gender": "男"}
//	2).  [ {"name": "tom","age": "26","gender": "男"}, {"name": "jack","age": "25","gender": "男"}, {"name": "rose","age": "26","gender": "女"} ]
	
	public static void main(String[] args) {
		String json1="{\"name\": \"tom\",\"age\": \"26\",\"gender\": \"男\"}";
		String json2="[ {\"name\": \"tom\",\"age\": \"26\",\"gender\": \"男\"}, {\"name\": \"jack\",\"age\": \"25\",\"gender\": \"男\"}, {\"name\": \"rose\",\"age\": \"26\",\"gender\": \"女\"} ]";
		//转换成user对象 
		User user = JSONObject.parseObject(json1, User.class);
		System.out.println(user);
		
		//转换 成map对象
		Map map = (Map) JSONObject.parse(json1);
		System.out.println(map);
		Set<String> set= map.keySet();
		for (String key : set) {
			System.out.println(key+"="+map.get(key));
		}
		
		System.out.println(json2);
		//转换 成map对象
		List<Map> datas = JSONObject.parseArray(json2, Map.class);
		for (Map map2 : datas) {
			System.out.println(map2);
		}
		
		//转换成user对象 
		 List<User> user1 = JSONObject.parseArray(json2,User.class);
		 for (User user2 : user1) {
			System.out.println(user2);
			System.out.println(user2.getName());
		}
	}
}
