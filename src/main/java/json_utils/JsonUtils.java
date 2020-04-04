package json_utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.Task;
import entities.TasksList;
import menu.MenuImplementation;

import java.io.*;
import java.util.HashMap;

public class JsonUtils {

    private static final String JSON_PATH = "C:\\Users\\zenbook\\IdeaProjects\\jet_brains_internships_2020_tasks_scheduler\\src\\main\\resources\\todo-list.json";

    public static void writeToJson(Object o){
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        try {
            Writer writer = new FileWriter(JSON_PATH);
            gson.toJson(o, writer);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static HashMap<String , TasksList> readFromJson(){
        HashMap<String , TasksList> result = new HashMap<>();
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(HashMap.class, new MenuDeserializer())
                .registerTypeAdapter(TasksList.class, new TasksListDeserializer())
                .registerTypeAdapter(Task.class, new TaskDeserializer())
                .create();
        try {
            Reader reader = new FileReader(JSON_PATH);
            result = gson.fromJson(reader, HashMap.class);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
