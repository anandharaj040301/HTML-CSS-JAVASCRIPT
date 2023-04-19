package com.hibernate;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import javax.persistence.Parameter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HibernateOperations {

	public static void addEmployee(SessionFactory sf) {
		System.out.println("Add Employee");
		String ename;
		Float Salary;
		Scanner obj=new Scanner(System.in);
		//Session ss=sf.openSession();
		System.out.println("Enter Employee Name:");
		ename=obj.nextLine();
		System.out.println("Enter Employee Salary:");
		Salary=obj.nextFloat();
		try(Session ss=sf.openSession()){   //try with resources java 7
		Transaction t=ss.beginTransaction();
		
		EmployeeHQL e1=new EmployeeHQL();
   e1.setEmployeeName(ename);
		e1.setEmployeeSalary(Salary);
		
		ss.save(e1);
//		EmployeeHQL e2=new EmployeeHQL();
//		e2.setEmployeeName("Kiran");
//		e2.setEmployeeSalary(98761f);
//		ss.save(e2);
//		
//		EmployeeHQL e3=new EmployeeHQL();
//		e3.setEmployeeName("Rohini");
//		e3.setEmployeeSalary(98761f);
//		ss.save(e3);
		t.commit();
		System.out.println("Record Added Successfully");
		
		}
	}

	public static void getAllRecords(SessionFactory sf) {
		System.out.println("getAllEmployeeRecords");
		try(Session ss=sf.openSession()){
			Transaction t=ss.beginTransaction();
			String sql="FROM EmployeeHQL";
			Query<EmployeeHQL> list=ss.createQuery(sql,EmployeeHQL.class); 
			List<EmployeeHQL> l=list.list();
			Iterator<EmployeeHQL> it=l.iterator();
			System.out.println("ID\tName\tSalary");
			
			while(it.hasNext()) {
			EmployeeHQL eob=it.next();	
			
				System.out.println(eob.getEmployeeId()+"\t"+eob.getEmployeeName()+"\t"+eob.getEmployeeSalary());
			}//while
		}//try			
		
	}//getRecords

	public static void getEmployeeById(SessionFactory sf) {
		System.out.println("get Employee By Id");
		try(Session session=sf.openSession()){
			//get employee
			String sel="FROM EmployeeHQL where employeeId=:id";
			Query<EmployeeHQL> q=session.createQuery(sel, EmployeeHQL.class);
			q.setParameter("id", 1); //position starts 0
			EmployeeHQL eob=q.uniqueResult(); //singleresult
			System.out.println(eob);
			
		}
		
}
public static void updateEmployeeName(SessionFactory sf) {
		System.out.println("Update Employee Name");
		
		try(Session session=sf.openSession()){
			Scanner obj=new Scanner(System.in);
			//Session ss=sf.openSession();
			System.out.println("Enter Employee Id:");
			int id=obj.nextInt();
			System.out.println("Enter Employee New Name:");
			String ename=obj.next();
			
			Transaction tx=session.beginTransaction();
			Query q=session.createQuery("update EmployeeHQL set employeeName=:n where employeeId=:i");  
			q.setParameter("n",ename);  
			q.setParameter("i",id);  
			  
			int status=q.executeUpdate();  
			System.out.println("status="+status);
			if(status>1) {
			System.out.println(status +"Record updated");  
			tx.commit();  

			}
		}
		
}
	public static void deleteEmployeeById(SessionFactory sf) {
		System.out.println("Delete Employeeby id");
		try(Session session=sf.openSession()){
			Scanner obj=new Scanner(System.in);
			System.out.println("Enter Employee Id:");
			int id=obj.nextInt();
			Transaction tx=session.beginTransaction();
			Query q=session.createQuery("delete from EmployeeHQL where employeeId=:i");  
			//specifying class name (Emp) not tablename  
			
			q.setParameter("i", id);
			int status=q.executeUpdate();  
			if(status>1) {
			System.out.println(status +"Record deleted");  
			tx.commit();  

			}
			
		}
	}
}