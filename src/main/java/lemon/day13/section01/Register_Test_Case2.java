package lemon.day13.section01;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class Register_Test_Case2 {
	private static final String REGISTER_URL = "http://test.lemonban.com/futureloan/mvc/api/member/register";
	
	@Test
	public void test_case(String mobilephone,String pwd) {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("mobilephone", mobilephone);
		paramMap.put("pwd", pwd);
		String result = HttpUtils.post(REGISTER_URL, paramMap);
		System.out.println(result);
	}
	
	@Test
	public void test_case_1() {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("mobilephone", "13888888887");
		paramMap.put("pwd", "123456");
		String result = HttpUtils.post(REGISTER_URL, paramMap);
		System.out.println(result);
	}

	@Test
	public void test_case_2() {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("mobilephone", "lemon");
		paramMap.put("pwd", "123456");
		String result = HttpUtils.post(REGISTER_URL, paramMap);
		System.out.println(result);
	}

	@Test
	public void test_case_3() {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("mobilephone", "13888888888");
		paramMap.put("pwd", "12345");
		String result = HttpUtils.post(REGISTER_URL, paramMap);
		System.out.println(result);
	}

	@Test
	public void test_case_4() {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("mobilephone", "");
		paramMap.put("pwd", "");
		String result = HttpUtils.post(REGISTER_URL, paramMap);
		System.out.println(result);
	}

}
