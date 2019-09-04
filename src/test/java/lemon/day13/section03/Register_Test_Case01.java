package lemon.day13.section03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lemon.day13.section01.HttpUtils;
import lemon.day13.section02.ExcelUtils;
import lemon.day13.section02.RegisterData;

public class Register_Test_Case01 {
	private static final String REGISTER_URL = "http://test.lemonban.com/futureloan/mvc/api/member/register";
	
	@DataProvider
	public Object[][] getData() {
		ArrayList<Object> dataList = ExcelUtils.readExcel("/case/register.xlsx", 0, Register.class);
		Object[][] dataArrays = new Object[dataList.size()][];
		for (int i = 0; i < dataArrays.length; i++) {
			Object[] dataArray = new  Object[1];
			dataArray[0] = dataList.get(i);
			dataArrays[i] = dataArray;
		}
		return dataArrays;
	}
	@Test(dataProvider = "getData")
  public void test_case(Register register) {
	  Map<String,String> paramMap =new  HashMap<String,String>();
	  paramMap.put("mobilephone", register.getMobilephone());
	  paramMap.put("pwd", register.getPwd());
	  paramMap.put("regname", register.getRegname());
	  String result = HttpUtils.post(REGISTER_URL, paramMap);
	  System.out.println(result);
  }
}
