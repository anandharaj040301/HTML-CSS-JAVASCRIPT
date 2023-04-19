package com.edu;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
    private String username;
    
    //relation OneToOne
    
    @OneToOne
    private Vechicle vechicleid;
    
    public Vechicle getVechicleid() {
		return vechicleid;
	}
	public void setVechicleid(Vechicle vechicleid) {
		this.vechicleid = vechicleid;
	}

	public User() {
		super();
		
	}
	public User(int userid, String username) {
		super();
		this.userid = userid;
		this.username = username;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + "]";
	}
    
    
	
}