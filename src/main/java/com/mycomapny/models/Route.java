/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycomapny.models;

/**
 *
 * @author Lukasz
 */
public class Route
{
    private String routeColor;

    private String routeUrl;

    private String routeType;

    private String routeLongName;

    private String routeTextColor;

    private String routeShortName;

    private String routeId;

    private String activationDate;

    private String agencyId;

    private String routeDesc;

    public String getRouteColor ()
    {
        return routeColor;
    }

    public void setRouteColor (String routeColor)
    {
        this.routeColor = routeColor;
    }

    public String getRouteUrl ()
    {
        return routeUrl;
    }

    public void setRouteUrl (String routeUrl)
    {
        this.routeUrl = routeUrl;
    }

    public String getRouteType ()
    {
        return routeType;
    }

    public void setRouteType (String routeType)
    {
        this.routeType = routeType;
    }

    public String getRouteLongName ()
    {
        return routeLongName;
    }

    public void setRouteLongName (String routeLongName)
    {
        this.routeLongName = routeLongName;
    }

    public String getRouteTextColor ()
    {
        return routeTextColor;
    }

    public void setRouteTextColor (String routeTextColor)
    {
        this.routeTextColor = routeTextColor;
    }

    public String getRouteShortName ()
    {
        return routeShortName;
    }

    public void setRouteShortName (String routeShortName)
    {
        this.routeShortName = routeShortName;
    }

    public String getRouteId ()
    {
        return routeId;
    }

    public void setRouteId (String routeId)
    {
        this.routeId = routeId;
    }

    public String getActivationDate ()
    {
        return activationDate;
    }

    public void setActivationDate (String activationDate)
    {
        this.activationDate = activationDate;
    }

    public String getAgencyId ()
    {
        return agencyId;
    }

    public void setAgencyId (String agencyId)
    {
        this.agencyId = agencyId;
    }

    public String getRouteDesc ()
    {
        return routeDesc;
    }

    public void setRouteDesc (String routeDesc)
    {
        this.routeDesc = routeDesc;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [routeColor = "+routeColor+", routeUrl = "+routeUrl+", routeType = "+routeType+", routeLongName = "+routeLongName+", routeTextColor = "+routeTextColor+", routeShortName = "+routeShortName+", routeId = "+routeId+", activationDate = "+activationDate+", agencyId = "+agencyId+", routeDesc = "+routeDesc+"]";
    }
}
