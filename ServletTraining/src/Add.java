import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Add")
public class Add extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		
		//RequestDispatcher rd= req.getRequestDispatcher("Addsecond");
		//rd.forward(req, res);
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		HttpSession session = req.getSession();
		session.setAttribute("num1", i);
		session.setAttribute("num2", j);
	
		res.sendRedirect("Addsecond");
	}

}
