package ua.ithillel.dsalgo.model.util;

import ua.ithillel.dsalgo.model.person.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentFilterUtil {
    public static List<Student> filterStudents(List<Student> students, Predicate<Student> predicate) {
        List<Student> filteredStudents = new ArrayList<>();

        for (Student student : students) {
            if (predicate.test(student)) {
                filteredStudents.add(student);
            }
        }

        return filteredStudents;
    }
}
