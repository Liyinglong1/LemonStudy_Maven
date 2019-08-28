package lemon.day08;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Tester {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		
		//输入流
		InputStream inStream = Tester.class.getResourceAsStream("/config/user.properties");
		//加载资源文件
		properties.load(inStream);
		//读取
		String name = properties.getProperty("name");
		String age = properties.getProperty("age");
		String gender = properties.getProperty("gender");
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
	}

}
