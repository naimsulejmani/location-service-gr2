package dev.naimsulejmani.locationservicegr2.services;

import dev.naimsulejmani.locationservicegr2.entities.User;
import dev.naimsulejmani.locationservicegr2.infrastructure.services.BaseService;

import java.util.List;

public interface UserService extends BaseService<User, Long> {


    public List<User> findByCountLocationGreaterThan(int count);
}
