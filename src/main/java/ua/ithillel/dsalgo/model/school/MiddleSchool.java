package ua.ithillel.dsalgo.model.school;


import ua.ithillel.dsalgo.model.person.Student;

public class MiddleSchool extends School {
    @Override
    public boolean enroll(Student student) {
        if (!students.contains(student) && student.getGpa() > 0) {
            students.add(student);
            return true;
        }

        return false;
    }
}
