package ua.ithillel.dsalgo.model.school;


import ua.ithillel.dsalgo.model.person.Student;

public class ElementarySchool extends School {
    @Override
    public boolean enroll(Student student) {
        if (students.contains(student)) {
            return false;
        }

        students.add(student);
        return true;
    }
}
