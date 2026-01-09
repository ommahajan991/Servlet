package requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class ResultServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		///----- Fetching attributes forwarded from CalculateServlet
		Double omarks = (Double) req.getAttribute("omarks");
		Double tmarks = (Double) req.getAttribute("tmarks");
		Double percentage = (Double) req.getAttribute("percentage");
		
		resp.setContentType("text/html");
		PrintWriter gw = resp.getWriter();
		gw.print("<h1>Details : </h1>" + 
					"<h2>Obtained Marks : </h2>"+omarks+
					"<h2>Total Marks : </h2>" +tmarks+
					"<h2>Percentage : </h2>"+percentage);
	}
}