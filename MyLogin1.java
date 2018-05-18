package src;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

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
		//now instead of previous link use valid data to authenticate
		// like this:
		// http://localhost:8080/S4/login?password=123456&&username=user1
		//if authentication is successfully then "ok" response
		//if wrong aunthentication data and user and password not found then "fail" response
		//if password and username data is missing then "no data" response
		
		
		List< Item> users = new ArrayList<>();
		Item TempUser1 = new Item("user1", "123456");
		users.add(TempUser1);
		Item TempUser2 = new Item("user2", "112233");
		users.add(TempUser2);
		Item TempUser3 = new Item("user3", "654321");
		users.add(TempUser3);
		
	    String user_data="";
	
		String server_user_password = request.getParameter("password");
		String server_username = request.getParameter("username");
		
		if( server_user_password != null && server_username != null && server_user_password.length() != 0 && server_username.length() != 0 ){
		
			for(int i = 0; i < users.size(); i++){
		
				//check user and password
				if( server_username.equals(users.get(i).getName()) &&  server_user_password.equals(users.get(i).getValue() )){
					//send user profile data
					user_data = "ok";
					break;
				}else{
				//report user that authentication data not valid
				user_data = "fail";
				}
		
			}
		
		} else { user_data = "no data"; }
		
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
