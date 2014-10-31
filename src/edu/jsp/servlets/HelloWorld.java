package edu.jsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
//@WebServlet(description = "This is a jsp demo", urlPatterns = { "/hello" })
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, 
	        HttpServletResponse response) throws ServletException, IOException {
	    loadParameters(request, response, "GET method");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, 
	        HttpServletResponse response) throws ServletException, IOException {
	    loadParameters(request, response, "POST method");
	}
	
	private void loadParameters(HttpServletRequest request, 
            HttpServletResponse response, String method) throws ServletException, IOException {
	    ServletContext context = this.getServletContext();
	    String red = context.getInitParameter("red");
	    String green = context.getInitParameter("green");
	    String song_1 = context.getInitParameter("song");
	    
	    ServletConfig config = this.getServletConfig();
	    String song = config.getInitParameter("song");
	    
	    PrintWriter writer = response.getWriter();
	    writer.println("Hello World by " + method + ".<br/>");
	    writer.println("The song is " + song + ".<br/>");
	    writer.println("Red chosen " + red + " and Green chosen " + green + " and their song are " + song_1 + ".");
	}

}
