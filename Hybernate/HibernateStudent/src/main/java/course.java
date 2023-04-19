import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Course")
public class course {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="Course_ID")
private int CID;
@Column(name="Course_Name")
private String CName;
public course() {
	super();
	// TODO Auto-generated constructor stub
}
public course( String cName) {
	super();
	CName = cName;
}
public int getCID() {
	return CID;
}
public void setCID(int cID) {
	CID = cID;
}
public String getCName() {
	return CName;
}
public void setCName(String cName) {
	CName = cName;
}
@Override
public String toString() {
	return "course [CID=" + CID + ", CName=" + CName + "]";
}

}
