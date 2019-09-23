package lemon.day20_reg.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lemon.day20_reg.pojo.ApiCaseDetail;
import lemon.day20_reg.pojo.ApiInfo;
import lemon.day20_reg.pojo.CellData;
import lemon.day20_reg.pojo.SqlChecker;

/**
 * 接口工具类
 * 
 * @author happy
 *
 */
public class ApiUtils {

	// 创建一个数据池，保存要回写的数据
	public static List<CellData> cellDataList = new ArrayList<CellData>();

	// 把一个要写回的数据对象保存到数据池中
	public static void setCellData(CellData cellData) {
		cellDataList.add(cellData);
	}

	// 获得整个容器
	public static List<CellData> getCellDataList() {
		return cellDataList;
	}
	//------------------------------------------------------------------------
	// 创建一个数据池，保存要回写的数据
	public static List<CellData> sqlCellDataList = new ArrayList<CellData>();

	// 把一个要写回的数据对象保存到数据池中
	public static void setSqlCellData(CellData cellData) {
		sqlCellDataList.add(cellData);
	}

	// 获得整个容器
	public static List<CellData> getSqlCellDataList() {
		return sqlCellDataList;
	}

	/**
	 * 为数据提供者提供数据--》工具方法<br>
	 */
	public static Object[][] getData() {
		// 读取测试用例的详细数据列表
		ArrayList<Object> apiCaseDetailList = ExcelUtils.readExcel("/case17/test_case_reg.xlsx", 0, ApiCaseDetail.class);
		// 接口的基本信息
		ArrayList<Object> apiInfoList = ExcelUtils.readExcel("/case17/test_case_reg.xlsx", 1, ApiInfo.class);
		// 测试用例的表数据验证信息
		ArrayList<Object> sqlCheckerList = ExcelUtils.readExcel("/case17/test_case_reg.xlsx", 2, SqlChecker.class);

		// 每条测试用例都对应有一个接口基本信息：接口基本信息是测试用例对象的一个属性
		// 把List的中间数据重新组装到map中去
		Map<String, ApiInfo> apiInfoMap = new HashMap<>();
		for (Object obj : apiInfoList) {
			ApiInfo apiInfo = (ApiInfo) obj;
			apiInfoMap.put(apiInfo.getApiId(), apiInfo);
		}

		//准备一个容器，存放不同测试用例的前置或者后置sql列表
		Map<String, List<SqlChecker>> sqlMap = new HashMap<String, List<SqlChecker>>();
		
		// 遍历所有的sql验证数据
		for (Object sqlObj : sqlCheckerList) {
			SqlChecker sqlChecker = (SqlChecker) sqlObj;
			//以测试用例的id拼接上-再拼接上sql的类型
			String key = sqlChecker.getCaseId() + "-" + sqlChecker.getType();
			//1-bf  -->
			//1-af  -->
			//2-bf
			//2-af
			//8-af -->测试用例8的后置sql列表对应的key
			List<SqlChecker> checkerList = sqlMap.get(key);
			if (checkerList == null) {
				checkerList = new ArrayList<SqlChecker>();
			}
			checkerList.add(sqlChecker);//添加到对应的篮子
			sqlMap.put(key, checkerList);
		}

		Object[][] datas = new Object[apiCaseDetailList.size()][];
		for (int i = 0; i < apiCaseDetailList.size(); i++) {
			// 获取到当前索引的api的详细信息对象
			ApiCaseDetail apiCaseDetail = (ApiCaseDetail) apiCaseDetailList.get(i);
			// 获取到api详细信息对象设置到用例详细对象中
			apiCaseDetail.setApiInfo(apiInfoMap.get(apiCaseDetail.getApiId()));

			// 设置前置后后置验证sql列表
			String beforeKey = apiCaseDetail.getCaseId() + "-"+"bf";//1-bf   2-af
			String afterKey = apiCaseDetail.getCaseId() + "-"+"af";
			apiCaseDetail.setBeforeCheckerList(sqlMap.get(beforeKey));
			apiCaseDetail.setAfterCheckerList(sqlMap.get(afterKey));

			Object[] itemArray = { apiCaseDetail };
			datas[i] = itemArray;
		}
		return datas;
	}

}
