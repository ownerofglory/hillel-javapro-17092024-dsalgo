package ua.ithillel.dsalgo.model.util;

import ua.ithillel.dsalgo.model.person.Person;

import java.util.function.Supplier;

public class PersonGenerator {
    public static Person generatePerson(Supplier<Person> supplier) {
        return supplier.get();
    }
}
