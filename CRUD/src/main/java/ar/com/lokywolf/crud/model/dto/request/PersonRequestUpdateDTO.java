package ar.com.lokywolf.crud.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonRequestUpdateDTO {

    private String name;
    private String lastName;
    private int age;
    private String dni;
}
