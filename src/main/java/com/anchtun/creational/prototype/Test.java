package com.anchtun.creational.prototype;

import java.util.List;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Users users = new Users();
		users.loadData();
		
		Users usersNew1 = (Users) users.clone();
		Users usersNew2 = (Users) users.clone();
		List<String> listUsers1 = usersNew1.getListUsers();
		listUsers1.add("Youssef");
		List<String> listUsers2 = usersNew2.getListUsers();
		listUsers2.add("Ibrahim");
		
		System.out.println("users List: " + users.getListUsers());
		System.out.println("usersNew1 List: " + usersNew1.getListUsers());
		System.out.println("usersNew2 List: " + usersNew2.getListUsers());
	}
	
}
