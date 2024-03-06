package dev.naimsulejmani.locationservicegr2.infrastructure;

public interface Serviceable<T, ID> extends WriteService<T, ID>, ReadService<T, ID> {
}
