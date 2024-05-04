package tn.esprit.firstproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;
@OneToOne(mappedBy = "foyer")
    private Universite universite;

@OneToMany(mappedBy = "foyer")
    private Set<Bloc> blocs;
}
