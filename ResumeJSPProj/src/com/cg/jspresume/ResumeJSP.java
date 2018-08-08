package com.cg.jspresume;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResumeJSP
 */
@WebServlet("/ResumeJSP")
public class ResumeJSP extends HttpServlet {
	private static final long serialVersionUID = 1L;

  
    public ResumeJSP() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//PrintWriter out = response.getWriter();
		
		Resume resume = new Resume(request.getParameter("firstName"), request.getParameter("lastName"), request.getParameter("gender"), request.getParameter("highestQualification"), request.getParameter("dob"), request.getParameterValues("hobbies"), request.getParameter("address"), request.getParameterValues("skills"), request.getParameter("email"), request.getParameter("website"), request.getParameter("contactNumber"), request.getParameter("summary"));
		request.setAttribute("Resume", resume);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
