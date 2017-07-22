

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
	{
		String name=request.getParameter("name");
		String password =request.getParameter("password");
		
		
		if(name.equals("praveen") && password.equals("praveen"))
		{
			HttpSession session=request.getSession();
			session.setAttribute("name",name);
			response.sendRedirect("welcome.jsp");
			
		}
		else
		{
			response.sendRedirect("login.jsp");
		}
		
	}
}
