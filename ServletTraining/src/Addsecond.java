import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Addsecond")
public class Addsecond extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		
		HttpSession session = req.getSession();
		
		int i=(int) session.getAttribute("num1");
		int j=(int) session.getAttribute("num2");
		
		int k=i+j;
		
		PrintWriter out= res.getWriter();
		out.println(k);
	}

}
