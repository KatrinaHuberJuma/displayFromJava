package com.DisplayInfo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("name");
		if (userName == null) {
			userName = "You, unknown person";
		}
		String favLang = request.getParameter("lang");
		if (favLang == null) {
			favLang = "...unknown";
		}
		String homeTown = request.getParameter("town");
		if (homeTown == null) {
			homeTown = "...unknown";
		}
		response.setContentType("text/ html");
		PrintWriter out = response.getWriter();
		out.write("<h1> Welcome, " + userName + "!</h1><h3>Your favorite language is: "+ favLang+"</h3><h5>Home Town:"+homeTown+"</h5>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
