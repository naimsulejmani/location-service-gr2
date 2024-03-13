package dev.naimsulejmani.locationservicegr2.mappers;

import dev.naimsulejmani.locationservicegr2.dtos.RoleDto;
import dev.naimsulejmani.locationservicegr2.entities.Role;
import dev.naimsulejmani.locationservicegr2.infrastructure.helpers.Convertable;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface RoleMapper extends Convertable<Role, RoleDto> {
    RoleMapper MAPPER = Mappers.getMapper(RoleMapper.class);

}
