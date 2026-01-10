package Context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/context")
public class DeveloperServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		///Fetching the Servlet Object
		ServletContext context = getServletContext();
		String company = context.getInitParameter("Company");
		String location = context.getInitParameter("Location");
		String services = context.getInitParameter("Services");
		
		PrintWriter gw = resp.getWriter();
		gw.write("<h1>Company Name :- </h1>" + company +
				"<h1>Location :- </h1>" + location +
				"<h1>Services :- </h1>" + services);
	}
}