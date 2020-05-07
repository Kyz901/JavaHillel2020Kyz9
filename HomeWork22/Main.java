package HomeWork22;

import java.sql.*;


public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/student?"
                        + "useSSL=false&user=root&password=IgorKyzmin@))!");

        allStudentsRequest(connection);
        System.out.println();
        allOneGroupStudentsRequest("AK-181",connection);
        System.out.println();
        allOneYearStudentsRequest("2019-02-09",connection);
        System.out.println();
        avgStudentMarksRequest("Kyzmin I.J",connection);
        System.out.println();
        allStudentStats("Kyzmin I.J",connection);
        System.out.println();
        System.out.println(Students.students);
    }

public static void allStudentsRequest(Connection con) {
    String allStudentsRequestString = "select students.id,fullName,somegroups.nameOfGroup,startYearEducation from student.students\n" +
            "left join somegroups on somegroups.id = students.idOfGroup;";
    try {
        Connection connection = con;
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(allStudentsRequestString);

        while (rs.next()) {

            int id = rs.getInt("id");
            String fullName = rs.getString("fullName");
            String nameOfGroup = rs.getString("nameOfGroup");
            String yearOfStartEducation = rs.getString("startYearEducation");

            Students.students.add(new Students(id, fullName, nameOfGroup, yearOfStartEducation));

            System.out.printf("| %d | %s | %s | %s |", id, fullName, nameOfGroup, yearOfStartEducation);
            System.out.println();
        }



    } catch (Exception e) {
        e.printStackTrace();
    }
}
    public static void allOneGroupStudentsRequest(String sortNameOfGroup,Connection con) {
        String allOneGroupStudentsRequestString = "select students.id,fullName,somegroups.nameOfGroup,startYearEducation from student.students\n" +
                "left join somegroups on somegroups.id = students.idOfGroup\n" +
                "where somegroups.nameOfGroup = ?;";
        try {

            Connection connection = con;
            PreparedStatement preparedStatement = connection.prepareStatement(allOneGroupStudentsRequestString);
            preparedStatement.setString(1,sortNameOfGroup);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String fullName = rs.getString("fullName");
                String nameOfGroup = rs.getString("nameOfGroup");
                String yearOfStartEducation = rs.getString("startYearEducation");

                System.out.printf("| %d | %s | %s | %s |", id, fullName, nameOfGroup, yearOfStartEducation);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void allOneYearStudentsRequest(String sortYear,Connection con) {
        String allOneGroupYearRequestString = "select students.id,fullName,somegroups.nameOfGroup,startYearEducation from student.students\n" +
                "left join somegroups on somegroups.id = students.idOfGroup\n" +
                "where students.startYearEducation = ?;";
        try {

            Connection connection = con;
            PreparedStatement preparedStatement = connection.prepareStatement(allOneGroupYearRequestString);
            preparedStatement.setString(1,sortYear);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String fullName = rs.getString("fullName");
                String nameOfGroup = rs.getString("nameOfGroup");
                String yearOfStartEducation = rs.getString("startYearEducation");

                System.out.printf("| %d | %s | %s | %s |", id, fullName, nameOfGroup, yearOfStartEducation);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void avgStudentMarksRequest(String name,Connection con){
        String avgStudentMarksRequestString = "select students.id,\n" +
                "    fullName,\n" +
                "    somegroups.nameOfGroup,\n" +
                "    avg(marks.mark) as MARK,\n" +
                "    startYearEducation\n" +
                "\n" +
                "    from student.students\n" +
                "    left join somegroups on somegroups.id = students.idOfGroup\n" +
                "    left join marks on marks.idOfStudent = students.id\n" +
                "    where students.fullName = ?;";
        try {


            Connection connection = con;
            PreparedStatement preparedStatement = connection.prepareStatement(avgStudentMarksRequestString);
            preparedStatement.setString(1,name);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("id");
                String fullName = rs.getString("fullName");
                String nameOfGroup = rs.getString("nameOfGroup");
                Double mark = rs.getDouble("MARK");
                String yearOfStartEducation = rs.getString("startYearEducation");
                System.out.printf("| %d | %s | %s | %2.2f | %s |", id, fullName, nameOfGroup,mark, yearOfStartEducation);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void allStudentStats(String name,Connection con) {
        String allStudentStatsRequestString = "select students.id as ID,\n" +
                "students.fullName as FULL_NAME ,\n" +
                "somegroups.nameOfGroup as NAME_OF_GROUP, \n" +
                "marks.mark as MARK,\n" +
                "lessons.nameOfLesson as Lesson,\n" +
                "teachers.fullName as Teacher\n" +
                "from students\n" +
                "\n" +
                "left join somegroups on somegroups.id = students.idOfGroup\n" +
                "left join marks on marks.idOfStudent = students.id\n" +
                "left join lessons on  marks.idOfLesson = lessons.id \n" +
                "left join teachers on lessons.idOfTeacher = teachers.id\n" +
                "where students.fullName = ?" +
                ";";
        try {


            Connection connection = con;
            PreparedStatement preparedStatement = connection.prepareStatement(allStudentStatsRequestString);
            preparedStatement.setString(1,name);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                int id = rs.getInt("ID");
                String fullName = rs.getString("FULL_NAME");
                String nameOfGroup = rs.getString("NAME_OF_GROUP");
                Double mark = rs.getDouble("MARK");
                String lesson = rs.getString("Lesson");
                String teacher = rs.getString("Teacher");
                System.out.printf("| %d | %s | %s | %2.2f | %s | %s |", id, fullName, nameOfGroup,mark, lesson,teacher);
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

