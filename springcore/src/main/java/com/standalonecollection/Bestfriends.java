package com.standalonecollection;

import java.util.List;

public class Bestfriends {
	
	@Override
	public String toString() {
		return "Bestfriends [friends=" + friends + "]";
	}

	public Bestfriends() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bestfriends(List<String> friends) {
		super();
		this.friends = friends;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	private List<String> friends;
	
	
	

}
