package lemon.day18.study01;

import java.io.InputStream;
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
import java.util.Properties;

import javax.sound.midi.Soundbank;

import org.testng.internal.ResultMap;

import com.alibaba.fastjson.JSON;


public class DbTester3 {
	public static List<HashMap<String, Object>> select() throws Exception{
		List<HashMap<String, Object>> allResultList = new ArrayList<HashMap<String,Object>>();
		InputStream inputStream = DbTester3.class.getResourceAsStream("/config/user.properties");
		Properties properties = new Properties();
		properties.load(inputStream);
		String url = properties.getProperty("jdbc.url");
		String user = properties.getProperty("jdbc.user");
		String password =properties.getProperty("jdbc.password");
		String driver = properties.getProperty("jdbc.driver");
		// 1:装载MySQL驱动程序Driver，安装驱动管理器DriverManager
		Class.forName(driver);
		//创建连接
		Connection conn = DriverManager.getConnection(url, user, password);
		//准备sql语句
		String sql = "select * from role";
		//创建执行对象
		Statement statement = conn.createStatement();
		//执行SQL
		ResultSet resultSet = statement.executeQuery(sql);
		// 获得结果节的元数据（描述数据的数据）
		ResultSetMetaData resultSetMeta = resultSet.getMetaData();
		//获得数据行数
		int resultCount = resultSetMeta.getColumnCount();
		//遍历结果
		int cout=0;
		while(resultSet.next()) {
			HashMap<String, Object> resultMap = new HashMap<String, Object>();
			for (int i = 1; i <= resultCount; i++) {
				
				
				String key = resultSetMeta.getColumnLabel(i);
//				System.out.println(key);
				Object value = resultSet.getObject(i);
				resultMap.put(key, value);
				
			}
			cout++;
			allResultList.add(resultMap);
//			System.out.println(id+" "+name+" "+remark+" "+disabled+" "+editor_id+" "+editor_name+" "+last_access+" "+version);
			
		}
		System.out.println(cout);
		//关闭创建的对象
		statement.close();
		conn.close();
		return allResultList;
	}
	
	public static void sqlUtil(String sql) throws Exception{
		InputStream inputStream = DbTester3.class.getResourceAsStream("/config/user.properties");
		Properties properties = new Properties();
		properties.load(inputStream);
		String url = properties.getProperty("jdbc.url");
		String user = properties.getProperty("jdbc.user");
		String password =properties.getProperty("jdbc.password");
		String driver = properties.getProperty("jdbc.driver");
		Connection conn = DriverManager.getConnection(url,user, password);
		Statement statement = conn.createStatement();
		statement.execute(sql);
		conn.close();
		statement.close();
	}
	
	public static void main(String[] args) throws Exception {
		
		List<HashMap<String, Object>> resultHashMaps = select();
		for (Map<String, Object> hashMap : resultHashMaps) {
			System.out.println(hashMap);
		}
	}
	
}
