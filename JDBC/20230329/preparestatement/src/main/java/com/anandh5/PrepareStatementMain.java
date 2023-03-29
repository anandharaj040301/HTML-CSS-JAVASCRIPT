package com.anandh5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatementMain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/company";
		String uname="root";
		String pass="root";
		 Class.forName(driver);
		 Connection conn=DriverManager.getConnection(url, uname, pass);
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Employee Id:");
		 int id=sc.nextInt();
		 
		 String sel="Select * from employee where eid=?";
		 PreparedStatement pst=conn.prepareStatement(sel);
		 pst.setInt(1, id);
		 ResultSet rs=pst.executeQuery();
		 if (rs.next()) {
			 System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		 }

	}

}
