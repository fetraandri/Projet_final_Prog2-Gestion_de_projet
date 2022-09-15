package com.gestiondeprojet.OutilDeGestion.controller;

import com.gestiondeprojet.OutilDeGestion.model.Mission;
import com.gestiondeprojet.OutilDeGestion.service.MissionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor

public class MissionController {
    private MissionService missionService ;

    @GetMapping("/Mission")
    public List<Mission> getallMission ( ){
        return missionService.getAllMission() ;
    }
}
