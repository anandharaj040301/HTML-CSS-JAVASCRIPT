package com.edu;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StudentTable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int StuId;
    private String StuName;
    private String Stuemail;
    @OneToMany
    private List<CourseTable> course= new ArrayList<CourseTable>();
    
    
	
	public List<CourseTable> getCourse() {
		return course;
	}
	public void setCourse(List<CourseTable> course) {
		this.course = course;
	}
	public StudentTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentTable(int stuId, String stuName, String stuemail) {
		super();
		StuId = stuId;
		StuName = stuName;
		Stuemail = stuemail;
	}
	public int getStuId() {
		return StuId;
	}
	public void setStuId(int stuId) {
		StuId = stuId;
	}
	public String getStuName() {
		return StuName;
	}
	public void setStuName(String stuName) {
		StuName = stuName;
	}
	public String getStuemail() {
		return Stuemail;
	}
	public void setStuemail(String stuemail) {
		Stuemail = stuemail;
	}
	@Override
	public String toString() {
		return "StudentTable [StuId=" + StuId + ", StuName=" + StuName + ", Stuemail=" + Stuemail + "]";
	}
	
	
}