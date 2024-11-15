package ua.ithillel.dsalgo.model.util;

import ua.ithillel.dsalgo.model.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class FilterUtil {
    public static  <T extends Person> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();

        for (T person : list) {
            if (predicate.test(person)) {
                filteredList.add(person);
            }
        }

        return filteredList;
    }
}
