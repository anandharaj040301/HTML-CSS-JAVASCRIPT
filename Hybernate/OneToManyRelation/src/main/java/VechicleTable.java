

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class VechicleTable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vechicleid;
	private String vechiclename;
	
	@ManyToOne
	private UserTable user;
	public VechicleTable() {
		super();
		
	}
	
	
	public UserTable getUser() {
		return user;
	}


	public void setUser(UserTable user) {
		this.user = user;
	}


	public VechicleTable(int vechicleid, String vechiclename) {
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
		return "VechicleTable [vechicleid=" + vechicleid + ", vechiclename=" + vechiclename + "]";
	}
	
	
}