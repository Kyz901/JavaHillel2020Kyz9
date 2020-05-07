package HomeWork22;

import java.util.ArrayList;
import java.util.List;

public class Students {

    static List<Students> students = new ArrayList<>();

        private int id;
        private String fullName;
        private String nameOfGroup;
        private String yearOfStartEducation;

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

    public Students(int id, String fullName, String nameOfGroup, String yearOfStartEducation) {
        this.id = id;
        this.fullName = fullName;
        this.nameOfGroup = nameOfGroup;
        this.yearOfStartEducation = yearOfStartEducation;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", nameOfGroup='" + nameOfGroup + '\'' +
                ", yearOfStartEducation='" + yearOfStartEducation + '\'' +
                '}';
    }
}


