package com.anchtun.creational.abstractFactory;

public class StudentFactory implements UserAbstractFactory {

	private String firstName;

	private String lastName;

	private String email;

	public StudentFactory(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	@Override
	public User createUser() {
		return new Student(firstName, lastName, email);
	}

}
