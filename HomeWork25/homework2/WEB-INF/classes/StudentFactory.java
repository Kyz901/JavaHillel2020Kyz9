package MyServlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/createStudent")
public class StudentFactory extends HttpServlet{


    @Override
    public void init() throws ServletException {
        super.init();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
     {

         Connection connection = null;
         try {
             connection = ConnectorDB.getConnection();
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         } catch (SQLException throwables) {
             throwables.printStackTrace();
         }
         response.setContentType("text/html");


        String fullname = request.getParameter("fullName");
        Integer idOfGroup = Integer.parseInt(request.getParameter("idOfGroup"));
        String startYearEducation = request.getParameter("startYearEducation");
        String isDeleted = request.getParameter("isDeleted");


        String insertString = "insert  into students(fullName,idOfGroup,startYearEducation,isDeleted) values (?,?,?);";
        try {






            PreparedStatement preparedStatement = connection.prepareStatement(insertString);
            preparedStatement.setString(1,fullname);
            preparedStatement.setInt(2,idOfGroup);
            preparedStatement.setString(3,startYearEducation);
            preparedStatement.setString(4,isDeleted);

            preparedStatement.executeUpdate();

            PrintWriter writer = response.getWriter();
            writer.println("<p>Full Name: " + fullname + "</p>");
            writer.println("<p>Id of Group: " + idOfGroup + "</p>");
            writer.println("<p>Start year of education : " + startYearEducation + "</p>");
            writer.println("<p>Deleted : " + isDeleted + "</p>");
            writer.println("<p>" + " Student successfully insert into you DB " + "</p>");

            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
