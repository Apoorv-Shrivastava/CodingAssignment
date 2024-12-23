package com.apoorv.service;

import com.apoorv.entity.TeamDataModel;
import com.apoorv.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired
    private TeamRepository repository;

    public TeamDataModel saveTeam(TeamDataModel Team) {
        return repository.save(Team);
    }

    public List<TeamDataModel> saveTeams(List<TeamDataModel> Teams) {
        return repository.saveAll(Teams);
    }

    public List<TeamDataModel> getTeams() {
        return repository.findAll();
    }

    public TeamDataModel getTeamById(int id) {
        return repository.findById(id).orElse(null);
    }

    public TeamDataModel getTeamByName(String name) {
        return repository.findByName(name);
    }

    public String deleteTeam(int id) {
        repository.deleteById(id);
        return "TeamDataModel removed !! " + id;
    }

    public TeamDataModel updateTeam(TeamDataModel Team) {
        TeamDataModel existingTeam = repository.findById(Team.getId()).orElse(null);

        return repository.save(existingTeam);
    }


}
