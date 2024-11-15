package ua.ithillel.dsalgo.model.util;

import ua.ithillel.dsalgo.model.school.School;

import java.util.function.Supplier;

public class SchoolCreator {
    public static School createSchool(Supplier<School> schoolSupplier) {
        return schoolSupplier.get();
    }
}
