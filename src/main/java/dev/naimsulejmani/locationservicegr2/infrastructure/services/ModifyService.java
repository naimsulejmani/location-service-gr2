package dev.naimsulejmani.locationservicegr2.infrastructure.services;

@FunctionalInterface
public interface ModifyService<T, ID> {
    public T modify(ID id, T item);
}
