package com.javaservlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().println("doGet method called from First Servlet");
		// Calling Counter from This servelet
		response.getWriter().println("Redirecting to Counter Servlet");
//		RequestDispatcher rd = request.getRequestDispatcher("Counter");
//		rd.forward(request, response);//It will call Second servlet to execute
		//Title of webpage will be First Servlet
		
		
		
		
		HttpSession session = request.getSession();
		session.setAttribute("t1", request.getParameter("t1"));//setAttribte with get Paramreter
		response.sendRedirect("Counter");//It will redirect client to second servlet
		//Title of Webpage will be Second servlet observe changes
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
	}

}
