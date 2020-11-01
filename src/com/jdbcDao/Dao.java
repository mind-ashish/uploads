package com.jdbcDao;

import java.sql.*;
import java.io.*;
import java.util.*;

public class Dao {
	public static String makeQuery(String query) throws Exception {
		query="select fileName from Path_Table where fileName = abc.txt ";
		String url="jdbc:mysql://localhost::3306/test_db";
		String userName="root";
		String password="";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,userName,password);		
		Statement st=con.createStatement();
		ResultSet rs= st.executeQuery(query);
		rs.next();
		//System.out.println(rs.getString("fileName"));
		
		st.close();
		con.close();
		
		return rs.getString("fileName");
	}
}
