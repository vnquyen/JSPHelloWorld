package edu.jsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.jsp.models.DBManagement;

/**
 * Servlet implementation class Authentication
 */
//@WebServlet("/auth")
public class Authentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Authentication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
	        HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
	    String password = request.getParameter("password");
	    PrintWriter writer = response.getWriter();
	    DBManagement db = new DBManagement();
	    
	    if(db.checkUser(username, password)) {
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/menu.jsp");
	    	dispatcher.forward(request, response);
	    } else {
	    	response.sendRedirect("jsp/login.jsp");
	    }  
	}

}
