import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/reg")
public class RegisterForm extends HttpServlet{
     
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException{
	  	String name=req.getParameter("Name");
	  	int age = Integer.parseInt(req.getParameter("Age"));
	  	req.setAttribute("n", name);
	  	req.setAttribute("p", age);
	  	RequestDispatcher rd=getServletConfig().getServletContext().getRequestDispatcher("/launcher.jsp");
	  	rd.forward(req, resp);
	}
}
