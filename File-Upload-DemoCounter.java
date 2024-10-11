package com.javaservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Counter
 */
@WebServlet("/Counter")
public class Counter extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Counter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
    int i=0;
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		i=1;
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		PrintWriter out = response.getWriter();
//		out.print(i);
	
//		i++;
//	}
	
//	If Service method in placed along with doGet then Service method will only be called as it is generic method
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
//		
//		Using HttpSession
		
//		HttpSession session = request.getSession();
//		String str =(String) session.getAttribute("t1"); // getAttribute gives object, either cast is or us toString() method
		//getAttribute from Firstservlet an store in the string
		
		//Using Cookie Session management
//		String str=null;
//		Cookie	cookies[]=request.getCookies();
//		for (Cookie cookie : cookies) {
//			if (cookie.getName().equals("t1")) {
//				str=cookie.getValue() +", from Cookies we "; //call from 1st servlet is mandatory so that entered value is taken
//			}
//		}
		//URL Rewriting
		String str = request.getParameter("t1"); //this will fetch null because getParameter searches for t1 from respective html
		//in sample.html only FirstServlet is defined.
		//we'll add this in url of second servlet from FirstServlet call.
		
		PrintWriter out= response.getWriter();
		out.println("Hi "+str+" welcome to Counter Servlet for "+i+" number of times");
//		out.print(i);
		i++;
	}

}
