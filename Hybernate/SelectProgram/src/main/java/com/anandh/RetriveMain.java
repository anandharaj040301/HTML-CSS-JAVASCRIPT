package com.anandh;

import java.sql.ResultSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class RetriveMain {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Employee.class);
		SessionFactory sf=config.buildSessionFactory();
		Session	Sess=sf.openSession();
		Transaction tr=Sess.beginTransaction();
		Query qr=Sess.createQuery("from Employee");
		List l=qr.list();
		Iterator<Employee> it=l.iterator();
		int check;
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee Id: ");
		check=sc.nextInt();
		System.out.println("Employee_Id \t\t Employee_Name \t\t Employee_Salary");
		while(it.hasNext())
		{
			Employee emp=it.next();
			int id=emp.getEid();
			
			if(id==check) {
				System.out.println(id+"\t\t\t"+emp.getEname()+"\t\t"+emp.getSalary());
				count=count+1;
			}
			}
		System.out.println(count);
		}
}
