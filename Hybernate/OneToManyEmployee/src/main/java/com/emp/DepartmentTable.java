package com.emp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class DepartmentTable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int deptid;
@Column(length = 50,nullable = false)
private String deptname;
@Column(length=50,nullable=false)
private String deptlocation;

@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="deptid")
private List<EmployeeTable> emp=new ArrayList<EmployeeTable>();

public List<EmployeeTable> getEmp() {
	return emp;
}
public void setEmp(List<EmployeeTable> emp) {
	this.emp = emp;
}
public DepartmentTable() {
	super();
	// TODO Auto-generated constructor stub
}
public DepartmentTable(int deptid, String deptname, String deptlocation) {
	super();
	this.deptid = deptid;
	this.deptname = deptname;
	this.deptlocation = deptlocation;
}
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
public String getDeptlocation() {
	return deptlocation;
}
public void setDeptlocation(String deptlocation) {
	this.deptlocation = deptlocation;
}
@Override
public String toString() {
	return "DepartmentTable [deptid=" + deptid + ", deptname=" + deptname + ", deptlocation=" + deptlocation + "]";
}

}
