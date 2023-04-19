package com.edu;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class CourseTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int courseid;
	@Column(length = 50, nullable = false)
	private String coursename;
	private float coursefees;
	@OneToMany
	@JoinColumn(name="courseid")
	@Cascade(CascadeType.ALL)
	private List<StudentTable> Student=new ArrayList<StudentTable>();
	
	
	public List<StudentTable> getStudent() {
		return Student;
	}
	public void setStudent(List<StudentTable> student) {
		Student = student;
	}
	public CourseTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CourseTable(int courseid, String coursename, float coursefees) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.coursefees = coursefees;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public float getCoursefees() {
		return coursefees;
	}
	public void setCoursefees(float coursefees) {
		this.coursefees = coursefees;
	}
	
}