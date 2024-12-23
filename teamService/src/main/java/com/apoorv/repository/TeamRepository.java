package com.apoorv.repository;

import com.apoorv.entity.TeamDataModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamDataModel,Integer>
{
    TeamDataModel findByName(String name);
}

