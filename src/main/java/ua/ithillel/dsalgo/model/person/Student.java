package ua.ithillel.dsalgo.model.person;

import java.time.LocalDateTime;

public class Student extends Person implements Comparable<Student> {
    private double gpa;

    public Student(String firstName, String lastName, LocalDateTime dateOfBirth, double gpa) {
        super(firstName, lastName, dateOfBirth);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }





    @Override
    public int compareTo(Student other) {
        // > 0 - this > other
        // < 0 - this < other
        // 0 - this == other
        return this.getLastName().compareTo(other.getLastName());
    }
}
