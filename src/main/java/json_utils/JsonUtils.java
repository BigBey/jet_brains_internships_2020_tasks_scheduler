package json_utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.TasksList;

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

    /*public static HashMap<String , TasksList> readFromJson(){
        HashMap<String , TasksList> result = new HashMap<>();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        try {
            Reader reader = new FileReader(JSON_PATH);
            //result = gson.fromJson(reader, result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
     */
}
