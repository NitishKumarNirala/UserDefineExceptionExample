package com.exception.test;

import java.lang.reflect.Type;
import java.time.ZonedDateTime;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
/**
 * 
 * @author nitishkumar.nirala
 *
 */
public class GenericMethodExample {
   
   // need to add gson-2.2.4 jar files
   public static final <T> T convertJson(String data, Class<T> generic) {

      Gson gson = new GsonBuilder().registerTypeAdapter(ZonedDateTime.class, new JsonDeserializer<ZonedDateTime>() {
         @Override
         public ZonedDateTime deserialize(JsonElement json, Type type,JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
            return ZonedDateTime.parse(json.getAsJsonPrimitive().getAsString());
         }
      }).create();

      System.out.println("#############"+data);
      return gson.fromJson(data, generic);
   }
}
