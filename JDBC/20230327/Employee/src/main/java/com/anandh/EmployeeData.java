package com.anandh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class EmployeeData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/company";
		String uname="root";
		String pass="root";
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		
		Class.forName(driver);
		conn=DriverManager.getConnection(url, uname, pass);
		st=conn.createStatement();
		String result="Select * from employee";
		rs=st.executeQuery(result);
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("E-id\t|E-Name\t|E-Email\t\t|E-Phone\t|E-Salary\t|E-Age |");
		System.out.println("----------------------------------------------------------------------------------------");
		// int id;
		
		while(rs.next()) {
//			id=rs.getInt(1);
//			System.out.println(rs.getInt(1));
			System.out.println("|"+rs.getInt(1)+"\t|"+rs.getString(2)+"\t|"+rs.getString(3)+"\t|"+rs.getString(4)+"\t|"+rs.getFloat(5)+"\t|"+rs.getInt(6)+"    |");
			System.out.println("----------------------------------------------------------------------------------------");
		}
		
		
	}

}
