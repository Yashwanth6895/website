package com.app.witutor2.dto;

public class TutorData {

	private String username;
	private String email;
	private String password;
	private String contact;
	private String experience;
	private String currentOccuption;
	private String gender;
	private String board;
	private String prefferedclass;
	private String prefferedsubject;
	private String prefferedlocation;
	private double amount;
	private String qualification;
	
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
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getCurrentOccuption() {
		return currentOccuption;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public void setCurrentOccuption(String currentOccuption) {
		this.currentOccuption = currentOccuption;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBoard() {
		return board;
	}
	public void setBoard(String board) {
		this.board = board;
	}
	public String getPrefferedclass() {
		return prefferedclass;
	}
	public void setPrefferedclass(String prefferedclass) {
		this.prefferedclass = prefferedclass;
	}
	public String getPrefferedsubject() {
		return prefferedsubject;
	}
	public void setPrefferedsubject(String prefferedsubject) {
		this.prefferedsubject = prefferedsubject;
	}
	public String getPrefferedlocation() {
		return prefferedlocation;
	}
	public void setPrefferedlocation(String prefferedlocation) {
		this.prefferedlocation = prefferedlocation;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "TutorData [username=" + username + ", email=" + email + ", password=" + password + ", contact="
				+ contact + ", experience=" + experience + ", currentOccuption=" + currentOccuption + ", gender="
				+ gender + ", board=" + board + ", prefferedclass=" + prefferedclass + ", prefferedsubject="
				+ prefferedsubject + ", prefferedlocation=" + prefferedlocation + ", amount=" + amount
				+ ", qualification=" + qualification + "]";
	}
	
	
}
