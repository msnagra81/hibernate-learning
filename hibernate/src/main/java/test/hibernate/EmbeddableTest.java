package test.hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class EmbeddableTest {

	private String fName="";
	private String mName="";
	private String lName="";
	
	public EmbeddableTest(String fName, String mName, String lName) {
		super();
		this.fName = fName;
		this.mName = mName;
		this.lName = lName;
	}
	public EmbeddableTest() {
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	
	
}
