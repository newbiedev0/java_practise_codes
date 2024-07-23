import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String action = request.getParameter("action");
        
        if (action == null) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Student Management</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Student Management</h1>");
            out.println("<form method='get' action='StudentServlet'>");
            out.println("<input type='submit' name='action' value='Add Student' /><br />");
            out.println("<input type='submit' name='action' value='List Students' /><br />");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        } else if (action.equals("Add Student")) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Add Student</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Add Student</h1>");
            out.println("<form method='post' action='StudentServlet'>");
            out.println("Name: <input type='text' name='name' /><br />");
            out.println("Age: <input type='text' name='age' /><br />");
            out.println("Email: <input type='text' name='email' /><br />");
            out.println("Phone: <input type='text' name='phone' /><br />");
            out.println("<input type='submit' value='Save' /><br />");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        } else if (action.equals("List Students")) {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>List Students</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>List Students</h1>");
            
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/mydatabase", "root", "password");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM students");
                
                out.println("<table>");
                out.println("<tr><th>Name</th><th>Age</th><th>Email</th><th>Phone</th></tr>");
                
                while (rs.next()) {
                    String name = rs.getString("name");
                    int age = rs.getInt("age");
                    String email = rs.getString("email");
                    String phone = rs.getString("phone");
                    
                    out.println("<tr><td>" + name + "</td><td>" + age + "</td><td>" + email + "</td><td>" + phone + "</td></tr>");
                }
                
                out.println("</table>");
                
                con.close();
                
            } catch (Exception e) {
                out.println(e);
            }
            
            out.println("</body>");
            out.println("</html>");
        }
        
        out.close();
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
    }
}
       

