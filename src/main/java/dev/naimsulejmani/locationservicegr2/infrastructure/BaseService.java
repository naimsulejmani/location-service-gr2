package dev.naimsulejmani.locationservicegr2.infrastructure;

public interface BaseService<T, ID> extends WriteService<T, ID>, ReadService<T, ID> {
}
