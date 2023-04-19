import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Configuration config=new Configuration();
config.configure("hibernate.cfg.xml");

//config.addAnnotatedClass(Employee.class);
//config.addAnnotatedClass(department.class);
config.addAnnotatedClass(Student.class);
config.addAnnotatedClass(course.class);
SessionFactory sft=config.buildSessionFactory();
Session sess=sft.openSession();
Transaction tr=sess.beginTransaction();
/*Employee eob3=new Employee("Vijay",50000);
Employee eob4=new Employee("raja",50000);
department dob1=new department("CSE","Chennai");
department dob2=new department("IT","Chennai");
sess.save(eob3);
sess.save(eob4);
sess.save(dob1);
sess.save(dob2);*/
Student sob1=new Student("Anandharaj",45000,22,"anandharaj040301@gmail.com","9786430648");
Student sob2=new Student("Arunraj",45000,21,"arunraj@gmail.com","9786432525");
course cob1=new course("CSE");
course cob2=new course("Mech");

sess.save(sob1);
sess.save(sob2);

sess.save(cob1);
sess.save(cob2);

tr.commit();
sess.close();

	}

}
