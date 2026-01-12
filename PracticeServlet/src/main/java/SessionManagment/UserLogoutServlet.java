package SessionManagment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class UserLogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		resp.setContentType("text/html");
		PrintWriter gw = resp.getWriter();
		
		// End The Session
		if (session != null) {
			session.invalidate();
			gw.print("<h1>Logout Successfull !! </h1>");
		}
	}

}
