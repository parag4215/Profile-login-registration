import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Loginuser")
public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String myuser = req.getParameter("UID");
		String mypass = req.getParameter("PW");
		
		PrintWriter out = resp.getWriter();
		if (myuser.equals("parag8293") && mypass.equals("parag@123") ) {
			System.out.println("Logged in successfully!");
			out.print("Logged in successfully!!");
			
			RequestDispatcher rd = req.getRequestDispatcher("/profile.html");
			rd.forward(req, resp);
			
		}else {
			System.out.println("Invalid credentials");
			out.print("Invalid credentials");
			RequestDispatcher rd = req.getRequestDispatcher("/Register.html");
			rd.forward(req, resp);
		}
	}
}
