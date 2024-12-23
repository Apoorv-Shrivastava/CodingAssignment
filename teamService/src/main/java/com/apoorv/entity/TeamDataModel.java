package com.apoorv.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;


@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "TBL_TEAMS")
public class TeamDataModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // AUTO_INCREMENT for the ID
    private int id;

    @NonNull
    private String teamName;

    @NonNull
    private String country;

    @NonNull
    private String flagUrl;

    @NonNull
    private String captain;

    @NonNull
    private String viceCaptain;

    @NonNull
    private String wicketKeeper;

    @NonNull
    private String countryCode;

    @NonNull
    private boolean isActive;
}
