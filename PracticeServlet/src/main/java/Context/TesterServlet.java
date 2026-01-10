package Context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/config", 
			initParams = { 
				@WebInitParam(name = "testerRole", value = "SDET"),
				@WebInitParam(name = "requirements", value = "some product requirements"), 
			})

public class TesterServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig servletconfig = getServletConfig();
		String role = servletconfig.getInitParameter("testerRole");
		String requirement = servletconfig.getInitParameter("requirements");
		
		PrintWriter gw = resp.getWriter();
		gw.print("<h1>Role : </h1>" + role +
				"<h1>Requirements :</h1>" + requirement);
	}
}