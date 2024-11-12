package ua.ithillel.dsalgo.model.school;


import ua.ithillel.dsalgo.model.person.Student;

import java.util.List;

public abstract class School {
    private String name;
    protected List<Student> students;

    public abstract boolean enroll(Student student);
}
