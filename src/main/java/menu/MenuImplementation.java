package menu;

import entities.TasksList;

import java.util.HashMap;
import java.util.Map;

import json_utils.JsonUtils;

public class MenuImplementation implements Menu {

    private HashMap<String , TasksList> lists = new HashMap<>();

    @Override
    public void createList(String listTitle) {
        lists = JsonUtils.readFromJson();
        lists.put(listTitle, new TasksList(listTitle));
        JsonUtils.writeToJson(lists);
    }

    @Override
    public void addTaskToList(String listTitle, String taskMessage) {
        lists = JsonUtils.readFromJson();
        lists.get(listTitle).addTask(taskMessage);
        JsonUtils.writeToJson(lists);
    }

    @Override
    public void deleteTask(String listTitle, int taskNumber) {
        lists.get(listTitle).deleteTask(taskNumber);
    }

    @Override
    public void markTask(String listTitle, int taskNumber) {
        lists.get(listTitle).markTask(taskNumber);
    }

    @Override
    public void showLists() {
        for(Map.Entry<String, TasksList> list : lists.entrySet()){
            System.out.println(list.getValue().getTitle());
        }
    }

    @Override
    public void showTasks(String listTitle) {
        lists.get(listTitle).showTasks();
    }

    @Override
    public void showOnlyNotCompletedTasks(String listTitle) {
        lists.get(listTitle).showOnlyNotCompletedTasks();
    }

    public void addList(TasksList tasksList){
        lists.put(tasksList.getTitle(), tasksList);
    }
}
