/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.deserializers;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mycomapny.models.RootStops;
import com.mycomapny.models.Stop;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lukasz
 */
public class StopDeserializer implements JsonDeserializer<RootStops>{

    @Override
    public RootStops deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        
        final JsonObject jsonObject = je.getAsJsonObject();//zamiana json na obiekt
        final JsonObject jsonDate = (JsonObject) jsonObject.get(dateFormat.format(date)); //pobranie pierwszeg elementu i zamiana na obiekt
        
        final String lastUpdate = jsonDate.get("lastUpdate").getAsString();
        final JsonArray stopsArray = jsonDate.get("stops").getAsJsonArray();
        Stop stop;
        ArrayList<Stop> arrayStop = new ArrayList<Stop>();
        for (JsonElement rs : stopsArray) {
            stop = new Stop();
            /*Pobranie wartosci z listy stops w JSON*/
            stop.setStopId(rs.getAsJsonObject().get("stopId").toString());
            stop.setStopShortName(rs.getAsJsonObject().get("stopShortName").toString());
            stop.setStopDesc(rs.getAsJsonObject().get("stopDesc").toString());
            stop.setSubName(rs.getAsJsonObject().get("subName").toString());
            stop.setDate(rs.getAsJsonObject().get("date").toString());
            stop.setActivationDate(rs.getAsJsonObject().get("activationDate").toString());
            stop.setStopLat(rs.getAsJsonObject().get("stopLat").toString());
            stop.setStopLon(rs.getAsJsonObject().get("stopLon").toString());
            arrayStop.add(stop);
        }
        
        final RootStops rootStops = new RootStops();
        rootStops.setLastUpdate(lastUpdate);
        rootStops.setStops(arrayStop);
        return rootStops;
    }
}
