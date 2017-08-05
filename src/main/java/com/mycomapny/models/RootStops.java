/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycomapny.models;

import java.util.ArrayList;

/**
 *
 * @author Lukasz
 */
public class RootStops {
    private ArrayList<Stop> stops;

    private String lastUpdate;

    public ArrayList<Stop> getStops() {
        return stops;
    }

    public void setStops(ArrayList<Stop> stops) {
        this.stops = stops;
    }

    

    public String getLastUpdate ()
    {
        return lastUpdate;
    }

    public void setLastUpdate (String lastUpdate)
    {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [stops = "+stops+", lastUpdate = "+lastUpdate+"]";
    }
}
