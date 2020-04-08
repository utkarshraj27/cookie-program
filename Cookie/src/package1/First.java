package package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class First extends HttpServlet {
		
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
         PrintWriter pwriter = response.getWriter();

         String name = request.getParameter("userName");
         String password = request.getParameter("userPassword");
         pwriter.print("Hello "+name);
         pwriter.print("Your Password is: "+password);

         
         Cookie c1=new Cookie("userName",name);
         Cookie c2=new Cookie("userPassword",password);

        
         response.addCookie(c1);
         response.addCookie(c2);
         pwriter.print("<br><a href='Second'>View Details</a>");
         pwriter.close();
	    
	}

}
