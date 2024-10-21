package com.jspmaven;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspmaven.model.Alien;
import com.jspmaven.model.AlienDAO;

/**
 * Servlet implementation class GetAlienController
 */
public class GetAlienController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int aid = Integer.parseInt(request.getParameter("aid"));
		
		AlienDAO dao = new AlienDAO();// this Class is to create connection to Database
		Alien a1= dao.GetAlien(aid); //Alien class will get values from DAO 
		System.out.println(dao.GetAlien(aid));
		request.setAttribute("aliens", a1); // Passing a1 as an attribute with name "aliens"
		// carefull with name we give here, in showAien.jsp it showed null because "alien" was given
		
		RequestDispatcher rd = request.getRequestDispatcher("showAlien.jsp");
		rd.forward(request, response);
		
	}

}
