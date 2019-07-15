package controller.overview;

import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class OverviewService {


    private static List<Teacher> teachers = new ArrayList<Teacher>();
    static {
        teachers.add(new Teacher("John", "Lewis"));
        teachers.add(new Teacher("David", "Harbour"));
        teachers.add(new Teacher("Lily", "collins"));
    }

    public List<Teacher> retrieveTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void deleteTeacher(Teacher teacher) {
        teachers.remove(teacher);
    }

}


