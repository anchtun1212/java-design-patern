package com.anchtun.creational.abstractFactory;

public class Test {
	
	public static void main(String[] args) {
		User student = UserFactory.getUser(new StudentFactory("Ali", "Ben Salah", "ali.bensalah@gmail.com"));
		User employee = UserFactory.getUser(new EmployeeFactory("Mohamed Aymen", "Charrada", "med.aymen.charrada@gmail.com"));
		System.out.println("Factory student Config::" + student);
		System.out.println("Factory employee Config::" + employee);
	}

}
