package com.example.masud.stackoverflow;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

final class GSONAdapter implements JsonDeserializer<String> {

    private static final GSONAdapter instance = new GSONAdapter();

    static GSONAdapter instance() {
        return instance;
    }

    @Override
    public String deserialize(JsonElement jsonElement, Type type,
                              JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        if (jsonElement.getAsString().toLowerCase().startsWith("field"))
            return jsonElement.getAsString().toLowerCase();
        else return jsonElement.getAsString();
    }
}