package ua.ithillel.dsalgo.model.util;

import ua.ithillel.dsalgo.model.person.Person;

import java.util.function.Consumer;
import java.util.function.Function;

public class PersonUtil {
    public static <T> T convertPerson(Person person, Function<Person, T> personConverter) {
        return personConverter.apply(person);
    }

    public static Person applyToPerson(Person person, Consumer<Person> personConsumer) {
        personConsumer.accept(person);
        return person;
    }
}
