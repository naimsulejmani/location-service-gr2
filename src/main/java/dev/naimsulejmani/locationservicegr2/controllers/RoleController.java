package dev.naimsulejmani.locationservicegr2.controllers;

import dev.naimsulejmani.locationservicegr2.dtos.RoleDto;
import dev.naimsulejmani.locationservicegr2.entities.Role;
import dev.naimsulejmani.locationservicegr2.infrastructure.controllers.BaseController;
import dev.naimsulejmani.locationservicegr2.mappers.RoleMapper;
import dev.naimsulejmani.locationservicegr2.services.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/roles")
public class RoleController extends BaseController<Role, Integer, RoleDto> {


    protected RoleController(RoleService service, RoleMapper mapper) {
        super(service, mapper);
    }
}
