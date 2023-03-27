package com.anandh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecord2 {

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
		
		System.out.println("Which Field You Want to Update:");
		System.out.println("If you want to update Employee Name Press : 1");
		System.out.println("If you want to update Employee Email Press : 2");
		System.out.println("If you want to update Employee Phone Press : 3");
		System.out.println("If you want to update Employee Salary Press : 4");
		System.out.println("If you want to update Employee Age Press : 5");
		int selection=sc.nextInt();
		switch(selection) {
		case 1:
		System.out.println("Enter name to change");
		String name=sc.next();
		String s="update employee set ename='"+name+"' where eid="+id;
		//rs=st.executeQuery(s);
	     int retval=st.executeUpdate(s);
		
		if(retval>0) {
			System.out.println("Employee Name is updated");
			String result="select * from employee where eid="+id;
			rs=st.executeQuery(result);
			System.out.println("----------------------------------------------------------------------------------------");
			System.out.println("E-id\t|E-Name\t|E-Email\t\t|E-Phone\t|E-Salary\t|E-Age |");
			System.out.println("----------------------------------------------------------------------------------------");
			// int id;
			
			while(rs.next()) {
//				id=rs.getInt(1);
//				System.out.println(rs.getInt(1));
				System.out.println(rs.getInt(1)+"\t|"+rs.getString(2)+"\t|"+rs.getString(3)+"\t|"+rs.getString(4)+"\t|"+rs.getFloat(5)+"\t|"+rs.getInt(6)+"    |");
				System.out.println("----------------------------------------------------------------------------------------");
			}
		}
		break;
		case 2:
			System.out.println("Enter Email to change");
			String email=sc.next();
			String c="update employee set eemail='"+email+"' where eid="+id;
			//rs=st.executeQuery(s);
		     int retval1=st.executeUpdate(c);
			
			if(retval1>0) {
				System.out.println("Employee Email is updated");
				String result="select * from employee where eid="+id;
				rs=st.executeQuery(result);
				System.out.println("----------------------------------------------------------------------------------------");
				System.out.println("E-id\t|E-Name\t|E-Email\t\t|E-Phone\t|E-Salary\t|E-Age |");
				System.out.println("----------------------------------------------------------------------------------------");
				// int id;
				
				while(rs.next()) {
//					id=rs.getInt(1);
//					System.out.println(rs.getInt(1));
					System.out.println(rs.getInt(1)+"\t|"+rs.getString(2)+"\t|"+rs.getString(3)+"\t|"+rs.getString(4)+"\t|"+rs.getFloat(5)+"\t|"+rs.getInt(6)+"    |");
					System.out.println("----------------------------------------------------------------------------------------");
				}
			}
			break;
		case 3:
			System.out.println("Enter Phone Number to change");
			String ephone=sc.next();
			String d="update employee set ephone='"+ephone+"' where eid="+id;
			//rs=st.executeQuery(s);
		     int retval2=st.executeUpdate(d);
			
			if(retval2>0) {
				System.out.println("Employee Phone Number is updated");
				String result="select * from employee where eid="+id;
				rs=st.executeQuery(result);
				System.out.println("----------------------------------------------------------------------------------------");
				System.out.println("E-id\t|E-Name\t|E-Email\t\t|E-Phone\t|E-Salary\t|E-Age |");
				System.out.println("----------------------------------------------------------------------------------------");
				// int id;
				
				while(rs.next()) {
//					id=rs.getInt(1);
//					System.out.println(rs.getInt(1));
					System.out.println(rs.getInt(1)+"\t|"+rs.getString(2)+"\t|"+rs.getString(3)+"\t|"+rs.getString(4)+"\t|"+rs.getFloat(5)+"\t|"+rs.getInt(6)+"    |");
					System.out.println("----------------------------------------------------------------------------------------");
				}
			}
			break;
		case 4:
			System.out.println("Enter Salary to change");
			String esalary=sc.next();
			String e="update employee set esalary='"+esalary+"' where eid="+id;
			//rs=st.executeQuery(s);
		     int retval3=st.executeUpdate(e);
			
			if(retval3>0) {
				System.out.println("Employee Salary is updated");
				String result="select * from employee where eid="+id;
				rs=st.executeQuery(result);
				System.out.println("----------------------------------------------------------------------------------------");
				System.out.println("E-id\t|E-Name\t|E-Email\t\t|E-Phone\t|E-Salary\t|E-Age |");
				System.out.println("----------------------------------------------------------------------------------------");
				// int id;
				
				while(rs.next()) {
//					id=rs.getInt(1);
//					System.out.println(rs.getInt(1));
					System.out.println(rs.getInt(1)+"\t|"+rs.getString(2)+"\t|"+rs.getString(3)+"\t|"+rs.getString(4)+"\t|"+rs.getFloat(5)+"\t|"+rs.getInt(6)+"    |");
					System.out.println("----------------------------------------------------------------------------------------");
			}
			}
			break;
		case 5:
			System.out.println("Enter Age to change");
			String eage=sc.next();
			String f="update employee set eage='"+eage+"' where eid="+id;
			//rs=st.executeQuery(s);
		     int retval4=st.executeUpdate(f);
			
			if(retval4>0) {
				System.out.println("Employee Age is updated");
				String result="select * from employee where eid="+id;
				rs=st.executeQuery(result);
				System.out.println("----------------------------------------------------------------------------------------");
				System.out.println("E-id\t|E-Name\t|E-Email\t\t|E-Phone\t|E-Salary\t|E-Age |");
				System.out.println("----------------------------------------------------------------------------------------");
				// int id;
				
				while(rs.next()) {
//					id=rs.getInt(1);
//					System.out.println(rs.getInt(1));
					System.out.println(rs.getInt(1)+"\t|"+rs.getString(2)+"\t|"+rs.getString(3)+"\t|"+rs.getString(4)+"\t|"+rs.getFloat(5)+"\t|"+rs.getInt(6)+"    |");
					System.out.println("----------------------------------------------------------------------------------------");
				}
			}
			break;
			default:
				System.out.println("Enter Correct Choice");
	}
	}//if(rs.next())
		
		else {
			System.out.println("Employee with id="+id+" not exists");
		}
		
	}

}