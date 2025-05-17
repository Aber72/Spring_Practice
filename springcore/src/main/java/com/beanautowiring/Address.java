package com.beanautowiring;

public class Address {
	
	private String street;
	private String city;
	private String State;
	
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		System.out.println("inside set of street");
		this.street = street;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "[street=" + street + ", city=" + city + ", State=" + State + "]";
	}
	public Address(String street, String city, String state) {
		super();
		System.out.println("inside constructor of Address");
		this.street = street;
		this.city = city;
		State = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		System.out.println("inside set of city");
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		System.out.println("inside set of state");
		State = state;
	}
	
	

}
