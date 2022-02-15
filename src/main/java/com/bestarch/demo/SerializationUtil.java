package com.bestarch.demo;

import java.text.SimpleDateFormat;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationUtil {
    
    private static final ObjectMapper mapper = new ObjectMapper();

//    public static <T> String serializeObject(T object) throws JsonProcessingException   {
//        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
//        return mapper.writeValueAsString(object);
//    }
//
//    public static <T> T deserializeObject(String value, Class<T> clazz) throws JsonMappingException, JsonProcessingException    {
//        mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
//        return mapper.readValue(value, clazz);
//    }
}
