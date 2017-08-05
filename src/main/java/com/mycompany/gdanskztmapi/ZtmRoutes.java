/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gdanskztmapi;

import com.google.gson.*;
import com.mycomapny.models.RootRoutes;
import com.mycomapny.models.RootStops;
import com.mycomapny.models.Stop;
import com.mycompany.deserializers.RouteDeserializer;
import com.mycompany.deserializers.StopDeserializer;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 *
 * @author Lukasz
 */
public class ZtmRoutes {
    public static void main(String[] args) throws Exception { 
         String jsonStringRoutes = readUrl("http://91.244.248.19/dataset/c24aa637-3619-4dc2-a171-a23eec8f2172/resource/4128329f-5adb-4082-b326-6e1aea7caddf/download/routes.json");
         String jsonStringStops = readUrl("http://91.244.248.19/dataset/c24aa637-3619-4dc2-a171-a23eec8f2172/resource/cd4c08b5-460e-40db-b920-ab9fc93c1a92/download/stops.json");
         String delay = "http://87.98.237.99:88/delays?stopId=";
         //Linie
         GsonBuilder gsonBuilder = new GsonBuilder();
         gsonBuilder.registerTypeAdapter(RootRoutes.class, new RouteDeserializer());
         Gson gson = gsonBuilder.create();
         RootRoutes rootRoutes = gson.fromJson(jsonStringRoutes, RootRoutes.class);
         
         gsonBuilder = null;
         gson = null;
         //Przystanki
         gsonBuilder = new GsonBuilder();
         gsonBuilder.registerTypeAdapter(RootStops.class, new StopDeserializer());
         gson = gsonBuilder.create();
         RootStops rootStops = gson.fromJson(jsonStringStops, RootStops.class);        
         
         String stopId;
         for (Stop arg : rootStops.getStops()) {
             System.out.println(arg.getStopDesc() + "Lokalizacja na mapie: " + arg.getStopLat() + ", " + arg.getStopLon());
             if(arg.getStopDesc().contains("Kolumba")){
                 stopId = arg.getStopId();
                 System.out.println(readDelay(delay + stopId));
                 String uri = "http://maps.google.com/maps?saddr=Current%20Location&daddr=" + arg.getStopLat() + "," + arg.getStopLon();
                 Desktop.getDesktop().browse(new URI(uri));
             }
         }
        
         
    }
    
    private static String readDelay(String urlString){
        StringBuffer response = null;
        try{
                URL obj = new URL(urlString);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");


		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + urlString);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		
                response = new StringBuffer();
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
        } catch(Exception ex){
            
        }
        return response.toString();
    }
    
    private static String readUrl(String urlString) throws Exception {
    BufferedReader reader = null;
    try {
        URL url = new URL(urlString);
        reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF8"));
        StringBuffer buffer = new StringBuffer();
        int read;
        char[] chars = new char[1024];
        while ((read = reader.read(chars)) != -1)
            buffer.append(chars, 0, read); 

        return buffer.toString();
    } finally {
        if (reader != null)
            reader.close();
    }
}
}
