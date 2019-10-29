package com.anchtun.creational.factory;

public abstract class User {

	public abstract String getFirstName();

	public abstract String getLastName();

	public abstract String getEmail();

	@Override
	public String toString() {
		return "User [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getEmail()="
				+ getEmail() + "]";
	}

}
