package feedback;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/regform")
public class register extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter out=res.getWriter();
		String fname=req.getParameter("firstname");
		String lname=req.getParameter("lastname");
		String clg=req.getParameter("college");
		String dept=req.getParameter("department");
		String cont=req.getParameter("contact");
		String myemail=req.getParameter("email");
		String pass=req.getParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/feedback","root","Sahil@123");
			
			PreparedStatement ps =con.prepareStatement("insert into register values(?,?,?,?,?,?,?)");
			ps.setString(1, fname);
			ps.setString(2, lname);
			ps.setString(3, clg);
			ps.setString(4, dept);
			ps.setString(5, cont);
			ps.setString(6, myemail);
			ps.setString(7, pass);
			
			int count= ps.executeUpdate();
			if(count>0) {
				res.setContentType("text/html");
				out.print("<h3> user registered successfully </h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/header.jsp");
				rd.include(req, res);
			}
			else {
				res.setContentType("text/html");
				out.print("<h3> user not registered due to some error </h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/header.jsp");
				rd.include(req, res);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			res.setContentType("text/html");
			out.print("<h3> exception occured "+e.getMessage()+" </h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/header.jsp");
			rd.include(req, res);
		}
		
	}
}
