package com.beanslifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean,DisposableBean{
	private int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("pepsi init");
		this.price = price;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
		
		
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("set property");
		// TODO Auto-generated method stub
		
	}
	
	

}
