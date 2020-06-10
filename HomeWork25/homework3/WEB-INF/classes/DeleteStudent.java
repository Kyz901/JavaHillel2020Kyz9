package MyServlets;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet("/deleteStudent")
public class DeleteStudent extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");


        String fullname = request.getParameter("fullName");
        String isDeleted = request.getParameter("isDeleted");



        String updateString = "update students\n" +
                "set isDeleted = ? " +
                "where fullName = ? ;";
        try {

            PrintWriter writer = response.getWriter();
            writer.println("<p>Full Name: " + fullname + "  Deleted - " + isDeleted+"</p>");



            Connection connection = ConnectorDB.getConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(updateString);
            preparedStatement.setString(1,isDeleted);
            preparedStatement.setString(2,fullname);



            preparedStatement.executeUpdate();




            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

