package ar.com.lokywolf.crud.model.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PersonRequestDTO {

    @NotNull
    private String name;
    @NotNull
    private String lastName;
    @NotNull
    private int age;
    @NotNull
    private String dni;
}
