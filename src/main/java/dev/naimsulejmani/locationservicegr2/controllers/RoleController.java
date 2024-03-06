package dev.naimsulejmani.locationservicegr2.controllers;

import dev.naimsulejmani.locationservicegr2.entities.Role;
import dev.naimsulejmani.locationservicegr2.services.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/roles")
public class RoleController {
    private final RoleService service;

    public RoleController(RoleService service) {
        this.service = service;
    }

    @GetMapping
    public List<Role> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Role getById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping
    public Role insert(@RequestBody Role role) {
        return service.add(role);
    }

    @PutMapping("/{id}")
    public Role update(@PathVariable int id, @RequestBody Role role) {
        return service.modify(id, role);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        service.removeById(id);
    }


}
