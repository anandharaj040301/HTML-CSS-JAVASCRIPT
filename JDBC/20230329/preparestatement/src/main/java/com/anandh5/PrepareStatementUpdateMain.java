package com.anandh5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PrepareStatementUpdateMain {

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
		 
		 String check="Select * from employee where eid=?";
		 PreparedStatement pst=conn.prepareStatement(check);
		 pst.setInt(1, id);
		 ResultSet rs=pst.executeQuery();
		 if(!rs.next()) {
		 System.out.println("Enter Employee name:");
		 String ename=sc.next();
		 System.out.println("Enter Employee Email:");
		 String eemail=sc.next();
		 System.out.println("Enter Employee Phone Number:");
		 String ephone=sc.next();
		 System.out.println("Enter Employee Salary:");
		 float esalary=sc.nextFloat();
		 System.out.println("Enter Employee Age:");
		 int eage=sc.nextInt();
		 String sel="Insert into employee values(?,?,?,?,?,?)";
		 PreparedStatement pst2=conn.prepareStatement(sel);
		 pst2.setInt(1, id);
		 pst2.setString(2, ename);
		 pst2.setString(3, eemail);
		 pst2.setString(4, ephone);
		 pst2.setFloat(5, esalary);
		 pst2.setInt(6, eage);
		 
		 int ret=pst2.executeUpdate();
		 if (ret>0) {
			 System.out.println("Record is Inserted");
		 }
		 else {
			 System.out.println("Something Went Wrong");
		 }
		 }
		 else {
			 System.out.println("invalid id");
		 }
	}

}
