package com.app.witutor2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.app.witutor2.dto.TutorData;

public class TutorDAO {
	Connection con = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	String driverName = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306?user=root&password=yash6895";
	static int id=0;
	
	public int insertData(TutorData data)
	{
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url);
			
			pstmt = con.prepareStatement("insert into witutor.tutorregistration values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			id = getId();
			pstmt.setInt(1,++id );
			pstmt.setString(2, data.getUsername());
			pstmt.setString(3, data.getEmail());
			pstmt.setString(4, data.getPassword());
			pstmt.setString(5, data.getContact());
			pstmt.setString(6, data.getExperience());
			pstmt.setString(7, data.getCurrentOccuption());
			pstmt.setString(8, data.getGender());
			pstmt.setString(9, data.getBoard());
			pstmt.setString(10, data.getPrefferedclass());
			pstmt.setString(11, data.getPrefferedsubject());
			pstmt.setString(12, data.getPrefferedlocation());
			pstmt.setDouble(13, data.getAmount());
			pstmt.setString(14, data.getQualification());
			
			
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
			rs = stmt.executeQuery("select id from witutor.tutorregistration  order by  id desc limit 1 ");
			int id = 0;
			while(rs.next())
			{
				id = rs.getInt(1);
			}
			return id;
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		return 0;
	}
	
	public TutorData loginValidation(String email,String password)
	{
		try {
			Class.forName(driverName);
			con = DriverManager.getConnection(url);
			pstmt = con.prepareStatement("select * from witutor.tutorregistration where email=? and password=? ");
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			TutorData data = new TutorData();
			if (rs.next()) 
			{
				data.setEmail(rs.getString("email"));
				data.setContact(rs.getString("contact"));
				data.setExperience(rs.getString("experience"));
				data.setPrefferedclass(rs.getString("preffered class"));
				data.setPrefferedsubject(rs.getString("preffered subject"));
				data.setPrefferedlocation(rs.getString("preffered location"));
				return data;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
}
