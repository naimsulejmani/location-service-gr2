package dev.naimsulejmani.locationservicegr2.infrastructure;

@FunctionalInterface
public interface AddService<T> {
    public T add(T item);
}
