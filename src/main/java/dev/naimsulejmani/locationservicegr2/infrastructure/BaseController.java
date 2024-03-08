package dev.naimsulejmani.locationservicegr2.infrastructure;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<TEntity, ID, TDto> {
    private final BaseService<TEntity, ID> service;
    private final Convertable<TEntity, TDto> mapper;

    protected BaseController(BaseService<TEntity, ID> service, Convertable<TEntity, TDto> mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping
    public ResponseEntity<List<TDto>> findAll() {
        var entities = service.findAll();

        return ResponseEntity.ok(entities.stream().map(mapper::toDto).toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<TDto> findById(@PathVariable ID id) {
        var entity = service.findById(id);
        return ResponseEntity.ok(mapper.toDto(entity));
    }

    @PostMapping
    public ResponseEntity<TDto> add(@RequestBody TDto dto) {
        var entity = mapper.toEntity(dto);
        entity = service.add(entity);
        return ResponseEntity.ok(mapper.toDto(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TDto> modify(@PathVariable ID id, @RequestBody TDto dto) {
        //validimi oren e rrathes duke shtuar nje interface HasId

        var entity = mapper.toEntity(dto);
        entity = service.modify(id, entity);

        return ResponseEntity.ok(mapper.toDto(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> removeById(@PathVariable ID id) {
        service.removeById(id);
        return ResponseEntity.noContent().build();
    }


}







