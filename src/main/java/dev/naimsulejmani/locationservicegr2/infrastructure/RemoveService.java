package dev.naimsulejmani.locationservicegr2.infrastructure;

@FunctionalInterface
public interface RemoveService<ID> {
    public void removeById(ID id);
}
