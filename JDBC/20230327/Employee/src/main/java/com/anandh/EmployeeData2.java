package com.anandh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class EmployeeData2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/company";
		String uname="root";
		String pass="root";
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id");
		int id=sc.nextInt();
		
		Class.forName(driver);
		conn=DriverManager.getConnection(url, uname, pass);
		st=conn.createStatement();
		
		
		String result="Select * from employee where"+id;
		rs=st.executeQuery(result);
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("E-id\t|E-Name\t|E-Email\t\t|E-Phone\t|E-Salary\t|E-Age |");
		System.out.println("--------------------------------------------------------------------------------");
		// int id;
		
		if(rs.next()) {
//			id=rs.getInt(1);
//			System.out.println(rs.getInt(1));
			System.out.println(+rs.getInt(1)+"\t|"+rs.getString(2)+"\t|"+rs.getString(3)+"\t|"+rs.getString(4)+"\t|"+rs.getFloat(5)+"\t|"+rs.getInt(6)+"    |");
			System.out.println("--------------------------------------------------------------------------------");
		}
		else {
			System.out.println("Employee Id Invalid");
		}
		
		
	}

}
