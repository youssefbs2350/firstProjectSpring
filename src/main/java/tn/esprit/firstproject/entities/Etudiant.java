package tn.esprit.firstproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;

    private String nomE;
    private String prenomE;
    private Long CIN;
    private String ecole;
    private Date dateNaissance;

    @ManyToMany

    private Set<Reservation> reservations = new HashSet<>();

    // Ajoutez les getters et les setters si nécessaire

}
