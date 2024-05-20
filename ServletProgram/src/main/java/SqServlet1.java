

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.util.http.parser.Cookie;


@WebServlet("/sq1")
public class SqServlet1 extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		/*HttpSession session=req.getSession();
		
		int k=(int)session.getAttribute("k");*/
		
		
		int k=0;
	    javax.servlet.http.Cookie[] cookies= req.getCookies();
	    for(javax.servlet.http.Cookie c:cookies)
	    {
	    	if(c.getName().equals("k"))
	    		k=Integer.parseInt(c.getValue());

	    }
		
		//int k=Integer.parseInt(req.getParameter("k"));
		
		
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println("Result is "+k);
		
		//System.out.println("sq called");
	}

}
