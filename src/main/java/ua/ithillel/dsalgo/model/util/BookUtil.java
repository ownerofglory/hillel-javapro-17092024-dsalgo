package ua.ithillel.dsalgo.model.util;

import ua.ithillel.dsalgo.model.product.Book;

import java.util.function.Function;
import java.util.function.Supplier;

public class BookUtil {
    public static Book generateBook(Supplier <Book> bookSupplier) {
        return bookSupplier.get();
    }

    public static Book applyBook(Function<String, Book> bookFunc, String name) {
        return bookFunc.apply(name);
    };
}
