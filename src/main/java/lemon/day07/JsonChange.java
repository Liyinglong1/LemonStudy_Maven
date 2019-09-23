package lemon.day07;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSONObject;

public class JsonChange {
//	3锛氬皢濡備笅Json瀛楃涓茶浆鎴怞ava瀵硅薄
//	1). {"name": "tom","age": "26","gender": "鐢�"}
//	2).  [ {"name": "tom","age": "26","gender": "鐢�"}, {"name": "jack","age": "25","gender": "鐢�"}, {"name": "rose","age": "26","gender": "濂�"} ]
	
	public static void main(String[] args) {
		String json1="{\"name\": \"tom\",\"age\": \"26\",\"gender\": \"鐢穃\"}";
		String json2="[ {\"name\": \"tom\",\"age\": \"26\",\"gender\": \"鐢穃\"}, {\"name\": \"jack\",\"age\": \"25\",\"gender\": \"鐢\"}, {\"name\": \"rose\",\"age\": \"26\",\"gender\": \"濂砛\"} ]";
		//杞崲鎴恥ser瀵硅薄 
		User user = JSONObject.parseObject(json1, User.class);
		System.out.println(user);
		
		//杞崲 鎴恗ap瀵硅薄
		Map map = (Map) JSONObject.parse(json1);
		System.out.println(map);
		Set<String> set= map.keySet();
		for (String key : set) {
			System.out.println(key+"="+map.get(key));
		}
		
		System.out.println(json2);
		//杞崲 鎴恗ap瀵硅薄
		List<Map> datas = JSONObject.parseArray(json2, Map.class);
		for (Map map2 : datas) {
			System.out.println(map2);
		}
		
		//杞崲鎴恥ser瀵硅薄 
		 List<User> user1 = JSONObject.parseArray(json2,User.class);
		 for (User user2 : user1) {
			System.out.println(user2);
			System.out.println(user2.getName());
		}
	}
}
