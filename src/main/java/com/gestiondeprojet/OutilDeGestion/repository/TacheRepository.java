package com.gestiondeprojet.OutilDeGestion.repository;

import com.gestiondeprojet.OutilDeGestion.model.Tache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TacheRepository extends JpaRepository<Tache , Integer> {

}
