package com.gestiondeprojet.OutilDeGestion.service;

import com.gestiondeprojet.OutilDeGestion.model.Employe;
import com.gestiondeprojet.OutilDeGestion.repository.EmployeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor

public class EmployeService {

    private EmployeRepository employeRepository  ;

   public List<Employe> getAllEmploye(){
       return employeRepository.findAll() ;
   }

   public Optional<Employe> getAllEmployeId(int id){
       return employeRepository.findById(id);
   }

   public Employe saveEmploye(Employe employe){
       return employeRepository.save(employe);
   }

   public void deleteEmployeById(int id){
       employeRepository.deleteById(id);
   }

   public void UpdateEmploye (int id_employe , String Nom , String Prenom , String Salaire ){
       Optional<Employe> OptinalEmploye =employeRepository.findById(id_employe  );

        if (OptinalEmploye.isPresent()){
            Employe employe  = OptinalEmploye.get();
            employe.setNom(Nom);
            employe.setPrenom(Prenom);
            employe.setSalaire(Salaire);
            employeRepository.save(employe);
        } else {
            throw new IllegalArgumentException("L'Employer qu'on veut modifier n'existe pas");
        }
   }




}
