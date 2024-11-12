package ua.ithillel.dsalgo.model.school;


import ua.ithillel.dsalgo.model.person.Student;

public class University extends School {
    private final static double MIN_GPA = 7.5;

    @Override
    public boolean enroll(Student student) {
        if (!students.contains(student) && student.getGpa() > MIN_GPA) {
            students.add(student);
            return true;
        }

        return false;
    }
}
