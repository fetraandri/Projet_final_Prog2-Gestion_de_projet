package com.gestiondeprojet.OutilDeGestion.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity

public class Materiel implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    int id_Materiel ;

    @Column
    String type ;

    @Column
    int quantite_Stock ;

    @Column
    String genre ;

    @ManyToOne
    private Tache tache ;

}
