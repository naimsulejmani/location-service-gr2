package dev.naimsulejmani.locationservicegr2.services.impls;

import dev.naimsulejmani.locationservicegr2.entities.Role;
import dev.naimsulejmani.locationservicegr2.infrastructure.exceptions.AlreadyExistException;
import dev.naimsulejmani.locationservicegr2.infrastructure.services.impls.BaseServiceImpl;
import dev.naimsulejmani.locationservicegr2.repositories.RoleRepository;
import dev.naimsulejmani.locationservicegr2.services.RoleService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleServiceImpl extends BaseServiceImpl<Role, Integer> implements RoleService {
    protected RoleServiceImpl(RoleRepository repository) {
        super(repository);
    }

    @Override
    public Role add(Role item) {
        Optional<Role> role = getRepository().findByName(item.getName());
        if (role.isPresent()) {
            throw new AlreadyExistException("Role with the same name already exists!");
        }
        return super.add(item);
    }

    private RoleRepository getRepository() {
        return (RoleRepository) repository;
    }
}
