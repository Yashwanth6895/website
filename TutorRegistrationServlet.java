package com.app.witutor2.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.witutor2.dao.TutorDAO;
import com.app.witutor2.dto.TutorData;

@WebServlet("/tregister")
public class TutorRegistrationServlet extends HttpServlet {
	TutorDAO dao = new TutorDAO();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//Setting student data
		TutorData data = new TutorData();
		data.setUsername(req.getParameter("user"));
		data.setEmail(req.getParameter("email"));
		data.setPassword(req.getParameter("password"));
		data.setContact(req.getParameter("contact"));
		data.setExperience(req.getParameter("experience"));
		data.setCurrentOccuption(req.getParameter("currentoccuption"));
		data.setGender(req.getParameter("gender"));
		data.setBoard(req.getParameter("board"));
		data.setPrefferedclass(req.getParameter("prefferedclass"));
		data.setPrefferedsubject(req.getParameter("prefferedsubject"));
		data.setPrefferedlocation(req.getParameter("prefferedlocation"));
		data.setAmount(Double.parseDouble(req.getParameter("tamnt")));
		data.setQualification(req.getParameter("qualification"));
		System.out.println(data);
		//inserting data into db
		
		int count = dao.insertData(data);
		
		RequestDispatcher rd = null;
		if(count!=0)
		{
			rd = req.getRequestDispatcher("homepage.jsp");
			req.setAttribute("user", data.getUsername());
			rd.forward(req, resp);
		}
		else{
			rd = req.getRequestDispatcher("tutorRegForm.html");
			rd.forward(req, resp);
		}
		
		
		
	}

}
