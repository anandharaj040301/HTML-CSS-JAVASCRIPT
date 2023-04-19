package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
public static void main(String args[])
{
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");//bootstrap with jdbc
	
	config.addAnnotatedClass(Vechicle.class);
	config.addAnnotatedClass(User.class);
	SessionFactory sft=config.buildSessionFactory();
	Session sess=sft.openSession();
	Transaction tr=sess.beginTransaction();
	
   Vechicle vob=new Vechicle();
	
	vob.setVechiclename("Bajaj");
	sess.save(vob);
	User uob=new User();
	uob.setUsername("Anadhraj");
	
	sess.save(uob);
	
	
	uob.setVechicleid(vob);
	tr.commit();
	sess.close();
}
}