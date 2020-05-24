package MyServlets;

import Servlets.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

import static MyServlets.Students.students;

@WebServlet("/allSelect")
public class AllStudentSelect extends HttpServlet{

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String title = "Database Result";

        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

        out.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor = \"#f0f0f0\">\n" +
                "<h1 align = \"center\">" + title + "</h1>\n");
        try {
            // Register JDBC driver

            Connection connection = ConnectorDB.getConnection();

            // Execute SQL query
            Statement stmt = connection.createStatement();
            String allSelectString = "select * from students;";
            ResultSet rs = stmt.executeQuery(allSelectString);

            // Extract data from result set
            while(rs.next()){
                //Retrieve by column name
                int id = rs.getInt("id");
                String fullName = rs.getString("fullName");
                String nameOfGroup = rs.getString("nameOfGroup");
                String yearOfStartEducation = rs.getString("startYearEducation");

                students.add(new Students(id, fullName, nameOfGroup, yearOfStartEducation));
                //Display values

            }
            for(int i = 0;i< students.size(); i++ ){
                out.println("ID: " + students.get(i) + "<br>");

//                out.println(", Age: " + fullName + "<br>");
//                out.println(", First: " + nameOfGroup + "<br>");
//                out.println(", Last: " + yearOfStartEducation + "<br>");
            }

            out.println("</body></html>");

            // Clean-up environment
            rs.close();
            stmt.close();
            connection.close();
        } catch(SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch(Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
    }
}
