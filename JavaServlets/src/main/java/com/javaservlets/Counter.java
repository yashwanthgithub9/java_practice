package com.javaservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
		HttpSession session = request.getSession();
		String str =(String) session.getAttribute("t1");
		//getAttribute from Firstservlet an store in the string
		PrintWriter out= response.getWriter();
		out.println("Hi "+str+" Welcome to Counter Servlet for "+i+" number of times");
//		out.print(i);
		i++;
	}

}
