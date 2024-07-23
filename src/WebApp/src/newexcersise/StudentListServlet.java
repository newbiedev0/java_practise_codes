package newexcersise;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentListServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve data from the database using JDBC
        String table = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbctest", "root", "venkat");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");
            table += "<table border='1'>";
            table += "<tr><th>ID</th><th>Name</th><th>Email</th><th>Phone</th></tr>";
            while(rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String age   = rs.getString("age");
                table += "<tr><td>" + id + "</td><td>" + name + "</td><td>" + email + "</td><td>" + phone + "</td></tr>"+ age +"</td></tr>";
            }
            table += "</table>";
            con.close();
        } catch(Exception e) {
            System.out.println(e);
        }

     
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>Student List</title></head><body>");
        out.println(table);
        out.println("</body></html>");
    }
}
