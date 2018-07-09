package com.app.witutor2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.app.witutor2.dto.StudentData;

public class StudentDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306?user=root&password=yash6895";
	static int id = 0;
	
	
	public int insertData(StudentData data)
	{
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url);
			
			pstmt = con.prepareStatement("insert into witutor.studentregistration values(?,?,?,?,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, data.getUsername());
			pstmt.setString(2, data.getEmail());
			pstmt.setString(3, data.getPassword());
			pstmt.setString(4, data.getContact());
			pstmt.setString(5, data.getSchool());
			pstmt.setString(6, data.getBoard());
			pstmt.setString(7, data.getQualification());
			pstmt.setString(8, data.getSubject());
			pstmt.setString(9, data.getPrefferedTutor());
			pstmt.setDouble(10, data.getAmount());
			pstmt.setString(11, data.getAddress());
			id = getId();
			
			pstmt.setInt(12, ++id);
			
			return pstmt.executeUpdate();
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}
	
	
	
	public int getId()
	{
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url);
			stmt = con.createStatement();
			rs = stmt.executeQuery("select id from witutor.studentregistration order by  id desc limit 1 ");
			int id = 0;
			while(rs.next())
			{
				id = rs.getInt(1);
			}
			return id;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return 0;
	}
	
	public StudentData loginValidation(String email,String password)
	{
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement("select * from witutor.studentregistration where email=? and password=? ");
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			StudentData data = new StudentData();
			if (rs.next()) 
			{
				data.setEmail(rs.getString("username"));
				data.setContact(rs.getString("contact"));
				data.setSchool(rs.getString("school/college"));
				data.setQualification(rs.getString("qualification"));
				data.setPrefferedTutor(rs.getString("preffered tutor"));
				data.setSubject(rs.getString("subject"));
				return data;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		

		
		return null;
		
	}
}
