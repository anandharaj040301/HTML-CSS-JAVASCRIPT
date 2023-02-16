package productproject;
class Student{
	String Sname;
	int SRoll;
	int SAge;
	String Address;
	
	Student(){ 
		
	Sname="Anandharaj";
	SRoll=40001;
	SAge=21;
	Address="Vazhudhavur";
	System.out.println("Student name: "+Sname);
	System.out.println("Student Roll Number: "+SRoll);
	System.out.println("Student Age: "+SAge);
	System.out.println("Student Address: "+Address);	
	}
	
	void displayStudent() {
		System.out.println("Display method");
	}
}

public class StudentMain2 {

	public static void main(String[] args) {
		System.out.println("Main method");
		Student pobj=new Student(); //it will call constuctor
		pobj.displayStudent();

	}

}