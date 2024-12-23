package com.apoorv.controller;

import com.apoorv.entity.TeamDataModel;
import com.apoorv.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamServiceController {

    @Autowired
    private TeamService service;

    @PostMapping("/addTeam")
    public TeamDataModel addTeam(@RequestBody TeamDataModel Team) {
        return service.saveTeam(Team);
    }

    @PostMapping("/addTeams")
    public List<TeamDataModel> addTeams(@RequestBody List<TeamDataModel> Teams) {
        return service.saveTeams(Teams);
    }

    @GetMapping("/Teams")
    public List<TeamDataModel> findAllTeams() {
        return service.getTeams();
    }

    @GetMapping("/TeamById/{id}")
    public TeamDataModel findTeamById(@PathVariable int id) {
        return service.getTeamById(id);
    }

    @GetMapping("/Team/{name}")
    public TeamDataModel findTeamByName(@PathVariable String name) {
        return service.getTeamByName(name);
    }

    @PutMapping("/update")
    public TeamDataModel updateTeam(@RequestBody TeamDataModel Team) {
        return service.updateTeam(Team);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteTeam(@PathVariable int id) {
        return service.deleteTeam(id);
    }
}
