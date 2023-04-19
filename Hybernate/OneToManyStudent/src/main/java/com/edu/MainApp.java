package com.edu;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
public static void main(String args[])
{
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");//bootstrap with jdbc
	
	config.addAnnotatedClass(StudentTable.class);
	config.addAnnotatedClass(CourseTable.class);
	SessionFactory sft=config.buildSessionFactory();
	Session sess=sft.openSession();
	Transaction tr=sess.beginTransaction();
	CourseTable cob=new CourseTable();
	cob.setCoursename("BCA");
	cob.setCoursefees(12000);
	StudentTable sob=new StudentTable();
	sob.setStuName("Anandh");
	sob.setStuemail("anandh@gmail.com");
	StudentTable sob1=new StudentTable();
	sob1.setStuName("Raj");
	sob1.setStuemail("raj@gmail.com");
	List<StudentTable>sulist=new ArrayList<StudentTable>();
	sulist.add(sob);
	sulist.add(sob1);
	cob.setStudent(sulist);
	sess.save(cob);
	sess.save(sob);
	sess.save(sob1);
	sess.save(cob);
	tr.commit();
	sess.close();
  
}
}