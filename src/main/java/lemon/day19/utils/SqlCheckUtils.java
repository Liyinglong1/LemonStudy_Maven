package lemon.day19.utils;

import java.util.LinkedHashMap;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import lemon.day19.pojo.ApiCaseDetail;
import lemon.day19.pojo.CellData;
import lemon.day19.pojo.SqlChecker;

public class SqlCheckUtils {

	/**
	 * 前置验证
	 * 
	 * @param apiCaseDetail
	 */
	public static void beforeCheck(ApiCaseDetail apiCaseDetail) {
		check(apiCaseDetail, 1);
	}

	/**
	 * 后置验证
	 * 
	 * @param apiCaseDetail
	 */
	public static void afterCheck(ApiCaseDetail apiCaseDetail) {
		check(apiCaseDetail, 2);
	}

	/**
	 * 表数据验证
	 * 
	 * @param apiCaseDetail
	 *            测试用例对象
	 * @param type
	 *            验证的类型： 1为前置验证 2 为后置验证
	 */
	private static void check(ApiCaseDetail apiCaseDetail, int type) {
		List<SqlChecker> sqlCheckerList = null;
		if (type == 1) {
			sqlCheckerList = apiCaseDetail.getBeforeCheckerList();
		} else if (type == 2) {
			sqlCheckerList = apiCaseDetail.getAfterCheckerList();
		}
		if (sqlCheckerList == null) {
			return;
		}
		for (SqlChecker sqlChecker : sqlCheckerList) {
			String expected = sqlChecker.getExpected();// 期望：[{"leave_amount":0.00,"type":1,"reg_name":"小柠檬"}]
			List<LinkedHashMap<String, Object>> resultList = DbUtils.excuteQuery(sqlChecker.getSql());// 从数据查询出来的
			String actual = JSONObject.toJSONString(resultList);// 实际
			//写回sql的实际执行结果
			ApiUtils.setSqlCellData(new CellData(sqlChecker.getRowNo(), 6, actual));
			//写回验证结果
			if (expected.equals(actual)) {
				ApiUtils.setSqlCellData(new CellData(sqlChecker.getRowNo(), 7, "成功"));
			}else{
				ApiUtils.setSqlCellData(new CellData(sqlChecker.getRowNo(), 7, "失败"));
			}
			//----忽略
			if (type == 1) {
				System.out.println("前置期望：" + expected);
				System.out.println("前置实际：" + actual);
			}else if (type ==2) {
				System.out.println("后置期望：" + expected);
				System.out.println("后置实际：" + actual);
			}
		}
	}

}
