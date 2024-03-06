package dev.naimsulejmani.locationservicegr2.infrastructure;

public interface WriteService<T, ID> extends AddService<T>, ModifyService<T,ID>, RemoveService<ID> {
}
