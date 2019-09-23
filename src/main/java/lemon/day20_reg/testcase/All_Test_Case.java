package lemon.day20_reg.testcase;

import java.util.List;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lemon.day20_reg.pojo.*;
import lemon.day20_reg.utils.*;
/**
 * 正向的注册测试用例--》注册成功
 * 执行测试用例前需要做的验证：-->前置验证
 * 	1：查看数据是否用了对应的用户记录--》期望数据库不存在该用户记录
 * 		select count(*) from member where mobile_phone = '13855557777';  --> count(1) 为0
 * 执行测试用例后需要做的验证：-->后置验证
 * 	1：查看数据库是否已经有了对应的用户记录
 * 		select count(*) from member where mobile_phone = '13855557777';  --> count(1) 为1
 * 	2：查看用户的余额为0.00
 * 	3：查看用户的类型为默认的1
 * 	4：查看用户的昵称为默认是：小柠檬
 * 		select leave_amount,type,reg_name from member where mobile_phone = '13855557777';
 * 		leave_amount,type,reg_name  --> 0.00,1,小柠檬
 * 
 * [
 * 	{"leave_amount":0.00,"type":1,"reg_name":"小柠檬"},
 * 	{"leave_amount":0.00,"type":1,"reg_name":"小柠檬"}
 * ]
	这样设计的话，可以是1行记录，也是多行
 * @author happy
 *
 */
public class All_Test_Case {
	@BeforeSuite
	public void BeforeSuite() {
		ParamUtils.addGlobalMapData("mobile_phone", "18373969442");
		ParamUtils.addGlobalMapData("pwd", "123456");
	}
	@DataProvider
	public Object[][] getData() {
		return ApiUtils.getData();
	}

	
	@Test(dataProvider = "getData")
	public void test_case(ApiCaseDetail apiCaseDetail) throws Exception{
		//1:前置验证
		SqlCheckUtils.beforeCheck(apiCaseDetail);
		
		String actualResult = HttpUtils.excute(apiCaseDetail);
		CellData cellData = new CellData(apiCaseDetail.getRowNo(), 4, actualResult);
		ApiUtils.setCellData(cellData);
		//2:后置验证
		SqlCheckUtils.afterCheck(apiCaseDetail);
		
		AssertUtils.assertRespKeyInfo(apiCaseDetail,actualResult);
		System.out.println(actualResult);
	}
	
	@AfterSuite
	public void afterSuite(){
		ExcelUtils.batchWrite("/case17/test_case_reg.xlsx","d://api.xlsx",0);
		ExcelUtils.batchWrite2("/case17/test_case_reg.xlsx","d://api-1.xlsx",2);	
	}
	
}
