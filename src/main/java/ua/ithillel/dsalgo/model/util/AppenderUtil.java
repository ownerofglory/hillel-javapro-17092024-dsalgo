package ua.ithillel.dsalgo.model.util;

import ua.ithillel.dsalgo.model.func.Appender;

public class AppenderUtil {
    public static Appender createAppender(final String prefix) {
        return (message) -> System.out.println(prefix + message);
    }
}
