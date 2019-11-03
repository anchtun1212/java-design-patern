package com.anchtun.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Users implements Cloneable {

	private List<String> listUsers;
	
	public void loadData() {
		listUsers.add("Mohamed");
		listUsers.add("Aymen");
		listUsers.add("Salah");
		listUsers.add("Ali");
		listUsers.add("Anis");
	}
	
	public Users() {
		listUsers = new ArrayList<String>();
	}

	public Users(List<String> listUsers) {
		super();
		this.listUsers = listUsers;
	}
	
	public List<String> getListUsers() {
		return listUsers;
	}

	public void setListUsers(List<String> listUsers) {
		this.listUsers = listUsers;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> tmp = new ArrayList<String>();
		for (String user : this.getListUsers()) {
			tmp.add(user);
		}
		return new Users(tmp);
	}

}
