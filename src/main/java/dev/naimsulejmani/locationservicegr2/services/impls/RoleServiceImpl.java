package dev.naimsulejmani.locationservicegr2.services.impls;

import dev.naimsulejmani.locationservicegr2.entities.Role;
import dev.naimsulejmani.locationservicegr2.infrastructure.BaseService;
import dev.naimsulejmani.locationservicegr2.repositories.RoleRepository;
import dev.naimsulejmani.locationservicegr2.services.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends BaseService<Role, Integer> implements RoleService {
    protected RoleServiceImpl(RoleRepository repository) {
        super(repository);
    }
}