package ar.com.lokywolf.crud.service.impl;

import ar.com.lokywolf.crud.model.dto.request.PersonRequestDTO;
import ar.com.lokywolf.crud.model.dto.request.PersonRequestUpdateDTO;
import ar.com.lokywolf.crud.model.dto.response.PersonResponseDTO;
import ar.com.lokywolf.crud.model.entity.Person;
import ar.com.lokywolf.crud.model.mapper.PersonMapper;
import ar.com.lokywolf.crud.repository.PersonRepository;
import ar.com.lokywolf.crud.service.IPersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements IPersonService {

    private final PersonRepository repository;
    private final PersonMapper mapper;
    @Override
    @Transactional
    public PersonResponseDTO registerPerson(PersonRequestDTO dto) {
        if(repository.existsByDni(dto.getDni()))
            throw new RuntimeException("Ya existe una persona con ese DNI");
        Person person = mapper.toPerson(dto);
        return mapper.toDto(repository.save(person));
    }

    @Override
    @Transactional
    public PersonResponseDTO updatePerson(PersonRequestUpdateDTO dto, long id) {
       Person person = getPersonById(id);
       Person updatedPerson = mapper.toUpdatedPerson(dto, person);
       return mapper.toDto(repository.save(updatedPerson));
    }

    @Override
    public List<PersonResponseDTO> getAllPersons() {
        return mapper.toDtoList(repository.findAll());
    }

    @Override
    public Person getPersonById(long id) {
        if(!repository.findById(id).isPresent())
            throw new RuntimeException("No existe una persona con ese ID");
        return repository.findById(id).get();
    }

    @Override
    public PersonResponseDTO getPersonResponseDTOById(long id) {
        return mapper.toDto(getPersonById(id));
    }

    @Override
    public void deletePersonById(long id) {
        repository.deleteById(id);
    }
}