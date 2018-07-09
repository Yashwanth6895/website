package com.app.witutor2.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.witutor2.dao.StudentDAO;
import com.app.witutor2.dto.StudentData;

@WebServlet("/register")
public class RegisterationServlet extends HttpServlet {
	StudentDAO dao = new StudentDAO();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		//Setting student data
		StudentData data = new StudentData();
		data.setUsername(req.getParameter("user"));
		data.setEmail(req.getParameter("email"));
		data.setPassword(req.getParameter("password"));
		data.setContact(req.getParameter("contact"));
		data.setSchool(req.getParameter("school"));
		data.setBoard(req.getParameter("board"));
		data.setQualification(req.getParameter("qualification"));
		data.setSubject(req.getParameter("subject"));
		data.setPrefferedTutor(req.getParameter("tutor"));
		data.setAmount(Double.parseDouble(req.getParameter("samnt")));
		data.setAddress(req.getParameter("address"));
		
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
			rd = req.getRequestDispatcher("studentRegForm.html");
			rd.forward(req, resp);
		}
		
		
		
	}

}
