package com.anchtun.creational.builder;

public class Test {

	public static void main(String[] args) {
		// Using builder to get the object in a single line of code and
		// without any inconsistent state or arguments management issues
		User user = new User.UserBuilder("Mohamed Aymen", "Charrada").setEmail("med.aymen.charrada").build();
		System.out.println("User ::" + user);
	}

}
