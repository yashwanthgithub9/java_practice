package com.javaservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServlet
 */
@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext ct = getServletContext();//ServletContext is Interface, instance will be provided by tomcat
		String s=ct.getInitParameter("name");
		
		PrintWriter out =response.getWriter();
		out.print("Hi "+s);// default it will print null
		//Following is added to web app
//		  <context-param>
//	  		<param-name>name</param-name>
//	  		<param-value>Yashwanth</param-value>
//	      </context-param>
		
		ServletConfig cf = getServletConfig();//ServletContext is Interface, instance will be provided by tomcat
		String s1=cf.getInitParameter("name");
		out.print("Hi "+s1);// default it will print null
		
		
	}

}
