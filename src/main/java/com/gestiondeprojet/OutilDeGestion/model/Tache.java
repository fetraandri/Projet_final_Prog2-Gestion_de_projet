package com.gestiondeprojet.OutilDeGestion.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "\"Tache\"")
public class Tache implements Serializable {
    @Id
    int id_tache ;

    @Column
    String nom_tache ;

    @ManyToOne
    private Mission mission ;
}
