package ar.com.lokywolf.crud.model.mapper;

import ar.com.lokywolf.crud.model.dto.request.PersonRequestDTO;
import ar.com.lokywolf.crud.model.dto.request.PersonRequestUpdateDTO;
import ar.com.lokywolf.crud.model.dto.response.PersonResponseDTO;
import ar.com.lokywolf.crud.model.entity.Person;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Component
public class PersonMapper {

    public PersonResponseDTO toDto(Person person) {
        return new  PersonResponseDTO(
                person.getName(),
                person.getLastName(),
                person.getAge(),
                person.getDni()
        );
    }

    public Person toPerson(PersonRequestDTO dto) {
        Person person = new Person();
        person.setName(dto.getName());
        person.setLastName(dto.getLastName());
        person.setAge(dto.getAge());
        person.setDni(dto.getDni());
        return person;
    }

    public Person toUpdatedPerson(PersonRequestUpdateDTO dto, Person person) {
        if(!Objects.isNull(dto.getDni())) person.setDni(dto.getDni());
        if(!Objects.isNull(dto.getName())) person.setName(dto.getName());
        if(!Objects.isNull(dto.getLastName())) person.setLastName(dto.getLastName());
        if(!Objects.isNull(dto.getAge())) person.setAge(dto.getAge());
        return person;
    }

    public List<PersonResponseDTO> toDtoList (List<Person> persons){
        return persons.stream().map(person -> toDto(person)).collect(Collectors.toList());
    }
}