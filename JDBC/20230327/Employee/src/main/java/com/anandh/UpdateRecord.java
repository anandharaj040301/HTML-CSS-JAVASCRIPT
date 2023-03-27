package com.anandh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecord {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/company";
		String un="root";
		String pass="root";
		Connection conn=null;
		Statement st=null;
		ResultSet rs=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee id to update Record");
		int id=sc.nextInt();
		System.out.println("Enter name to change");
		String name=sc.next();
		
		//load the driver
		Class.forName(driver);
		
		//make the connection
		conn=DriverManager.getConnection(url,un,pass);
		//create a statement
		
		st=conn.createStatement();
		//execute query
		//check first record existe
		
		String sel="select * from employee where eid="+id;
		rs=st.executeQuery(sel);
		if(rs.next()) {  //if record exists go for delete
		
		String s="update employee set ename='"+name+"' where eid="+id;
		//rs=st.executeQuery(s);
	     int retval=st.executeUpdate(s);
		
		if(retval>0) {
			System.out.println("Record is updated");
		}
	}//if(rs.next())
		
		else {
			System.out.println("Employee with id="+id+" not exists");
		}
		
	}

}