package dev.naimsulejmani.locationservicegr2.infrastructure.services;


public interface ReadService<T, ID> extends FindAllService<T>, FindOneService<T, ID> {
}
