package dev.naimsulejmani.locationservicegr2.mappers;

import dev.naimsulejmani.locationservicegr2.dtos.UserDto;
import dev.naimsulejmani.locationservicegr2.entities.User;
import dev.naimsulejmani.locationservicegr2.infrastructure.Convertable;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper extends Convertable<User, UserDto> {
    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);
}







