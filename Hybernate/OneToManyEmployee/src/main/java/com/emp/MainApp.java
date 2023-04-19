package com.emp;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		config.configure("hibernate.cfg.xml");//bootstrap with jdbc
		
		config.addAnnotatedClass(EmployeeTable.class);
		config.addAnnotatedClass(DepartmentTable.class);
		SessionFactory sft=config.buildSessionFactory();
		Session sess=sft.openSession();
		Transaction tr=sess.beginTransaction();
		DepartmentTable dob=new DepartmentTable();
		dob.setDeptname("Production");
		dob.setDeptlocation("Pondicherry");
		
		EmployeeTable eob=new EmployeeTable();
		EmployeeTable eob1=new EmployeeTable();
		eob.setEmpname("Arun");
		eob.setEmpemail("arun@gmail.com");
		eob.setEmpsalary(50050.0f);
		
		eob1.setEmpname("jayavel");
		eob1.setEmpemail("jayavel@gmail.com");
		eob1.setEmpsalary(50520.0f);
		ArrayList<EmployeeTable> elist= new ArrayList<EmployeeTable>();
		
		elist.add(eob);
		elist.add(eob1);
		
		dob.setEmp(elist);
		sess.save(dob);
		sess.save(eob);
		sess.save(eob1);
		tr.commit();
		sess.close();
	}

}
