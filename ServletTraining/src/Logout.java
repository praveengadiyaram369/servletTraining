

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xml.internal.serialize.Printer;

/**
 * Servlet implementation class Logout
 */
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		HttpSession session=request.getSession();
		session.removeAttribute("name");
		session.invalidate();
		
		PrintWriter out = response.getWriter();
		out.println("Logged out");
		
	}
}
