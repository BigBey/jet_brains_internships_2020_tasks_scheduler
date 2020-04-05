package menu;

import entities.TasksList;

import java.util.HashMap;
import java.util.Map;

import json_utils.JsonUtils;

public class MenuImplementation implements Menu {

    private HashMap<String, TasksList> lists = new HashMap<>();

    @Override
    public int createList(String listTitle) {
        if (lists == null) {
            lists = new HashMap<>();
        }
        lists.put(listTitle, new TasksList(listTitle));
        return 1;
    }

    @Override
    public int deleteList(String listTitle) throws NullPointerException {
        if (lists == null || lists.isEmpty()) {
            System.out.println("No lists with this title.");
            return 0;
        } else {
            if (lists.containsKey(listTitle)) {
                lists.remove(listTitle);
                return 1;
            } else {
                System.out.println("No lists with this title.");
                return 0;
            }
        }
    }

    @Override
    public int addTaskToList(String listTitle, String taskMessage) throws NullPointerException {
        if(lists == null || lists.isEmpty()) {
            System.out.println("No lists with this title.");
            return 0;
        }else{
            if(lists.containsKey(listTitle)) {
                lists.get(listTitle).addTask(taskMessage);
                return 1;
            }else{
                System.out.println("No lists with this title.");
                return 0;
            }
        }
    }

    @Override
    public int deleteTask(String listTitle, int taskNumber) throws NullPointerException {
        if(lists == null || lists.isEmpty()) {
            System.out.println("No lists with this title.");
            return 0;
        }else{
            if(lists.containsKey(listTitle)) {
                return lists.get(listTitle).deleteTask(taskNumber);
            }else{
                System.out.println("No lists with this title.");
                return 0;
            }
        }
    }

    @Override
    public int markTask(String listTitle, int taskNumber) throws NullPointerException {
        if(lists == null || lists.isEmpty()) {
            System.out.println("No lists with this title.");
            return 0;
        }else{
            if(lists.containsKey(listTitle)) {
                return lists.get(listTitle).markTask(taskNumber);
            }else{
                System.out.println("No lists with this title.");
                return 0;
            }
        }
    }

    @Override
    public int showLists() throws NullPointerException {
        if(lists != null) {
            for (Map.Entry<String, TasksList> list : lists.entrySet()) {
                System.out.println(list.getValue().getTitle());
            }
        }
        return 1;
    }

    @Override
    public int showTasks(String listTitle) throws NullPointerException {
        if(lists == null || lists.isEmpty()) {
            System.out.println("No lists with this title.");
            return 0;
        }else{
            if(lists.containsKey(listTitle)) {
                lists.get(listTitle).showTasks();
            }else{
                System.out.println("No lists with this title.");
                return 0;
            }
            return 1;
        }
    }

    @Override
    public int showOnlyNotCompletedTasks(String listTitle) throws NullPointerException {
        if(lists == null || lists.isEmpty()) {
            System.out.println("No lists with this title.");
            return 0;
        }else{
            if(lists.containsKey(listTitle)) {
                lists.get(listTitle).showOnlyNotCompletedTasks();
            }else{
                System.out.println("No lists with this title.");
                return 0;
            }
            return 1;
        }
    }

    public void readFromJson(){
        lists = JsonUtils.readFromJson();
    }

    public void writeToJson(){
        JsonUtils.writeToJson(lists);
    }
}
