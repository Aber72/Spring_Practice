package com.springcollection;

import java.util.*;

public class Employee {
	private String empName;
	private List<String> phoneNum;
	private Set<String> address;
	private Map<String,String> courses;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(List<String> phoneNum) {
		this.phoneNum = phoneNum;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public Employee(String empName, List<String> phoneNum, Set<String> address, Map<String, String> courses) {
		super();
		this.empName = empName;
		this.phoneNum = phoneNum;
		this.address = address;
		this.courses = courses;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", phoneNum=" + phoneNum + ", address=" + address + ", courses="
				+ courses + "]";
	}
	

}
