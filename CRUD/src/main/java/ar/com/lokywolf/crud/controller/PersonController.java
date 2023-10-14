package ar.com.lokywolf.crud.controller;

import ar.com.lokywolf.crud.model.dto.request.PersonRequestDTO;
import ar.com.lokywolf.crud.model.dto.request.PersonRequestUpdateDTO;
import ar.com.lokywolf.crud.model.dto.response.PersonResponseDTO;
import ar.com.lokywolf.crud.service.IPersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
@RequiredArgsConstructor
public class PersonController {

    private final IPersonService service;

    @PostMapping("/register")
    public ResponseEntity<PersonResponseDTO> registerPerson(@RequestBody PersonRequestDTO dto){
        PersonResponseDTO person = service.registerPerson(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(person);
    }

    @GetMapping("/all")
    public ResponseEntity<List<PersonResponseDTO>> getAllPersons(){
        List<PersonResponseDTO> persons = service.getAllPersons();
        return ResponseEntity.ok(persons);
    }

    @GetMapping("/get_person/{id}")
    public ResponseEntity<PersonResponseDTO> getPersonById(@PathVariable Long id){
        PersonResponseDTO person = service.getPersonResponseDTOById(id);
        return ResponseEntity.ok(person);
    }

    @PatchMapping("/update_person/{id}")
    public ResponseEntity<PersonResponseDTO> updatePerson(@RequestBody PersonRequestUpdateDTO dto, @PathVariable Long id){
        PersonResponseDTO person = service.updatePerson(dto, id);
        return ResponseEntity.ok(person);
    }

    @DeleteMapping("/delete_person/{id}")
    public ResponseEntity<Void> deletePersonById(@PathVariable Long id){
        service.deletePersonById(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
