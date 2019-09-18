package lemon.day15.section03;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lemon.day15.section01.HttpUtils;
import lemon.day15.section03.ApiCase;;

public class Register_Test_Case {
	@DataProvider
	public Object[][] getData(){
		ArrayList<Object> dataList = ExcelUtils.readExcel("/case/test_case_02.xlsx", 0, ApiCase.class);
		Object[][] dataArrays = new Object[dataList.size()][];
		for (int i = 0; i < dataArrays.length; i++) {
			Object[] dataArray = new  Object[1];
			dataArray[0] = dataList.get(i);
			dataArrays[i] = dataArray;
		}
		System.out.println(dataList);
		return dataArrays;
	}
	
	
	@Test(dataProvider = "getData")
	 public void test_case(ApiCase apiCase) {
		  String requestData = apiCase.getRequestData();
		  String url = apiCase.getRequestData();
		  String result = HttpUtils.post(url, requestData);
		  System.out.println(result);
	  }
}
