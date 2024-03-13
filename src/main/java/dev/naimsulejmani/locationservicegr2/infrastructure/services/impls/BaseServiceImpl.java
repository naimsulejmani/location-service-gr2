package dev.naimsulejmani.locationservicegr2.infrastructure.services.impls;

import dev.naimsulejmani.locationservicegr2.infrastructure.exceptions.AlreadyExistException;
import dev.naimsulejmani.locationservicegr2.infrastructure.exceptions.NotFoundException;
import dev.naimsulejmani.locationservicegr2.infrastructure.helpers.HasId;
import dev.naimsulejmani.locationservicegr2.infrastructure.services.BaseService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public abstract class BaseServiceImpl<T extends HasId<ID>, ID> implements BaseService<T, ID> {
    protected final JpaRepository<T, ID> repository;

    protected BaseServiceImpl(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    @Override
    public T add(T item) {
        Optional<T> itemFound = repository.findById(item.getId());
        if (itemFound.isPresent()) {
            throw new AlreadyExistException("Entity with same id already exists!");
        }
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
            throw new NotFoundException("Entity not found with id " + id);
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












