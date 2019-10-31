package com.anchtun.creational.abstractFactory;

public class UserFactory {

	public static User getUser(UserAbstractFactory factory) {
		return factory.createUser();
	}

}
