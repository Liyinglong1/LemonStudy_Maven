package lemon.day13.section02;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.DataProvider;

public class Register_Test_Case6 {
	private static final String REGISTER_URL = "http://test.lemonban.com/futureloan/mvc/api/member/register";

	@DataProvider
	public Object[][] getData() {
		ArrayList<Object> dataList = ExcelUtils.readExcel("/case/register.xlsx", 0, RegisterData.class);
		Object[][] datas = new Object[dataList.size()][];
		for (int i = 0; i < dataList.size(); i++) {
			Object[] itemArray = {dataList.get(i)};
			datas[i] = itemArray;
		}
		
		/*int i=0;//自己控制索引
		for (Object object : dataList) {
			Object[] itemArray = {object};
			datas[i] = itemArray;
			i++;
		}*/
		return datas;
	}

	@Test(dataProvider = "getData")
	public void test_case(RegisterData registerData) {
		Map<String, String> paramMap = new HashMap<String, String>();
		// 接口文档决定你要加啥参数
		paramMap.put("mobilephone", registerData.getPhone());
		paramMap.put("pwd", registerData.getPwd());
		paramMap.put("regname", registerData.getRegname());
		String result = HttpUtils.post(REGISTER_URL, paramMap);
		System.out.println(result);
	}
}
