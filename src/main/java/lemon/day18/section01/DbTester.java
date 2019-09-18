package lemon.day18.section01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbTester {

	public static void main(String[] args) throws Exception {
		// insert();
		// update();
		// delete();
		select();
	}

	private static void insert() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://120.78.128.25:3306/futureloan";
		String user = "future";
		String password = "123456";

		// 1:装载MySQL驱动程序Driver，安装驱动管理器DriverManager
		Class.forName("com.mysql.jdbc.Driver");
		// 2:建立连接
		Connection conn = DriverManager.getConnection(url, user, password);
		// 3:准备SQL语句
		String sql = "insert into member(reg_name,pwd,mobile_phone) values('happy','123456','13888888888');";
		// 4:创建陈述对象
		Statement stmt = conn.createStatement();
		// 5:执行SQL语句
		stmt.execute(sql);
		// 6:关闭资源（关闭陈述对象，关闭连接）
		stmt.close();
		conn.close();
	}

	private static void update() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://120.78.128.25:3306/futureloan";
		String user = "future";
		String password = "123456";

		// 1:装载MySQL驱动程序Driver，安装驱动管理器DriverManager
		Class.forName("com.mysql.jdbc.Driver");
		// 2:建立连接
		Connection conn = DriverManager.getConnection(url, user, password);
		// 3:准备SQL语句
		String sql = "update member set leave_amount=10000000.00 where id=1;";
		// 4:创建陈述对象
		Statement stmt = conn.createStatement();
		// 5:执行SQL语句
		stmt.execute(sql);
		// 6:关闭资源（关闭陈述对象，关闭连接）
		stmt.close();
		conn.close();
	}

	private static void delete() throws ClassNotFoundException, SQLException {
		String url = "jdbc:mysql://120.78.128.25:3306/futureloan";
		String user = "future";
		String password = "123456";

		// 1:装载MySQL驱动程序Driver，安装驱动管理器DriverManager
		Class.forName("com.mysql.jdbc.Driver");
		// 2:建立连接
		Connection conn = DriverManager.getConnection(url, user, password);
		// 3:准备SQL语句
		String sql = "delete from member where id=1;";
		// 4:创建陈述对象
		Statement stmt = conn.createStatement();
		// 5:执行SQL语句
		stmt.execute(sql);
		// 6:关闭资源（关闭陈述对象，关闭连接）
		stmt.close();
		conn.close();
	}

	private static void select() throws Exception {
		String url = "jdbc:mysql://120.78.128.25:3306/futureloan";
		String user = "future";
		String password = "123456";
		// 1:装载MySQL驱动程序Driver，安装驱动管理器DriverManager
		Class.forName("com.mysql.jdbc.Driver");
		// 2:建立连接
		Connection conn = DriverManager.getConnection(url, user, password);
		// 3:准备SQL语句
		String sql = "select id,reg_name,mobile_phone,pwd from member;";
		// 4:创建陈述对象
		Statement stmt = conn.createStatement();
		// 5:执行SQL语句
		ResultSet resultSet = stmt.executeQuery(sql);
		while (resultSet.next()) {
			int id = resultSet.getInt(1);
			String regName = resultSet.getString(2);
			String phone = resultSet.getString(3);
			String pwd = resultSet.getString(4);
			System.out.println(id + "  " + regName + "  " + phone + "  " + pwd);
		}
		// 6:关闭资源（关闭陈述对象，关闭连接）
		stmt.close();
		conn.close();
	}

}
