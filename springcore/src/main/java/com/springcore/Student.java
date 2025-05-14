package com.springcore;

public class Student {
	int id;
	String name;
	String adress;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("seeting id for student");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("seeting name for student");
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		System.out.println("seeting address for student");
		this.adress = adress;
	}
	public Student(int id, String name, String adress) {
		super();
		this.id = id;
		this.name = name;
		this.adress = adress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", adress=" + adress + "]";
	}
	

}
