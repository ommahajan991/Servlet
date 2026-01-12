package SessionManagment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/userlogin")
public class UserLoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Fetch form Data
		String enteredusername = req.getParameter("username");
		String enteredpassword = req.getParameter("password");

		// Fetching actual credentials
		ServletContext context = getServletContext();

		String actualusername = context.getInitParameter("username");
		String actualpassword = context.getInitParameter("password");

		resp.setContentType("text/html");
		PrintWriter gw = resp.getWriter();

		if (enteredusername.equals(actualusername) && enteredpassword.equals(actualpassword)) {
			// Creating/Starting Session
			HttpSession session = req.getSession();

			// Storing Data into Session
			session.setAttribute("username", actualusername);
			session.setAttribute("password", actualpassword);

			gw.print("<h1>Login Succesfull !! </h1>" 
					+ "<h2>See the Dashboard Page : </h2>"
					+ "<a href = 'dashboard'>View DashBoard</a>");
		} else {
			gw.print("<h1>Login Failed !! </h1>" 
					+ "<h2>Login to See the Dashboard Page : </h2>"
					+ "<a href = 'UserLogin.html'>Login</a>");
		}
	}
}
