package com.anchtun.creational.abstractFactory;

public class EmployeeFactory implements UserAbstractFactory {

	private String firstName;

	private String lastName;

	private String email;

	public EmployeeFactory(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	@Override
	public User createUser() {
		return new Employee(firstName, lastName, email);
	}

}
