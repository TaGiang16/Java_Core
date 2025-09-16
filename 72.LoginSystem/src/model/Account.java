package model;

import java.time.LocalDate;

public class Account {
	
	private String username;
	private String passwordHash; // lưu MD5
	private String name;
	private String phone;
	private String email;
	private String address;
	private LocalDate dob;
	
	public Account() {
	}
	public Account(String username, String passwordHash, String name, String phone, String email, String address,
			LocalDate dob) {		this.username = username;
		this.passwordHash = passwordHash;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.dob = dob;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
}
