package com.jspmaven;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jspmaven.model.AlienDAO;

/**
 * Servlet implementation class SetAlienController
 */
public class SetAlienController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int aid = Integer.parseInt(request.getParameter("aidr"));
		String name=request.getParameter("namer");
		String tech=request.getParameter("techr");
		System.out.println(aid+name+tech);
		
		AlienDAO dao = new AlienDAO();
		dao.SetAlien(aid, name, tech);
		
	}

}
