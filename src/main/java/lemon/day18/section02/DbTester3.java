package lemon.day18.section02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbTester3 {

	public static void main(String[] args) throws Exception {
		// excute("insert into member(reg_name,pwd,mobile_phone)
		// values('happy','123456','13888888888');");
		// excute("update member set leave_amount=50000000.00 where id=6;");
		// excute("delete from member where id=6;");
		// excuteQuery("select id,reg_name,mobile_phone,pwd from member;");
		
		List<HashMap<String, Object>> allResultSet = excuteQuery("select * from invest");
		for (HashMap<String, Object> hashMap : allResultSet) {
			System.out.println(hashMap);
		}
	}

	// 增删改
	private static void excute(String sql) throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://120.78.128.25:3306/futureloan";
		String user = "future";
		String password = "123456";
		// 1:装载MySQL驱动程序Driver，安装驱动管理器DriverManager
		Class.forName("com.mysql.jdbc.Driver");
		// 2:建立连接
		Connection conn = DriverManager.getConnection(url, user, password);
		// 4:创建陈述对象
		Statement stmt = conn.createStatement();
		// 5:执行SQL语句
		stmt.execute(sql);
		// 6:关闭资源（关闭陈述对象，关闭连接）
		stmt.close();
		conn.close();
	}

	private static List<HashMap<String, Object>> excuteQuery(String sql) throws Exception {
		//保存所有记录的list集合
		List<HashMap<String, Object>> allResultSet = new ArrayList<HashMap<String,Object>>();
		
		String url = "jdbc:mysql://120.78.128.25:3306/futureloan";
		String user = "future";
		String password = "123456";
		// 1:装载MySQL驱动程序Driver，安装驱动管理器DriverManager
		Class.forName("com.mysql.jdbc.Driver");
		// 2:建立连接
		Connection conn = DriverManager.getConnection(url, user, password);
		// 4:创建陈述对象
		Statement stmt = conn.createStatement();
		// 5:执行SQL语句
		ResultSet resultSet = stmt.executeQuery(sql);
		// 获得结果节的元数据（描述数据的数据）
		ResultSetMetaData metaData = resultSet.getMetaData();
		// 获得列数 10??
		int columnCount = metaData.getColumnCount();
		// 1：结果可能没有，1条或者多条，每条有1个字段和多个字段
		while (resultSet.next()) {
			// 数据库查询出来的每一条记录都是一个map
			HashMap<String, Object> resultMap = new HashMap<String, Object>();
			// 这一行有很多列表，现在要把列名作为key，对应记录的的列值作为map的值
			// 动态获得记录的列数
			// 循环所有列
			for (int i = 1; i <= columnCount; i++) {
				//列名
				String columnName = metaData.getColumnLabel(i);
				//列值值
				Object columnValue = resultSet.getObject(i);
				//put到对应结果map中
				resultMap.put(columnName, columnValue);
			}
			//添加到list中去
			allResultSet.add(resultMap);
		}
		// 6:关闭资源（关闭陈述对象，关闭连接）
		stmt.close();
		conn.close();
		return allResultSet;
	}

}
