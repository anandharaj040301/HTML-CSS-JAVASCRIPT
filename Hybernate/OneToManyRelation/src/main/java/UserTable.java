

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class UserTable {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
    private String username;
    
    @OneToMany
    private List<VechicleTable> vechicle= new ArrayList<VechicleTable>();
    
    
	
	public List<VechicleTable> getVechicle() {
		return vechicle;
	}
	public void setVechicle(List<VechicleTable> vechicle) {
		this.vechicle = vechicle;
	}
	public UserTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserTable(int userid, String username) {
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
		return "UserTable [userid=" + userid + ", username=" + username + "]";
	}
    
    
    
}