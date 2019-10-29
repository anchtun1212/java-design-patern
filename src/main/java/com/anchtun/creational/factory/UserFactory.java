package com.anchtun.creational.factory;

public class UserFactory {

	public static User getUser(String type, String firstName, String lastName, String email) {
		if ("student".equalsIgnoreCase(type)) {
			return new Student(firstName, lastName, email);
		} else if ("employee".equalsIgnoreCase(type)) {
			return new Employee(firstName, lastName, email);
		}

		return null;
	}

}