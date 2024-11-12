package ua.ithillel.dsalgo.model.person;

import java.time.LocalDateTime;
import java.util.Objects;

public class Employee extends Person {
    private String job;

    public Employee(String firstName, String lastName, LocalDateTime dateOfBirth, String job) {
        super(firstName, lastName, dateOfBirth);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    @Override
    public boolean equals(Object o) {
        // non-null
        // reflective
        // transitive
        // symmetry
        // consistency

        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return Objects.equals(getFirstName(), employee.getFirstName()) && Objects.equals(getLastName(), employee.getLastName()) && Objects.equals(getDateOfBirth(), employee.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(job);
    }
}
