package com.faith.app.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	private String firstname;
	private String lastname;
	private Integer age;
	private String gender;
	private String address;
	private long phone;
	
	//private Integer lId;
	@JoinColumn(name="lId")
	@OneToOne(cascade = CascadeType.ALL)
	private Login login;
	
	public Employee() {
		super();
	}

	
	//parameterized constructors
	public Employee(Integer empId, String firstname, String lastname, Integer age, String gender, String address,
			long phone) {
		super();
		this.empId = empId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
	}

	//getters and setters 
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

//	public Integer getlId() {
//		return lId;
//	}
//
//	public void setlId(Integer lId) {
//		this.lId = lId;
//	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
				+ ", gender=" + gender + ", address=" + address + ", phone=" + phone +"]";
	}
	
	
		
}
