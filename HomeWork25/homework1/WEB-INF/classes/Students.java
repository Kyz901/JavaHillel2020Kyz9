package MyServlets;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

public class Students {

    static List<Students> students = new ArrayList<>();

        private int id;
        private String fullName;
        private String nameOfGroup;
        private String yearOfStartEducation;
        private String isDeleted;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public String getYearOfStartEducation() {
        return yearOfStartEducation;
    }

    public void setYearOfStartEducation(String yearOfStartEducation) {
        this.yearOfStartEducation = yearOfStartEducation;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Students(int id, String fullName, String nameOfGroup, String yearOfStartEducation, String isDeleted) {
        this.id = id;
        this.fullName = fullName;
        this.nameOfGroup = nameOfGroup;
        this.yearOfStartEducation = yearOfStartEducation;
        this.isDeleted = isDeleted;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", nameOfGroup='" + nameOfGroup + '\'' +
                ", yearOfStartEducation='" + yearOfStartEducation + '\'' +
                ", isDeleted='" + isDeleted + '\'' +
                '}';
    }
}


