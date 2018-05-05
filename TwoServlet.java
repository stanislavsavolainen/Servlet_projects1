package src;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/2")
public class TwoServlet  extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// https://stackoverflow.com/questions/4112686/how-to-use-servlets-and-ajax/
	   
		List< String> list = new ArrayList<>();
	    //list.add("item1");
	    //list.add("item2");
	    //list.add("item3");
	    
		
		String value = request.getParameter("limit");
		
		//if value parameter is not empty
		if( value != null && value.length() != 0  ){
			
			//what if value is not number ?
			char number_character[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
			
			boolean character_number_only = true;
			
			for(int i = 0; i < value.length(); i++){
				
				int char_count = 0;
				
				for(int j = 0; j < number_character.length; j++ ){
					//compare each character to be numberic
					
					if( value.charAt(i) == number_character[j] ){
						//character_number_only = false;
						char_count += 1;
					}
					
				}
				//any number character match, then ok
				if(char_count == 0) character_number_only = false;
			}
			
			//allow parsering if there is only number characters in string
			if( character_number_only ){
				for(int i = 0; i < Integer.parseInt(value); i++){
					//items = {" " , " " }; 
					// list.add("item : {" + new Item("" , "" ).toString() + "}" );
					Item tempItem = new Item("", "");
					list.add("item : [ {" + tempItem.getName() + "} , {" + tempItem.getValue() + "} ]");
				}
			} 
			
			
		}else{
			//default value
			for(int i = 0; i < 20; i ++ ){
				Item tempItem = new Item("", "");
				list.add("item : [ {" + tempItem.getName() + "} , { " + tempItem.getValue() + "} ]");
			}
		}
	    
	    
	    String json = new Gson().toJson(list);

	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json);
		
		
	
	}
		
}
