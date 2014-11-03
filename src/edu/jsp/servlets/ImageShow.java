package edu.jsp.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import edu.jsp.models.Student;

/**
 * Servlet implementation class ImageShow
 */
//@WebServlet("/imgshow")
public class ImageShow extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImageShow() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doCheck(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doCheck(request, response);
	}

    private void doCheck(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String username = (String)session.getAttribute("username");
        PrintWriter writer = response.getWriter();
        writer.println("Hello World by " + username + ".<br/>");
        
	    if(username != null) {
	        for(Cookie c: request.getCookies()) {
	            System.out.println(c.getName());
	            System.out.println(c.getValue());
	        }
	        
	        Student student = new Student();
	        student.setName("Red");
	        request.setAttribute("student", student);
	        
	        List<String> languages = new ArrayList<String>();
	        languages.add("Java");
	        languages.add("C#");
	        languages.add("C++");
	        languages.add("PHP");
	        request.setAttribute("languages", languages);
	        
	        request.setAttribute("otherScope", "Request Scope");
	        session.setAttribute("otherScope", "Session Scope");
	        this.getServletContext().setAttribute("otherScope", "Application Scope");
	        
	        RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/menu.jsp");
	        dispatcher.forward(request, response);
	    } else {
	        RequestDispatcher dispatcher = request.getRequestDispatcher("jsp/login.jsp");
            dispatcher.forward(request, response);
	    }
    }

}
