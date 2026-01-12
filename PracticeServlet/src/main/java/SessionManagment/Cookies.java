package SessionManagment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.ServerCookies;

@WebServlet("/cookies")
public class Cookies extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("username", "admin");
		Cookie cookie2 = new Cookie("email", "admin@gmail.com");
		
		resp.addCookie(cookie);
		resp.addCookie(cookie2);
		
		PrintWriter gw = resp.getWriter();
		resp.setContentType("text/html");
		gw.print("<h1>Cookies Created Successfully</h1>" 
				+ "<h2>"+cookie.getName()+"</h2>" 
				+ "<h2>"+cookie.getValue()+"</h2>");
	}

}
