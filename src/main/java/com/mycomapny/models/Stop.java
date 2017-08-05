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
public class Stop {
    private String virtual;

    private String subName;

    private String stopLat;

    private String ticketZoneBorder;

    private String activationDate;

    private String stopCode;

    private String nonpassenger;

    private String date;

    private String stopLon;

    private String zoneName;

    private String zoneId;

    private String stopTimezone;

    private String stopName;

    private String stopDesc;

    private String stopId;

    private String depot;

    private String parentStation;

    private String locationType;

    private String wheelchairBoarding;

    private String onDemand;

    private String stopShortName;

    private String stopUrl;

    public String getVirtual ()
    {
        return virtual;
    }

    public void setVirtual (String virtual)
    {
        this.virtual = virtual;
    }

    public String getSubName ()
    {
        return subName;
    }

    public void setSubName (String subName)
    {
        this.subName = subName;
    }

    public String getStopLat ()
    {
        return stopLat;
    }

    public void setStopLat (String stopLat)
    {
        this.stopLat = stopLat;
    }

    public String getTicketZoneBorder ()
    {
        return ticketZoneBorder;
    }

    public void setTicketZoneBorder (String ticketZoneBorder)
    {
        this.ticketZoneBorder = ticketZoneBorder;
    }

    public String getActivationDate ()
    {
        return activationDate;
    }

    public void setActivationDate (String activationDate)
    {
        this.activationDate = activationDate;
    }

    public String getStopCode ()
    {
        return stopCode;
    }

    public void setStopCode (String stopCode)
    {
        this.stopCode = stopCode;
    }

    public String getNonpassenger ()
    {
        return nonpassenger;
    }

    public void setNonpassenger (String nonpassenger)
    {
        this.nonpassenger = nonpassenger;
    }

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getStopLon ()
    {
        return stopLon;
    }

    public void setStopLon (String stopLon)
    {
        this.stopLon = stopLon;
    }

    public String getZoneName ()
    {
        return zoneName;
    }

    public void setZoneName (String zoneName)
    {
        this.zoneName = zoneName;
    }

    public String getZoneId ()
    {
        return zoneId;
    }

    public void setZoneId (String zoneId)
    {
        this.zoneId = zoneId;
    }

    public String getStopTimezone ()
    {
        return stopTimezone;
    }

    public void setStopTimezone (String stopTimezone)
    {
        this.stopTimezone = stopTimezone;
    }

    public String getStopName ()
    {
        return stopName;
    }

    public void setStopName (String stopName)
    {
        this.stopName = stopName;
    }

    public String getStopDesc ()
    {
        return stopDesc;
    }

    public void setStopDesc (String stopDesc)
    {
        this.stopDesc = stopDesc;
    }

    public String getStopId ()
    {
        return stopId;
    }

    public void setStopId (String stopId)
    {
        this.stopId = stopId;
    }

    public String getDepot ()
    {
        return depot;
    }

    public void setDepot (String depot)
    {
        this.depot = depot;
    }

    public String getParentStation ()
    {
        return parentStation;
    }

    public void setParentStation (String parentStation)
    {
        this.parentStation = parentStation;
    }

    public String getLocationType ()
    {
        return locationType;
    }

    public void setLocationType (String locationType)
    {
        this.locationType = locationType;
    }

    public String getWheelchairBoarding ()
    {
        return wheelchairBoarding;
    }

    public void setWheelchairBoarding (String wheelchairBoarding)
    {
        this.wheelchairBoarding = wheelchairBoarding;
    }

    public String getOnDemand ()
    {
        return onDemand;
    }

    public void setOnDemand (String onDemand)
    {
        this.onDemand = onDemand;
    }

    public String getStopShortName ()
    {
        return stopShortName;
    }

    public void setStopShortName (String stopShortName)
    {
        this.stopShortName = stopShortName;
    }

    public String getStopUrl ()
    {
        return stopUrl;
    }

    public void setStopUrl (String stopUrl)
    {
        this.stopUrl = stopUrl;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [virtual = "+virtual+", subName = "+subName+", stopLat = "+stopLat+", ticketZoneBorder = "+ticketZoneBorder+", activationDate = "+activationDate+", stopCode = "+stopCode+", nonpassenger = "+nonpassenger+", date = "+date+", stopLon = "+stopLon+", zoneName = "+zoneName+", zoneId = "+zoneId+", stopTimezone = "+stopTimezone+", stopName = "+stopName+", stopDesc = "+stopDesc+", stopId = "+stopId+", depot = "+depot+", parentStation = "+parentStation+", locationType = "+locationType+", wheelchairBoarding = "+wheelchairBoarding+", onDemand = "+onDemand+", stopShortName = "+stopShortName+", stopUrl = "+stopUrl+"]";
    }
}
