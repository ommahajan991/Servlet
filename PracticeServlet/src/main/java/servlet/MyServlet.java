package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/// @WebServlet annotation is used to map servlet class to url pattern without using web.xml
@WebServlet("/dev")
public class MyServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Service Method is Called");
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.write("<h1>Hello Servlet</h1>");
	}
}