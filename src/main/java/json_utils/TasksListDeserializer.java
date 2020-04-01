package json_utils;

import com.google.gson.*;
import entities.Task;
import entities.TasksList;

import java.lang.reflect.Type;
import java.util.Map;

public class TasksListDeserializer implements JsonDeserializer<TasksList> {
    @Override
    public TasksList deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        TasksList result = new TasksList();

        for(JsonElement element : jsonObject.getAsJsonArray("tasks")){
            Task task = context.deserialize(element, Task.class);
            result.addTask(task);
        }

        return result;
    }
}
