package lemon.day15.study01.section01;

import java.util.ArrayList;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Register_Test_Case {
	@DataProvider
	public Object[][] getData() {
		ArrayList<Object> dataList = ExcelUtils.readExcel("/case/test_case_02.xlsx", 0, ApiEntity.class);
		Object[][] datas = new Object[dataList.size()][];
		for (int i = 0; i < datas.length; i++) {
			Object[] itemArray= { dataList.get(i) };
			datas[i] = itemArray;
		}
		return datas;
	}
	@Test(dataProvider = "getData")
	public void test_case(ApiEntity apiEntity) {
		String url = apiEntity.getUrl();
		String requestData =  apiEntity.getRequestData();
		String result = HttpUtils.get(url, requestData);
		System.out.println(result);
	}
}
