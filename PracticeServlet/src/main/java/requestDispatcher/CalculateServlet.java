package requestDispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculate")
public class CalculateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		///----- Fetching Form Data -----
		Double omarks = Double.parseDouble(req.getParameter("omarks"));
		Double tmarks = Double.parseDouble(req.getParameter("tmarks"));
		Double percentage = (omarks/tmarks)*100;
		
		///----- Attaching Data to request object -----
		req.setAttribute("omarks", omarks);
		req.setAttribute("tmarks", tmarks);
		req.setAttribute("percentage", percentage);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/result");
		dispatcher.forward(req, resp);
	}
}