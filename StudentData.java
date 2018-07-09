package com.app.witutor2.dto;

public class StudentData {

	private String username;
	private String email;
	private String password;
	private String contact;
	private String school;
	private String board;
	private String qualification;
	private String subject;
	private String prefferedTutor;
	private double amount;
	private String address;
	
	public StudentData() {
		System.out.println("Student obj created");
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getPrefferedTutor() {
		return prefferedTutor;
	}
	public void setPrefferedTutor(String prefferedTutor) {
		this.prefferedTutor = prefferedTutor;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "StudentData [username=" + username + ", email=" + email + ", password=" + password + ", contact="
				+ contact + ", school=" + school + ", board=" + board + ", qualification=" + qualification
				+ ", subject=" + subject + ", prefferedTutor=" + prefferedTutor + ", amount=" + amount + ", address="
				+ address + "]";
	}
	
	
}
