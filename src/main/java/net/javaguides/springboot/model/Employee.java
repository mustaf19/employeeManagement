package net.javaguides.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String fname;

	@Column(name = "last_name")
	private String lname;
	
	@Column(name = "email_id")
	private String emailid;
	
	public Employee() {
		
	}
	
	public Employee(String fname, String lname, String emailid) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.emailid = emailid;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getfname() {
		return fname;
	}
	public void setfname(String fname) {
		this.fname = fname;
	}
	public String getlname() {
		return lname;
	}
	public void setlname(String lname) {
		this.lname = lname;
	}
	public String emailid() {
		return emailid;
	}
	public void emailid(String emailid) {
		this.emailid = emailid;
	}
}
