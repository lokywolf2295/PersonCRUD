package ar.com.lokywolf.crud.model.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonResponseDTO {

    private String name;
    private String lastName;
    private int age;
    private String dni;
}
