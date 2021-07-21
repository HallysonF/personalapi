package one.digitalinnovation.personalapi.dto.mapper;

import one.digitalinnovation.personalapi.dto.request.PersonDTO;
import one.digitalinnovation.personalapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    Person toModel(PersonDTO personDTO);

    PersonDTO toDTO(Person person);
}