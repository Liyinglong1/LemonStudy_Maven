package lemon.day13.section02;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.DataProvider;

public class Register_Test_Case3 {
	private static final String REGISTER_URL = "http://test.lemonban.com/futureloan/mvc/api/member/register";
	
	/**
	 * 如果这些数据写到代码中好不好--》硬编码，这些可能会变化数据写死到代码中
	 * @return
	 */
	@DataProvider
	public Object[][] getData(){
		ArrayList<Object> dataList = ExcelUtils.readExcel("/case/register.xlsx", 0,RegisterData.class);
		Object[][] datas = new Object[dataList.size()][];
		for (int i = 0; i < dataList.size(); i++) {
			RegisterData registerData = (RegisterData) dataList.get(i);
			Object[] itemArray = new Object[1];
			itemArray[0] = registerData;
			datas[i] = itemArray;
		}
//		
//		Object[][] data = {
//				{"13888888886","123456","tom"},
//				{"13888888887","12345","tom"},
//				{"lemon","123456","tom"},
//				{"","","tom"},
//				{"13888888887","absdfkljssdfsdfsdfsdfsdfsdfsdfw",""},
//				{"asdlkfjsldf","","tom"},
//				{"13888888887","123456","tom"},
//		};
		return datas;
	}
	//数据库、xml、json、excel、properties
	
	@Test(dataProvider="getData")
	public void test_case(RegisterData registerData) {
		Map<String, String> paramMap = new HashMap<String, String>();
		//接口文档决定你要加啥参数
		paramMap.put("mobilephone", registerData.getPhone());
		paramMap.put("pwd", registerData.getPwd());
		paramMap.put("regname",registerData.getRegname());
		String result = HttpUtils.post(REGISTER_URL, paramMap);
		System.out.println(result);
	}
}
