package json_utils;

import com.google.gson.*;
import entities.Task;

import java.lang.reflect.Type;

public class TaskDeserializer implements JsonDeserializer<Task> {
    @Override
    public Task deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();

        return new Task(jsonObject.get("message").getAsString(), jsonObject.get("completed").getAsBoolean());
    }
}
