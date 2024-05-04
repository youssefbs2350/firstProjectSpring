package tn.esprit.firstproject.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Chambre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre;
    private Long numChambre;
    private  typeChambre typeC;



    private enum typeChambre {
        SINGLE, DOUBLE, TRIPLE
    }
    @ManyToOne
    private Bloc bloc;
    @OneToMany
    Set<Reservation> reservations;

}


