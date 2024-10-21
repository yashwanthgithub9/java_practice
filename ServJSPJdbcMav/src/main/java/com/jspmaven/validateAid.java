package com.jspmaven;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class validateAid
 */
public class validateAid implements Filter { //Url-pattern in web.xml should be same for servlet and filter
     
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("Filter class");
		HttpServletRequest req = (HttpServletRequest)request;
		PrintWriter out =response.getWriter();
		// pass the request along the filter chain
		int aid = Integer.parseInt(req.getParameter("aid"));
		if (aid>1)
			chain.doFilter(request, response);// it will chain the filters, last filter should chain to servlet
		else
			out.println("Invalida Aid");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
