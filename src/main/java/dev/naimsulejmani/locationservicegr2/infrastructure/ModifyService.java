package dev.naimsulejmani.locationservicegr2.infrastructure;

@FunctionalInterface
public interface ModifyService<T, ID> {
    public T modify(ID id, T item);
}
