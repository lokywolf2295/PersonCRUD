package ar.com.lokywolf.crud.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="personas")
@SQLDelete(sql = "UPDATE personas SET enable = false WHERE id = ?")
@Where(clause = "enable = true")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, length = 20)
    private long id;
    @Column(name = "name", nullable = false, length = 15)
    private String name;
    @Column(name = "lastName", length = 15)
    private String lastName;
    @Column(name = "age")
    private int age;
    @Column(name = "dni", length = 10)
    private String dni;
    @Column(name = "enable")
    private boolean enabled = true;
}