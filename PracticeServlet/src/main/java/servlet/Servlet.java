package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class Servlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String email = req.getParameter("email");
		String number = req.getParameter("number");

		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		pw.print("<h1>Registration Successfull !!!</h1>"
				+ "<b>Username : </b>" +username + "<br>"+"<br>" 
				+ "<b>Email : </b>" +email + "<br>" + "<br>" 
				+ "<b>Number : </b>" +number);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String email = req.getParameter("email");
		String number = req.getParameter("number");

		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");
		pw.print("<h1>Registration Successfull !!!</h1>"
				+ "<b>Username : </b>" +username + "<br>"+"<br>" 
				+ "<b>Email : </b>" +email + "<br>" + "<br>" 
				+ "<b>Number : </b>" +number);
	}
}

