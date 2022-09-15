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
@Table(name = "\"Mission\"")

public class Mission implements Serializable  {
    @Id
    private int id_mission ;
    private String nom_Mission ;

    @ManyToOne
    @JoinColumn(name = "employe_id_employe")
    private Employe employe ;

}
