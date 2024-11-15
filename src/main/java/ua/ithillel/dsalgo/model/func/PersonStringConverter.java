package ua.ithillel.dsalgo.model.func;

import ua.ithillel.dsalgo.model.person.Person;

import java.util.function.Function;

public class PersonStringConverter implements Function<Person, String> {
    @Override
    public String apply(Person person) {
        return person.toString();
    }
}
