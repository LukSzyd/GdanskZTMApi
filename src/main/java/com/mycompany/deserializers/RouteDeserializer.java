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
import com.mycomapny.models.RootRoutes;
import com.mycomapny.models.Route;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Lukasz
 */
public class RouteDeserializer implements JsonDeserializer<RootRoutes>{

    @Override
    public RootRoutes deserialize(JsonElement je, Type type, JsonDeserializationContext jdc) throws JsonParseException {
        
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        
        final JsonObject jsonObject = je.getAsJsonObject();//zamiana json na obiekt
        final JsonObject jsonDate = (JsonObject) jsonObject.get(dateFormat.format(date)); //pobranie pierwszeg elementu i zamiana na obiekt
        
        final String lastUpdate = jsonDate.get("lastUpdate").getAsString();
        final JsonArray routesArray = jsonDate.get("routes").getAsJsonArray();
        ArrayList<Route> arrayRoute = new ArrayList<Route>();
        Route route;
        
        for (JsonElement rs : routesArray) {
            route = new Route();
            /*Pobranie wartosci z listy routes w JSON*/
            route.setRouteId(rs.getAsJsonObject().get("routeId").toString());
            route.setAgencyId(rs.getAsJsonObject().get("agencyId").toString());
            route.setRouteShortName(rs.getAsJsonObject().get("routeShortName").toString());
            route.setRouteLongName(rs.getAsJsonObject().get("routeLongName").toString());
            route.setActivationDate(rs.getAsJsonObject().get("activationDate").toString());
            arrayRoute.add(route);
        }
        
        final RootRoutes rootRoutes = new RootRoutes();
        rootRoutes.setLastUpdate(lastUpdate);
        rootRoutes.setRoutes(arrayRoute);
        return rootRoutes;
    }
     
}
