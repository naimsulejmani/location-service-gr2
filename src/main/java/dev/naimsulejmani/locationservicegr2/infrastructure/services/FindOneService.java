package dev.naimsulejmani.locationservicegr2.infrastructure.services;

@FunctionalInterface
public interface FindOneService<T, ID> {
    public T findById(ID id);
}
