import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Department_Table")
public class department {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int Dept_ID;
private String Dept_Name;
private String Dept_Location;
public department() {
	super();
	// TODO Auto-generated constructor stub
}
public department(String dept_Name, String dept_Location) {
	super();
	
	Dept_Name = dept_Name;
	Dept_Location = dept_Location;
}
public int getDept_ID() {
	return Dept_ID;
}
public void setDept_ID(int dept_ID) {
	Dept_ID = dept_ID;
}
public String getDept_Name() {
	return Dept_Name;
}
public void setDept_Name(String dept_Name) {
	Dept_Name = dept_Name;
}
public String getDept_Location() {
	return Dept_Location;
}
public void setDept_Location(String dept_Location) {
	Dept_Location = dept_Location;
}
@Override
public String toString() {
	return "department [Dept_ID=" + Dept_ID + ", Dept_Name=" + Dept_Name + ", Dept_Location=" + Dept_Location + "]";
}

}
