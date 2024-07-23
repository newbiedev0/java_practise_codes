package newexcersise;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AddStudentServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Retrieve data from the HTML form
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String email = request.getParameter("email");
		int phone=Integer.parseInt(request.getParameter("phone"));

		// Save data to the database using JDBC
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "password");
			PreparedStatement stmt = con.prepareStatement("INSERT INTO students (name, email,phone,age ) VALUES (?, ?, ?,?)");
			stmt.setString(1, name);
			stmt.setString(2, email);
			stmt.setInt(3,phone);
			stmt.setInt(4,age);
			stmt.executeUpdate();
			con.close();
		} catch(Exception e) {
			System.out.println(e);
		}

		// Redirect back to the HTML form
		response.sendRedirect("add_student.html");
	}
}
