package com.anchtun.creational.builder;

public class User {

	// required fields
	private String firstName;

	private String lastName;

	// optional field
	private String email;

	public User(UserBuilder builder) {
		super();
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.email = builder.email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// Builder Class
	public static class UserBuilder {

		// required fields
		private String firstName;

		private String lastName;

		// optional field
		private String email;

		public UserBuilder(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public UserBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public User build() {
			return new User(this);
		}

	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}
