package com.gestiondeprojet.OutilDeGestion.service;

import com.gestiondeprojet.OutilDeGestion.model.Mission;
import com.gestiondeprojet.OutilDeGestion.repository.MissionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class MissionService  {

    private MissionRepository missionRepository ;

    public List<Mission> getAllMission (){
       return missionRepository.findAll() ;
    }
}
