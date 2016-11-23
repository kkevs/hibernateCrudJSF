package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String ename;
	String enumber;
	boolean upd = false;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEnumber() {
		return enumber;
	}

	public void setEnumber(String enumber) {
		this.enumber = enumber;
	}

	public boolean isUpd() {
		return upd;
	}

	public void setUpd(boolean upd) {
		this.upd = upd;
	}

}
