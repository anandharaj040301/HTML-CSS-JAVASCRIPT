package productproject;
class Student1{
	
	String Sname;
	int SRoll;
	int SAge;
	String Address;
	
	public Student1(String Sname,int SRoll,int SAge,String Address){ 
		
	this.Sname=Sname;
	this.SRoll=SRoll;
	this.SAge=SAge;
	this.Address=Address;
		
	}
	
	void displayStudent() {
		System.out.println("Display method");
		System.out.println("Student name: "+Sname);
		System.out.println("Student Roll Number: "+SRoll);
		System.out.println("Student Age: "+SAge);
		System.out.println("Student Address: "+Address);
	}
	}

public class StudentMainSec2 {

	public static void main(String[] args) {
		System.out.println("Main method");
		Student1 sobj=new Student1("Anandharaj",4006,21,"Vazhudhavur"); //it will call constuctor
		sobj.displayStudent();

	}

}