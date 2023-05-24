package ar.com.lokywolf.crud.service;

import ar.com.lokywolf.crud.model.dto.request.PersonRequestDTO;
import ar.com.lokywolf.crud.model.dto.request.PersonRequestUpdateDTO;
import ar.com.lokywolf.crud.model.dto.response.PersonResponseDTO;
import ar.com.lokywolf.crud.model.entity.Person;

import java.util.List;

public interface IPersonService {

    PersonResponseDTO registerPerson(PersonRequestDTO dto);
    PersonResponseDTO updatePerson(PersonRequestUpdateDTO dto, long id);
    List<PersonResponseDTO> getAllPersons();
    Person getPersonById(long id);
    PersonResponseDTO getPersonResponseDTOById(long id);
    void deletePersonById(long id);
}
