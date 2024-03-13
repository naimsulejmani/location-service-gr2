package dev.naimsulejmani.locationservicegr2.infrastructure.services;

@FunctionalInterface
public interface AddService<T> {
    public T add(T item);
}
