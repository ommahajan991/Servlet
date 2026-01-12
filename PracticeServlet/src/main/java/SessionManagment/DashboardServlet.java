package SessionManagment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		resp.setContentType("text/html");
		PrintWriter gw = resp.getWriter();
		
		if (session!=null) {
			String username = (String) session.getAttribute("username");
			if (username!=null) {
				gw.print("<h1 style='color:red';>Welcome</h1>" 
						+ username 
						+"<br>"
						+"<button><a href ='logout'>Logout</a></button>");
			}
		}
		else {
			resp.sendRedirect("UserLogin.html");
		}
	}
}