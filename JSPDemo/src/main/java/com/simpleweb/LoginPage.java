package com.simpleweb;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.logindao.LoginDAO;

/**
 * Servlet implementation class LoginPage
 */
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String u = request.getParameter("uname");
		String p = request.getParameter("pass");
		LoginDAO dao= new LoginDAO();
		
			if (dao.checkusername(u, p)) {
				HttpSession session = request.getSession();
				session.setAttribute("username", u);
				response.sendRedirect("Welcome.jsp");
			}
			else {
//				dao.display(u, p);
				response.sendRedirect("failedlogin.jsp");
		
	}

}
}
