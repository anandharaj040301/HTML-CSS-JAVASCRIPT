import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="Student_ID")
	private int sid;
@Column(name="Student_Name", length=40, nullable = false )
	private String sname;
@Column(name="Student_Fees",nullable = false )
	private float sfees;
@Column(name="Student_Age",nullable = false )
private int sage;
@Column(name="Student_Email", length=40, nullable = false, unique = true )
private String semail;
@Column(name="Student_Phone", length=12, nullable = false, unique=true )
private String sphone;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student (String sname, float sfees, int sage, String semail, String sphone) {
	super();
	
	this.sname = sname;
	this.sfees = sfees;
	this.sage = sage;
	this.semail = semail;
	this.sphone = sphone;
}
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public float getSfees() {
	return sfees;
}
public void setSfees(float sfees) {
	this.sfees = sfees;
}
public int getSage() {
	return sage;
}
public void setSage(int sage) {
	this.sage = sage;
}
public String getSemail() {
	return semail;
}
public void setSemail(String semail) {
	this.semail = semail;
}
public String getSphone() {
	return sphone;
}
public void setSphone(String sphone) {
	this.sphone = sphone;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", sfees=" + sfees + ", sage=" + sage + ", semail=" + semail
			+ ", sphone=" + sphone + "]";
}

}
		

