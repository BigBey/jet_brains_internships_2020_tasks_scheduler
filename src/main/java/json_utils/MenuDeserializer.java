package json_utils;

import com.google.gson.*;
import entities.TasksList;
import menu.MenuImplementation;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class MenuDeserializer implements JsonDeserializer<HashMap<String, TasksList>> {
    @Override
    public HashMap<String, TasksList> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        HashMap<String, TasksList> result = new HashMap<>();
        JsonObject jsonObject = json.getAsJsonObject();

        for(Map.Entry<String, JsonElement> entry : jsonObject.entrySet()){
            TasksList tasksList = context.deserialize(entry.getValue(), TasksList.class);
            tasksList.setTitle(entry.getKey());
            result.put(tasksList.getTitle(), tasksList);
        }

        return result;
    }
}
