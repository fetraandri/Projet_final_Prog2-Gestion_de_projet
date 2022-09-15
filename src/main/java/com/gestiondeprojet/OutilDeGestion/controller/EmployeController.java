package com.gestiondeprojet.OutilDeGestion.controller;

import com.gestiondeprojet.OutilDeGestion.model.Employe;
import com.gestiondeprojet.OutilDeGestion.service.EmployeService;
import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class EmployeController {


    private EmployeService employeService ;


    @GetMapping("")
    public List<Employe> getAllEmploye(){
        return employeService.getAllEmploye();
    }

    @GetMapping("/Employe/{id_Employe}")
    public Optional<Employe> getById(@PathVariable int id_employe){
        return employeService.getAllEmployeId(id_employe);
    }

    @PostMapping("/Employe")
    public Employe insertEmploye(@RequestBody Employe employe){
        return employeService.saveEmploye(employe);
    }

    @DeleteMapping("/Employe/{id_Employe}")
    public void deleteEmploye (@PathVariable int id_employe){
         employeService.deleteEmployeById(id_employe);
    }

    @PatchMapping("/Employe/{id}")
    public void ModifierEmploye(
        @PathVariable int id_employe ,
        @RequestParam(name = "Nom" , required = false ) String Nom ,
        @RequestParam(name = "Prenom", required = false) String Prenom ,
        @RequestParam(name = "telephone", required = false ) String telephone
    )
    {
        employeService.UpdateEmploye(id_employe, Nom, Prenom, telephone);

    }


}
