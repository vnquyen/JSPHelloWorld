package edu.jsp.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class WebsiteSession implements HttpSessionListener {
    
    private static int numberOfSession = 1;

    @Override
    public void sessionCreated(HttpSessionEvent event) {
        event.getSession().getServletContext().log("A new session was created: " + ++numberOfSession);  
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
        event.getSession().getServletContext().log("A new session was destroyed: " + --numberOfSession);
    }

}
