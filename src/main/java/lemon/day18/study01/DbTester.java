package lemon.day18.study01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DbTester {
	public static void select() throws Exception{
		// 1:装载MySQL驱动程序Driver，安装驱动管理器DriverManager
		Class.forName("com.mysql.jdbc.Driver");
		//创建连接
		Connection conn = DriverManager.getConnection("jdbc:mysql://172.16.10.43:3306/eac", "root", "aokai100");
		//准备sql语句
		String sql = "select * from role";
		//创建执行对象
		Statement statement = conn.createStatement();
		//执行SQL
		ResultSet resultSet = statement.executeQuery(sql);
		//遍历结果
		while(resultSet.next()) {
			String id = resultSet.getString("id");
			String name = resultSet.getString("name");
			String remark = resultSet.getString("remark");
			String disabled = resultSet.getString("disabled");
			String editor_id = resultSet.getString("editor_id");
			String editor_name = resultSet.getString("editor_name");
			String last_access = resultSet.getString("last_access");
			String version = resultSet.getString("version");
			
			System.out.println(id+" "+name+" "+remark+" "+disabled+" "+editor_id+" "+editor_name+" "+last_access+" "+version);
			
		}
		//关闭创建的对象
		statement.close();
		conn.close();
	}
	
	public static void insert() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://172.16.10.43:3306/eac", "root", "aokai100");
		Statement statement = conn.createStatement();
		String sql = "insert into role(id,name,remark,disabled,editor_id,editor_name,last_access,version) values (\"66\",\"催收经理\",\"催收逾期订单跟踪日志\",\"1\",\"82\",\"吴难\",\"1530856165375\",\"2\")";
		statement.execute(sql);
		conn.close();
		statement.close();
	}
	
	public static void delete() throws Exception{
//		insert();
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://172.16.10.43:3306/eac", "root", "aokai100");
		Statement statement = conn.createStatement();
		String sql = "delete from role where id = 66";
		statement.execute(sql);
		conn.close();
		statement.close();
	}
	
	public static void update() throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://172.16.10.43:3306/eac", "root", "aokai100");
		Statement statement = conn.createStatement();
		String sql = "update role set editor_name ='李应龙' where id = 65";
		statement.execute(sql);
		conn.close();
		statement.close();
	}
}
