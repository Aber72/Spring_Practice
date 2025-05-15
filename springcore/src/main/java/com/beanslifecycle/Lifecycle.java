package com.beanslifecycle;

public class Lifecycle {
	
	int life;

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		System.out.println("inside setter method");
		this.life = life;
	}
	
	public void init() {
		System.out.println("inside init");
	}
	
	public void destroy() {
		System.out.println("inside destroy");
		
	}

	@Override
	public String toString() {
		return "Lifecycle [life=" + life + "]";
	}

}
