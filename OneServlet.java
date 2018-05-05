package src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/1")
public class OneServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public OneServlet(){
		super();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String value = request.getParameter("key");
		
		out.print("<br /> <font color='green'> <h1>" + value +" </h1> </font> <br /> <br />  " );
		out.print("<input type='text' name='key' /> <br /> ");
		//out.print("<a href=''>http://localhost:8080/S4/0 </a>");
		//out.print("<a href=''>http://localhost:8080/S4/1 </a>");
		
		out.print("<a href='http://localhost:8080/S4/0'> Main sevlet </a> ");
		out.print("<br />");
		out.print("<a href='http://localhost:8080/S4/1'> Second servlet </a>");
	
	}
}
