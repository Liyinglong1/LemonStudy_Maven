package lemon.day13.section01;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;

public class Register_Test_Case3 {
	private static final String REGISTER_URL = "http://test.lemonban.com/futureloan/mvc/api/member/register";
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = {
				{"13888888886","123456","tom"},
				{"13888888887","12345","tom"},
				{"lemon","123456","tom"},
				{"","","tom"},
				{"13888888887","absdfkljssdfsdfsdfsdfsdfsdfsdfw",""},
				{"asdlkfjsldf","","tom"},
				{"13888888887","123456","tom"},
		};
		return data;
	}

	@Test(dataProvider="getData")
	public void test_case(String mobilephone, String pwd,String regname) {
		Map<String, String> paramMap = new HashMap<String, String>();
		//接口文档决定你要加啥参数
		paramMap.put("mobilephone", mobilephone);
		paramMap.put("pwd", pwd);
		paramMap.put("regname",regname);
		String result = HttpUtils.post(REGISTER_URL, paramMap);
		System.out.println(result);
	}
}
