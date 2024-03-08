package dev.naimsulejmani.locationservicegr2.infrastructure;

public interface Convertable<TEntity, TDto> {
    public TEntity toEntity(TDto dto);

    public TDto toDto(TEntity entity);
}
