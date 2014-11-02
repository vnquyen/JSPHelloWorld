package edu.jsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.jsp.models.DBManagement;
import edu.jsp.models.Image;

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
	        HttpSession session = request.getSession();
	        //session.setMaxInactiveInterval(600);
	        
	        Cookie cookie = new Cookie("username", username);
	        response.addCookie(cookie);
	        
	        Image img = new Image("tghm1.jpg", 1366, 768, "img/tghm1.jpg");
	        
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("/imgshow");
	    	session.setAttribute("username", username);
	    	request.setAttribute("ImageShow", img);
	    	
	    	session.setAttribute("image", img);
	    	session.removeAttribute("image");
	    	
	    	dispatcher.forward(request, response);
	    } else {
	    	response.sendRedirect("login");
	    }  
	}

}
