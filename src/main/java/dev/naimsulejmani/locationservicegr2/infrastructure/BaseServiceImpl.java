package dev.naimsulejmani.locationservicegr2.infrastructure;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<T, ID> implements BaseService<T, ID> {
    private final JpaRepository<T, ID> repository;

    protected BaseServiceImpl(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public T add(T item) {
        return repository.save(item);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T findById(ID id) {
        Optional<T> item = repository.findById(id);

        if (item.isEmpty())
            throw new EntityNotFoundException("Entity not found with id " + id);
        return item.get();
    }

    @Override
    public T modify(ID id, T item) {
        this.findById(id);

        return repository.save(item);
    }

    @Override
    public void removeById(ID id) {
        T item = this.findById(id);
        repository.delete(item);
    }
}












