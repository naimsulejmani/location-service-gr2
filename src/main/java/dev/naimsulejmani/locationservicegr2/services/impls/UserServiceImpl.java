package dev.naimsulejmani.locationservicegr2.services.impls;

import dev.naimsulejmani.locationservicegr2.entities.User;
import dev.naimsulejmani.locationservicegr2.infrastructure.BaseServiceImpl;
import dev.naimsulejmani.locationservicegr2.repositories.UserRepository;
import dev.naimsulejmani.locationservicegr2.services.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {
    protected UserServiceImpl(UserRepository repository) {
        super(repository);
    }
}
