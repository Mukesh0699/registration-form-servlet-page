package register;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		out.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<title>Web Page</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<form action='Check' method='post'>\r\n" + 
				"<table>\r\n" + 
				"<tr>\r\n" + 
				"<td>Username</td>\r\n" + 
				"<td><input type='text' name='uname'></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>Password</td>\r\n" + 
				"<td><input type='password' name='pwd'></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td><input type='submit' value='login'></td>\r\n" + 
				"<td><input type='reset' value='cancel'></td>\r\n" + 
				"</tr>\r\n" + 
				"</table>\r\n" + 
				"</form>\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
