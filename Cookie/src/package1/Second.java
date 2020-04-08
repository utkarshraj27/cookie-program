package package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Second
 */
@WebServlet("/Second")
public class Second extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");
	       PrintWriter pwriter = response.getWriter();
	 
	       
	       Cookie c[]=request.getCookies(); 
	       
	       pwriter.print("Name: "+c[0].getValue()); 
	       
	       pwriter.print("Password: "+c[1].getValue());
	 
	       pwriter.close();
	
	
	}

}
