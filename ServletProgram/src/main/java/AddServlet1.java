

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add1")
public class AddServlet1 extends HttpServlet {
	
 public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		int k=i+j;
		
		/*HttpSession session=req.getSession();
		session.setAttribute("k",k);*/
		
		Cookie cookie=new Cookie("k",k+"");
		res.addCookie(cookie);
		
		
		
		
		res.sendRedirect("sq1");
		
		//res.sendRedirect("sq?k="+k);
	}

}
