package ar.com.lokywolf.crud.repository;

import ar.com.lokywolf.crud.model.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
    Boolean existsByDni(String dni);
}
