package lemon.day20_reg.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;
import javax.print.DocFlavor.STRING;
import javax.sound.midi.Soundbank;


public class ParamUtils {

	public static void main(String[] args) {
//		String regStr = "{ \"mobile_phone\": \"$(mobile_phone)\",\"pwd\": \"$(pwd)\"}";
//		// 定义一个map，用于替换正则的内容
//		addGlobalMapData("mobile_phone","18373969442");
//		addGlobalMapData("pwd","123456");
//		String result = getReplaceStr(regStr);
//		System.out.println(result);
	}

	/**
	 * @author LiYinglong
	 *  获取全局变量池对应的数据
	 */
	private static Map<Object, Object> globalParamMap = new HashMap<>();

	/**
	 * @author LiYinglong
	 *传入key变量名获得value
	 */
	public static Object getGolbalData(String paramName) {
		return globalParamMap.get(paramName);
	}
	
	public static void addGlobalMapData(String key,String value) {
		globalParamMap.put(key, value);
	}
	
	/**
	 * 1.获得正则
	 *2.通过定义全局map，通过获得key去取值value，然后替换掉正则
	 */
	public static String getReplaceStr(String regStr) {


		// 正则\$\(.*\)
		String regex = "\\$\\((.*?)\\)";
		// 创建一个模式对象
		Pattern pattern = Pattern.compile(regex);
		// 把正则创建成一个匹配对象
		Matcher matcher = pattern.matcher(regStr);

		/*
		 * System.out.println(matcher.find()); System.out.println(matcher.group(0));
		 */
//		System.out.println(regStr);

		while (matcher.find()) {
			// group标示完全匹配
			String totalStr = matcher.group(0);
			String paramName = matcher.group(1);// 正则分组结果
//			System.out.println(totalStr + "----" + paramName);

			// 替换正则里面的东西
			if (paramName != null) {
				regStr = regStr.replace(totalStr, getGolbalData(paramName).toString());
			}
		}
		return regStr;
	}
}
