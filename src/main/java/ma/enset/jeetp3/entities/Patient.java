package ma.enset.jeetp3.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity(name = "PATIENTS")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotEmpty(message = "The name of the patient is required")
    private String name;
    private int age;
    private boolean ill;
    @OneToMany(mappedBy = "patient")
    private Collection<Appointment> appointments;
}
