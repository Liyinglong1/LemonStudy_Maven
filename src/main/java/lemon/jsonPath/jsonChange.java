package lemon.jsonPath;

import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;

public class jsonChange {
	public static void main(String[] args) {
		String json = "{\r\n" + 
				"    \"lemon\": {\r\n" + 
				"        \"teachers\": [\r\n" + 
				"            {\r\n" + 
				"                \"id\": \"101\",\r\n" + 
				"                \"name\": \"����\",\r\n" + 
				"                \"addr\": \"���ϳ�ɳ\",\r\n" + 
				"                \"age\": 25\r\n" + 
				"            },\r\n" + 
				"             {\r\n" + 
				"                \"id\": \"102\",\r\n" + 
				"                \"name\": \"躸�\",\r\n" + 
				"                \"age\": 28\r\n" + 
				"            },\r\n" + 
				"            {\r\n" + 
				"                \"id\": \"103\",\r\n" + 
				"                \"name\": \"Happy\",\r\n" + 
				"                \"addr\": \"�㶫����\",\r\n" + 
				"                \"age\": 16\r\n" + 
				"            },\r\n" + 
				"             {\r\n" + 
				"                \"id\": \"104\",\r\n" + 
				"                \"name\": \"����\",\r\n" + 
				"                \"addr\": \"�㶫����\",\r\n" + 
				"                \"age\": 29\r\n" + 
				"            }\r\n" + 
				"        ],\r\n" + 
				"        \"salesmans\": [\r\n" + 
				"            {\r\n" + 
				"                \"id\": \"105\",\r\n" + 
				"                \"name\": \"ëë\",\r\n" + 
				"                \"age\": 17\r\n" + 
				"            },\r\n" + 
				"             {\r\n" + 
				"                \"id\": \"106\",\r\n" + 
				"                \"name\": \"����\",\r\n" + 
				"                \"age\": 27\r\n" + 
				"            }\r\n" + 
				"        ]\r\n" + 
				"    },\r\n" + 
				" \"avg\": 25\r\n" + 
				"}";
		
		List<String> authors = JsonPath.read(json, "$.lemon.teachers[*].name");
		System.out.print(authors);
		String one = JsonPath.read(json ,"$.lemon.teachers[0].name");
		System.out.println(one);
		Object document = Configuration.defaultConfiguration().jsonProvider().parse(json);
		System.out.println(JsonPath.read(document, "$.lemon.salesmans[*].name"));
		
		
		List<Object> salesmansList = JsonPath.read(json, "$.lemon.salesmans[*].name");
		System.out.println(salesmansList);
	}
}
