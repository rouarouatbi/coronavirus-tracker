package com.example.coronavirustracker.models;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter@Setter
public class LocationStats {
    private String state;
    private String country;
    private int lastestTotal;
    private int LatestTotalCases;
    private int DiffFromPrevDay;
}