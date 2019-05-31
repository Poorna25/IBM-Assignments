package com.ibm.training;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginvalidate")
public class LoginValidate extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		
		if(request.getParameter("uName")!=null && request.getParameter("uName").equals("poorna") && request.getParameter("uPass").equals("poorna123"))	{
			response.getWriter().append("Success!");
			request.getRequestDispatcher("/index.html").include(request, response);
		}
		else	{
			response.getWriter().append("failure!");
			request.getRequestDispatcher("/index.html").include(request, response);
		}
	}

	}