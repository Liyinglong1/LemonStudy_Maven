package lemon.day13.section02;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.testng.annotations.DataProvider;

public class Register_Test_Case5 {
	private static final String REGISTER_URL = "http://test.lemonban.com/futureloan/mvc/api/member/register";
	
	/**
	 * 如果这些数据写到代码中好不好--》硬编码，这些可能会变化数据写死到代码中
	 * @return
	 */
	@DataProvider
	public Object[][] getData(){
		//excel中读取出来的数据
		ArrayList<Object> dataList = ExcelUtils.readExcel("/case/register.xlsx", 0,RegisterData.class);
		//创建一个数据提供者需要二维数组，长度为excel数据行的行数
		Object[][] datas = new Object[dataList.size()][];
		//遍历excel中读取出来的数据dataList,每一行都是一个RegisterData对象--》放到一个一维数组中
		for (int i = 0; i < dataList.size(); i++) {
//			RegisterData registerData = (RegisterData) dataList.get(i);
			//创建了一个一维数组--》数组长度为多少--》长度为1
			Object[] itemArray = new Object[1];
			itemArray[0] = dataList.get(i);//itemArray最大索引就是0
			//把一维数组放到二维数组对应的位置
			datas[i] = itemArray;
		}
//		
		/*Object[][] data = {
				{"13888888886","123456","tom"},
				{"13888888887","12345","tom"},
				{"lemon","123456","tom"},
				{"","","tom"},
				{"13888888887","absdfkljssdfsdfsdfsdfsdfsdfsdfw",""},
				{"asdlkfjsldf","","tom"},
				{"13888888887","123456","tom"},
		};*/
		/*Object[][] data = {
				{registerData}, ---> {registerData}--》一个只有一个元素的一维数组
				{registerData},
				{registerData},
				{registerData},
				{registerData},
		};*/
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
