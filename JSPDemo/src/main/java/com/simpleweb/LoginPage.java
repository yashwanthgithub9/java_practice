package com.simpleweb;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.logindao.LoginDAO;

@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String u = request.getParameter("unamelogin");
		String p = request.getParameter("passlogin");
		LoginDAO dao= new LoginDAO();
		
			try {
				if (dao.checkusername(u, p)) {
					HttpSession session = request.getSession();
					session.setAttribute("username", u);
					response.sendRedirect("Welcome.jsp");
				}
				else {
//					dao.display(u, p);
					System.out.println("Redirecting to failedLogin from try block");
					response.sendRedirect("failedlogin.jsp");
					
				}
			}
			catch (IOException e) {
				// TODO Auto-generated catch blockdao.display(u, p);
				response.sendRedirect("failedlogin.jsp");
				System.out.println("From IO exp");

//				e.printStackTrace();
			}

}
}
