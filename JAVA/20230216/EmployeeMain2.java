package productproject;
class Employee{
	String Ename;
	int Eid;
	float ESalary;
	
	Employee(String Ename,int Eid,float ESalary){ 
		
	this.Ename=Ename;
	this.Eid=Eid;
	this.ESalary=ESalary;
			
	}
	
	void displayEmployee() {
		System.out.println("Display method");
		System.out.println("Employee name: "+Ename);
		System.out.println("Employee id: "+Eid);
		System.out.println("Employee Salary: "+ESalary);
	}
}

public class EmployeeMain2 {

	public static void main(String[] args) {
		System.out.println("Main method");
		Employee Eobj=new Employee("Anandharaj",4115,100000f);
		Eobj.displayEmployee();

	}

}