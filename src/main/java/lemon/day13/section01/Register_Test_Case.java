package lemon.day13.section01;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

/**
 * 
{"status":0,"code":"20110","data":null,"msg":"手机号码已被注册"}
{"status":0,"code":"20109","data":null,"msg":"手机号码格式不正确"}
{"status":0,"code":"20108","data":null,"msg":"密码长度必须为6~18"}
{"status":0,"code":"20103","data":null,"msg":"手机号不能为空"}
 * @author happy
 * 方法的执行步骤一模一样--》代码冗余
 * url是不变的
 * 参数都是一样的
 * 回归测试之前，是可能有需要去修改参数值
 *
 */
public class Register_Test_Case {
	private static final String REGISTER_URL = "http://test.lemonban.com/futureloan/mvc/api/member/register";
	
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
