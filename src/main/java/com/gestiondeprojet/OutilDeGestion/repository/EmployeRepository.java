package com.gestiondeprojet.OutilDeGestion.repository;

import com.gestiondeprojet.OutilDeGestion.model.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeRepository extends JpaRepository<Employe, Integer> {

}
