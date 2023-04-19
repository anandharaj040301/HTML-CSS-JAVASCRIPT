package com.edu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vechicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int vechicleid;
	
private String vechiclename;

public Vechicle() {
	super();
	// TODO Auto-generated constructor stub
}

public Vechicle(int vechicleid, String vechiclename) {
	super();
	this.vechicleid = vechicleid;
	this.vechiclename = vechiclename;
}

public int getVechicleid() {
	return vechicleid;
}

public void setVechicleid(int vechicleid) {
	this.vechicleid = vechicleid;
}

public String getVechiclename() {
	return vechiclename;
}

public void setVechiclename(String vechiclename) {
	this.vechiclename = vechiclename;
}

@Override
public String toString() {
	return "Vechicle [vechicleid=" + vechicleid + ", vechiclename=" + vechiclename + "]";
}



}