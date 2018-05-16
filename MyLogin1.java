package src;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/login")
public class MyLogin1 extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//PrintWriter out = response.getWriter();
		//response.setContentType("application/json");
	   // response.setCharacterEncoding("UTF-8");
	    
		
		// http://localhost:8080/S4/login?password=123456  ( response -> Ok )
		
		
	    String user_data;
	
		String server_user_password = request.getParameter("password");
		
		
		if(server_user_password.equals("123456")	){
			
			//send user profile data
			user_data = "ok";
		}else{
			
			//report user that authentication data not valid
			user_data = "fail";
		}
		
		Item tempItem = new Item("", "");
		//user_data = ("item : [ {" + tempItem.getName() + "} , {" + tempItem.getValue() + "} ]");
		
		//String json = new Gson().toJson(user_data);
	
		String json = new Gson().toJson(user_data);
	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json);
	    
	}
	
	//JavaServlet login
	
	//get sha256-passwordhash from user and autenticate from database
	
	// Get-method parameter login and password
	//if autehnticate was succesfull show user his profile-page with data from database
	
	// user can send message and read other user messages
	
	
	//programming servlet and front-end with div-layout
	//require practise with div to replace html-table and make nice web-page
	
	
}
