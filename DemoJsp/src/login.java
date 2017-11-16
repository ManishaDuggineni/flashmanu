
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.login.dao.loginDao;

@WebServlet("/login")
public class login extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		loginDao dao=new loginDao();
		HttpSession session=request.getSession();
		session.setAttribute("uname",uname);
		
	     
		try {
			if(dao.check(uname, pass))
			{
				HttpSession ses=request.getSession();
				ses.setAttribute("uname",uname);
				
				response.sendRedirect("welcome.jsp");
			}
			else
			{
				response.sendRedirect("login.jsp");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

}
}