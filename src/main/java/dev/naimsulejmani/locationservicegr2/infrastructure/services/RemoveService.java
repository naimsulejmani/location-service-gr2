package dev.naimsulejmani.locationservicegr2.infrastructure.services;

@FunctionalInterface
public interface RemoveService<ID> {
    public void removeById(ID id);
}
