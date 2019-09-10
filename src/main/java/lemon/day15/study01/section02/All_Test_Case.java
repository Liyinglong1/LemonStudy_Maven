package lemon.day15.study01.section02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lemon.day15.section02.ApiCaseDetail;


public class All_Test_Case {
	@DataProvider
	public Object[][] getData(){
		//接口需要的数据
		ArrayList<Object> ApiInfoCaseList = ExcelUtils.readExcel("/case/test_case_03.xlsx", 0, ApiInfoCase.class);
		//接口需要的URL
		ArrayList<Object> apidetailCaseList = ExcelUtils.readExcel("/case/test_case_03.xlsx",1,ApidetailCase.class);
		
		//定义一个Map 用于放ApidetailCase 对象  它是一个键值对
		HashedMap<String, ApidetailCase> ApidetailCaseMap = new HashedMap<String, ApidetailCase>();
		for (Object object : apidetailCaseList) {
			ApidetailCase apidetailCase = (ApidetailCase) object;
			ApidetailCaseMap.put(apidetailCase.getApiId(), apidetailCase);
		}
		Object[][] data = new Object[ApiInfoCaseList.size()][];
		for (int i = 0; i < data.length; i++) {
			ApiInfoCase apiInfoCase = (ApiInfoCase) ApiInfoCaseList.get(i);
			//接口详细里的apiId
			String apiId = apiInfoCase.getApiId(); 
			/*
			 * for (Object objects : apidetailCaseList) { ApidetailCase apidetailCase =
			 * (ApidetailCase)objects; //接口参数里的apiID String apidetailCaseApiId =
			 * apidetailCase.getApiId(); if (apidetailCaseApiId.equals(apiId)) {
			 * apiInfoCase.setApiInfo(apidetailCase); //
			 * System.out.println(apiInfoCase.getApiInfo()); break; } }
			 */
			
			apiInfoCase.setApiInfo(ApidetailCaseMap.get(apiInfoCase.getApiId()));
			Object [] ApiInfoCaseArray= {apiInfoCase};
			data[i] = ApiInfoCaseArray;
		}
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void test_case(ApiInfoCase apiInfoCase) {
		String url = apiInfoCase.getApiInfo().getUrl();
		String requestData = apiInfoCase.getRequestData(); 
		String result = HttpUtils.get(url, requestData);
		System.out.println(result);
	}
}
