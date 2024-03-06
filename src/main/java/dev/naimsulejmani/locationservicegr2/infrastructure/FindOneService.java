package dev.naimsulejmani.locationservicegr2.infrastructure;

@FunctionalInterface
public interface FindOneService<T, ID> {
    public T findById(ID id);
}
