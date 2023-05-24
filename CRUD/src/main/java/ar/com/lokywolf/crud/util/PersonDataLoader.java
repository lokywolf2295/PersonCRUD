package ar.com.lokywolf.crud.util;

import ar.com.lokywolf.crud.model.dto.request.PersonRequestDTO;
import ar.com.lokywolf.crud.service.IPersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PersonDataLoader implements CommandLineRunner {
    
    private final IPersonService personService;

    @Override
    public void run(String... args) throws Exception {
        loadPersonData();
    }


    private void loadPersonData() {
        if(personService.getAllPersons().isEmpty()){
            PersonRequestDTO person1 = new PersonRequestDTO(
                    "Matias",
                    "Carballo",
                    27,
                    "32164657"
            );
            PersonRequestDTO person2 = new PersonRequestDTO(
                    "Juan",
                    "Pérez",
                    50,
                    "23165464"
            );
            PersonRequestDTO person3 = new PersonRequestDTO(
                    "Pedro",
                    "López",
                    22,
                    "48642315"
            );
            PersonRequestDTO person4 = new PersonRequestDTO(
                    "Lucas",
                    "Weber",
                    18,
                    "1548456"
            );

            personService.registerPerson(person1);
            personService.registerPerson(person2);
            personService.registerPerson(person3);
            personService.registerPerson(person4);
        }
    }
}
