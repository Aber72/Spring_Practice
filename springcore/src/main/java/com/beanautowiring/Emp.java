package com.beanautowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
	@Qualifier("adress")
   private Address adress;
   
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}


	

@Override
public String toString() {
	return "Emp [adress=" + adress + "]";
}




public Emp(Address adress) {
	super();
	System.out.println("inside constructor of emp");
	this.adress = adress;
}

public Address getAdress() {
	return adress;
}

public void setAdress(Address adress) {
	System.out.println("inside set of emp");
	this.adress = adress;
}
   
   
}
