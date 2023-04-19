package com.emp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class EmployeeTable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int empid;
@Column (length = 50, nullable = false)
private String empname;
@Column (length = 50, nullable = false)
private String empemail;

private float empsalary;
@ManyToOne
@JoinColumn(name = "deptid")
private DepartmentTable dept;

public DepartmentTable getDept() {
	return dept;
}

public void setDept(DepartmentTable dept) {
	this.dept = dept;
}

public EmployeeTable() {
	super();
	// TODO Auto-generated constructor stub
}

public EmployeeTable(int empid, String empname, String empemail, float empsalary) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.empemail = empemail;
	this.empsalary = empsalary;
}

public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public String getEmpemail() {
	return empemail;
}

public void setEmpemail(String empemail) {
	this.empemail = empemail;
}

public float getEmpsalary() {
	return empsalary;
}

public void setEmpsalary(float empsalary) {
	this.empsalary = empsalary;
}

@Override
public String toString() {
	return "EmployeeTable [empid=" + empid + ", empname=" + empname + ", empemail=" + empemail + ", empsalary="
			+ empsalary + "]";
}

}

