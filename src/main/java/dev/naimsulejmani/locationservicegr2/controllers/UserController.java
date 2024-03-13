package dev.naimsulejmani.locationservicegr2.controllers;

import dev.naimsulejmani.locationservicegr2.dtos.UserDto;
import dev.naimsulejmani.locationservicegr2.dtos.UserSimpleDto;
import dev.naimsulejmani.locationservicegr2.entities.User;
import dev.naimsulejmani.locationservicegr2.infrastructure.controllers.BaseController;
import dev.naimsulejmani.locationservicegr2.mappers.UserMapper;
import dev.naimsulejmani.locationservicegr2.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("api/users")
public class UserController extends BaseController<User, Long, UserDto> {
    protected UserController(UserService service, UserMapper mapper) {
        super(service, mapper);
    }


    @GetMapping("/simple")
    public ResponseEntity<List<UserSimpleDto>> findAllSimpleDtos() {
        var users = service.findAll();
        return ResponseEntity.ok(users.stream().map(getUserMapper()::toUserSimpleDto).toList());
    }

    private  UserMapper getUserMapper() {
        return (UserMapper) mapper;
    }
//    private final UserService service;
//    private final UserMapper mapper;
//
//    public UserController(UserService service, UserMapper mapper) {
//        this.service = service;
//        this.mapper = mapper;
//    }
//
//    @GetMapping
//    public ResponseEntity<List<UserDto>> findAll() {
//        var users = service.findAll();
//        return ResponseEntity.ok(users.stream().map(mapper::toDto).toList());
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<UserDto> findById(@PathVariable long id) {
//        var user = service.findById(id);
//        return ResponseEntity.ok(mapper.toDto(user));
//    }
//
//    @PostMapping
//    public ResponseEntity<UserDto> add(@RequestBody UserDto userDto) {
//        var entity = mapper.toEntity(userDto);
//        entity = service.add(entity);
//        URI uri = URI.create("http://localhost:8080/api/users/" + entity.getId());
//        return ResponseEntity.created(uri).body(mapper.toDto(entity));
////        return ResponseEntity.status(HttpStatus.CREATED).body(mapper.toDto(entity));
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<UserDto> modify(@PathVariable long id, @RequestBody UserDto userDto) {
//        if (id != userDto.getId()) {
//            throw new RuntimeException("Wrong! Different ids provided in body and url!");
//        }
//
//        var entity = mapper.toEntity(userDto);
//        entity = service.modify(id, entity);
//
//        return ResponseEntity.ok(mapper.toDto(entity));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<?> removeById(@PathVariable long id) {
//        service.removeById(id);
//        return ResponseEntity.noContent().build();
//    }


}
























