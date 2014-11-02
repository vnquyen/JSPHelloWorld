package edu.jsp.models;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Image implements HttpSessionBindingListener {
    private String name;
    private int width;
    private int height;
    private String path;
    
    public Image(String name, int width, int height, String path) {
        this.name = name;
        this.width = width;
        this.height = height;
        this.path = path;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getWidth() {
        return width;
    }
    
    public void setWidth(int width) {
        this.width = width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public String getPath() {
        return path;
    }
    
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        event.getSession().getServletContext().log("Image is in the seesion " + getName());
        
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        event.getSession().getServletContext().log("Image is out the seesion " + getName());
        
    }
    
    
}
