package com.app.witutor2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.witutor2.dao.StudentDAO;
import com.app.witutor2.dto.StudentData;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		StudentDAO dao = new StudentDAO();
		StudentData data = dao.loginValidation(email, password);
		System.out.println(data);
		PrintWriter out = resp.getWriter();
		
		RequestDispatcher rd = null;
		if(data==null)
		{
			out.print("<html>");
			out.print("<body>");
			out.print("<font color='red'>*Invalid username or password</font>");
			out.print("</body>");
			out.print("</html>");
			rd = req.getRequestDispatcher("LoginForm.htm");
			rd.include(req, resp);
		}
		else{
			
			out.print("<html>");
			out.print("<body>");
			out.print("<font color='red'>Login Successfull</font>");
			out.print("</body>");
			out.print("</html>");
			rd = req.getRequestDispatcher("homepage.jsp");
			req.setAttribute("user", data.getUsername());
			rd.forward(req, resp);
		}
		
		
	}

}
