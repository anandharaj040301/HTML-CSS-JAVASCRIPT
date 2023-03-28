package com.anandh3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseOperation {
	private static Connection conn;
	private static Statement st;
	private static ResultSet rs;
	static Scanner sc=new Scanner(System.in);

	public static void DisplayAll() throws ClassNotFoundException, SQLException {
		conn=DatabaseConnection.getDatabaseConnection();
		st=conn.createStatement();
		String s="Select * from employee";
		rs=st.executeQuery(s);
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("                              All Records");
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("E-id\t |EName\t\t |EEmail\t\t |EPhone\t |ESalary\t |EAge");
		System.out.println("------------------------------------------------------------------------------------------------");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t |"+rs.getString(2)+"\t\t |"+rs.getString(3)+"\t |"+rs.getString(4)+"\t |"+rs.getFloat(5)+"\t |"+rs.getInt(6));
			System.out.println("------------------------------------------------------------------------------------------------");
		}
		
		
	}

	public static void getRecordBasedOnId() throws ClassNotFoundException, SQLException {
		conn=DatabaseConnection.getDatabaseConnection();
		st=conn.createStatement();
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("                      Display Record Based on Employee Id");
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Enter Employee Id :");
		System.out.println("-------------------");
		int Id=sc.nextInt();
		System.out.println("------------------------------------------------------------------------------------------------");
		String sel="select * from employee where eid="+Id;
		   rs=st.executeQuery(sel);
		   if(rs.next()) {
		String s="Select * from employee where eid="+Id;
		rs=st.executeQuery(s);
		System.out.println("E-id\t |EName\t\t |EEmail\t\t |EPhone\t |ESalary\t |EAge");
		System.out.println("------------------------------------------------------------------------------------------------");
		if(rs.next()) {
			System.out.println(rs.getInt(1)+"\t |"+rs.getString(2)+"\t\t |"+rs.getString(3)+"\t |"+rs.getString(4)+"\t |"+rs.getFloat(5)+"\t |"+rs.getInt(6));
			System.out.println("------------------------------------------------------------------------------------------------");
		}
		
		}
		   else {
				System.out.println("Invalid Employee Id: "+Id);
				System.out.println("------------------------------------------------------------------------------------------------");
			   
		   }
		
		
	}

	public static void insertRecord() throws ClassNotFoundException, SQLException {
		conn=DatabaseConnection.getDatabaseConnection();
		st=conn.createStatement();
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("                              Insert New Record");
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Enter employee id :");
		System.out.println("-------------------");
		int Id=sc.nextInt();
		String sel="select * from employee where eid="+Id;
		   rs=st.executeQuery(sel);
		   if(!rs.next()) {
		System.out.println("Enter employee Name :");
		System.out.println("---------------------");
		String Name=sc.next();
		System.out.println("Enter employee Email :");
		System.out.println("----------------------");
		String Email=sc.next();
		System.out.println("Enter employee Phone Number:");
		System.out.println("----------------------------");
		String phone=sc.next();
		System.out.println("Enter employee Salary :");
		System.out.println("-----------------------");
		float Salary=sc.nextFloat();
		System.out.println("Enter employee Age :");
		System.out.println("--------------------");
		int age=sc.nextInt();
		System.out.println("------------------------------------------------------------------------------------------------");
		String insert="insert into employee values("+Id+",'"+Name+"','"+Email+"','"+phone+"',"+Salary+","+age+")";
		int ret=st.executeUpdate(insert);
		if(ret>0) {
			System.out.println("New Record Inserted Successfully");
			String result="select * from employee where eid="+Id;
			rs=st.executeQuery(result);
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("E-id\t |EName\t\t |EEmail\t\t |EPhone\t |ESalary\t |EAge");
			System.out.println("------------------------------------------------------------------------------------------------");
			
			
			while(rs.next()) {
			
				System.out.println(rs.getInt(1)+"\t |"+rs.getString(2)+"\t\t |"+rs.getString(3)+"\t |"+rs.getString(4)+"\t |"+rs.getFloat(5)+"\t |"+rs.getInt(6));
				System.out.println("------------------------------------------------------------------------------------------------");
		}
		}
		else {
			System.out.println(" Insert Failed");
			System.out.println("------------------------------------------------------------------------------------------------");
		}
		   }
		else {
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("Employee Id: "+Id+" is Already Exist");
			System.out.println("------------------------------------------------------------------------------------------------");
		}
		
	}
		


	public static void deleteRecord() throws ClassNotFoundException, SQLException {
		conn=DatabaseConnection.getDatabaseConnection();
		st=conn.createStatement();
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("                            Delete Existing Record");
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Enter employee id :");
		System.out.println("-------------------");
		int id=sc.nextInt();
		String sel="select * from employee where eid="+id;
		rs=st.executeQuery(sel);
		if(rs.next()) { 
		String s="delete from employee where eid="+id;
		int retval=st.executeUpdate(s);
		
		if(retval>0) {
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("Record is deleted");
			System.out.println("------------------------------------------------------------------------------------------------");
		}
	}//if(rs.next())
		
		else {
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("Employee id="+id+" not exists");
			System.out.println("------------------------------------------------------------------------------------------------");
		}
		
	}

		
	

	public static void updateRecord() throws ClassNotFoundException, SQLException {
		conn=DatabaseConnection.getDatabaseConnection();
		st=conn.createStatement();
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("                            Update Existing Record");
		System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("Enter employee id to update Record");
		int id=sc.nextInt();
		String sel="select * from employee where eid="+id;
		rs=st.executeQuery(sel);
		if(rs.next()) {
			System.out.println("------------------------------------------------------------------------------------------------");
		System.out.println("                        Which Field You Want to Update:");
		System.out.println("************************************************************************************************");
		System.out.println("  1--> Employee Name");
		System.out.println("  2--> Employee Email ");
		System.out.println("  3--> Employee Phone Number");
		System.out.println("  4--> Employee Salary");
		System.out.println("  5--> Employee Age ");
		int selection=sc.nextInt();
		System.out.println("------------------------------------------------------------------------------------------------");
		switch(selection) {
		case 1:
		System.out.println("Enter name to change:");
		System.out.println("---------------------");
		String name=sc.next();
		String s="update employee set ename='"+name+"' where eid="+id;
		
	     int retval=st.executeUpdate(s);
		
		if(retval>0) {
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("Employee Name is updated");
			String result="select * from employee where eid="+id;
			rs=st.executeQuery(result);
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("E-id\t |EName\t\t |EEmail\t\t |EPhone\t |ESalary\t |EAge");
			System.out.println("------------------------------------------------------------------------------------------------");
			
			
			while(rs.next()) {

				System.out.println(rs.getInt(1)+"\t |"+rs.getString(2)+"\t\t |"+rs.getString(3)+"\t |"+rs.getString(4)+"\t |"+rs.getFloat(5)+"\t |"+rs.getInt(6));
				System.out.println("------------------------------------------------------------------------------------------------");
			}
		}
		break;
		case 2:
			System.out.println("Enter Email to change:");
			System.out.println("----------------------");
			String email=sc.next();
			String c="update employee set eemail='"+email+"' where eid="+id;
			
		     int retval1=st.executeUpdate(c);
			
			if(retval1>0) {
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("Employee Email is updated");
				String result="select * from employee where eid="+id;
				rs=st.executeQuery(result);
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("E-id\t |EName\t\t |EEmail\t\t |EPhone\t |ESalary\t |EAge");
				System.out.println("------------------------------------------------------------------------------------------------");
				// int id;
				
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t |"+rs.getString(2)+"\t\t |"+rs.getString(3)+"\t |"+rs.getString(4)+"\t |"+rs.getFloat(5)+"\t |"+rs.getInt(6));
					System.out.println("------------------------------------------------------------------------------------------------");
				}
			}
			break;
		case 3:
			System.out.println("Enter Phone Number to change:");
			System.out.println("-----------------------------");
			String ephone=sc.next();
			String d="update employee set ephone='"+ephone+"' where eid="+id;
			
		     int retval2=st.executeUpdate(d);
			
			if(retval2>0) {
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("Employee Phone Number is updated");
				
				String result="select * from employee where eid="+id;
				rs=st.executeQuery(result);
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("E-id\t |EName\t\t |EEmail\t\t |EPhone\t |ESalary\t |EAge");
				System.out.println("------------------------------------------------------------------------------------------------");
				
				
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t |"+rs.getString(2)+"\t\t |"+rs.getString(3)+"\t |"+rs.getString(4)+"\t |"+rs.getFloat(5)+"\t |"+rs.getInt(6));
					System.out.println("------------------------------------------------------------------------------------------------");
				}
			}
			break;
		case 4:
			System.out.println("Enter Salary to change:");
			System.out.println("-----------------------");
			String esalary=sc.next();
			String e="update employee set esalary='"+esalary+"' where eid="+id;
			
		     int retval3=st.executeUpdate(e);
			
			if(retval3>0) {
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("Employee Salary is updated");
				String result="select * from employee where eid="+id;
				rs=st.executeQuery(result);
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("E-id\t |EName\t\t |EEmail\t\t |EPhone\t |ESalary\t |EAge");
				System.out.println("------------------------------------------------------------------------------------------------");
				
				
				while(rs.next()) {
					System.out.println(rs.getInt(1)+"\t |"+rs.getString(2)+"\t\t |"+rs.getString(3)+"\t |"+rs.getString(4)+"\t |"+rs.getFloat(5)+"\t |"+rs.getInt(6));
					System.out.println("------------------------------------------------------------------------------------------------");
			}
			}
			break;
		case 5:
			System.out.println("Enter Age to change:");
			System.out.println("--------------------");
			String eage=sc.next();
			String f="update employee set eage='"+eage+"' where eid="+id;
			
		     int retval4=st.executeUpdate(f);
			
			if(retval4>0) {
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("Employee Age is updated");
				String result="select * from employee where eid="+id;
				rs=st.executeQuery(result);
				System.out.println("------------------------------------------------------------------------------------------------");
				System.out.println("E-id\t |EName\t\t |EEmail\t\t |EPhone\t |ESalary\t |EAge");
				System.out.println("------------------------------------------------------------------------------------------------");
				
				
				while(rs.next()) {

					System.out.println(rs.getInt(1)+"\t |"+rs.getString(2)+"\t\t |"+rs.getString(3)+"\t |"+rs.getString(4)+"\t |"+rs.getFloat(5)+"\t |"+rs.getInt(6));
					System.out.println("------------------------------------------------------------------------------------------------");
				}
			}
			break;
			default:
				System.out.println("Enter Correct Choice");
				System.out.println("------------------------------------------------------------------------------------------------");
	}
	}
		
		else {
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("Employee with id="+id+" not exists");
			System.out.println("------------------------------------------------------------------------------------------------");
		}
		
	}
		
	}


