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
public class RootRoutes {
    private ArrayList<Route> routes;

    private String lastUpdate;

    public ArrayList<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<Route> routes) {
        this.routes = routes;
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
        return "ClassPojo [routes = "+routes+", lastUpdate = "+lastUpdate+"]";
    }
}
