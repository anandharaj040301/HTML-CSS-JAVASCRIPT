

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
public static void main(String args[])
{
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");//bootstrap with jdbc
	
	config.addAnnotatedClass(UserTable.class);
	config.addAnnotatedClass(VechicleTable.class);
	SessionFactory sft=config.buildSessionFactory();
	Session sess=sft.openSession();
	Transaction tr=sess.beginTransaction();
	UserTable uob=new UserTable();
	uob.setUsername("Anandharaj");
	UserTable uob1=new UserTable();
	uob1.setUsername("Vijay");
   
	VechicleTable vob=new VechicleTable();
	vob.setVechiclename("Royal Enfield");

	VechicleTable vob1=new VechicleTable();
	vob1.setVechiclename("PULSAR");
	
	VechicleTable vob2=new VechicleTable();
	vob2.setVechiclename("DUKE");
	
	uob.getVechicle().add(vob);
	uob.getVechicle().add(vob1);
	uob1.getVechicle().add(vob2);
	sess.save(uob);
	sess.save(uob1);
	sess.save(vob);
	sess.save(vob1);
	sess.save(vob2);
	tr.commit();
	sess.close();
  
}
}