package com.anchtun.creational.factory;

public class TestFactory {

	public static void main(String[] args) {
		User student = UserFactory.getUser("student", "Ali", "Ben Salah", "ali.bensalah@gmail.com");
		User employee = UserFactory.getUser("employee", "Mohamed Aymen", "Charrada", "med.aymen.charrada@gmail.com");
		System.out.println("Factory student Config::" + student);
		System.out.println("Factory employee Config::" + employee);
	}

}