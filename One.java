package register;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class One
 */
@WebServlet("/One")
public class One extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public One() {
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
		out.println("<!doctype html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<title>Form</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"<form action='Two' method='post'>\r\n" + 
				"<table>\r\n" + 
				"<tr>\r\n" + 
				"<td>Enter Name:</td>\r\n" + 
				"<td><input type='text' name='std'></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>DOB:</td>\r\n" + 
				"<td><input type='text' ></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>Nationality:</td>\r\n" + 
				"<td><input type='text' ></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>Religion:</td>\r\n" + 
				"<td><input type='text'></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>Age:</td>\r\n" + 
				"<td><input type='text'></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>Father's Name:</td>\r\n" + 
				"<td><input type='text'></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>Father's Occupation:</td>\r\n" + 
				"<td><input type='text'></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>Mother's Name:</td>\r\n" + 
				"<td><input type='text'></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>Mother's Occupation:</td>\r\n" + 
				"<td><input type='text'></td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>Select Stream</td>\r\n" + 
				"<td>\r\n" + 
				"<select name=\"stream\">\r\n" + 
				"<option value=\"B.E\">B.E</option>\r\n" + 
				"<option value=\"Btech\">B.TECH</option>\r\n" + 
				"<option value=\"BCOM\">B.COM</option>\r\n" + 
				"<option value=\"MBBS\">MBBS</option>\r\n" + 
				"</select>\r\n" + 
				"</td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td>Select Branch</td>\r\n" + 
				"<td>\r\n" + 
				"<select name=\"branch\">\r\n" + 
				"	<option value=\"cse\">CSE</option>\r\n" + 
				"	<option value=\"ece\">ECE</option>\r\n" + 
				"	<option value=\"EEE\">EEE</option>\r\n" + 
				"	<option value=\"IT\">IT</option>\r\n" + 
				"	<option value=\"MECH\">MECH</option>\r\n" + 
				"</select>\r\n" + 
				"</td>\r\n" + 
				"</tr>\r\n" + 
				"<tr>\r\n" + 
				"<td><input type='Submit' value='Submit'></td>\r\n" + 
				"<td><input type='Reset' value='Clear'></td>\r\n" + 
				"</tr>\r\n" + 
				"</table>\r\n" + 
				"</form>\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
