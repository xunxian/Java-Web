package com.org.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DBTest {
	private static Connection conn = null;
	private static PreparedStatement pstmt = null;
	private static ResultSet rs = null;
	private static final String URL = "jdbc:mysql://localhost:3306/test";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "123";

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
				String sql = "insert into user(username,password,sex) values(?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, "方顺洪");
				pstmt.setString(2, "abcd!234");
				pstmt.setString(3, "男");
				int len = pstmt.executeUpdate();
				if(len!=-1){
					JOptionPane.showMessageDialog(null, "插入成功，请查看！");
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

}
