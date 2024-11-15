package ua.ithillel.dsalgo.model.func;

@FunctionalInterface
public interface MyFunc<T, R> {
    R apply(T t);
}
