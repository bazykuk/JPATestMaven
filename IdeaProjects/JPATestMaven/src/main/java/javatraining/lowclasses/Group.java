package javatraining.lowclasses;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NAW on 18.02.15.
 */
public class Group {

    private String groupName;

    private int course;

    private List<Student> studentsList = new ArrayList<Student>();

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student getStudent(int i) {
        return studentsList.get(i);
    }

    public void setStudent(Student student) {
        studentsList.add(student);
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

}
