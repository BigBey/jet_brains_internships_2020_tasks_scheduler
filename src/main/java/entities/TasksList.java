package entities;

import java.util.ArrayList;

public class TasksList {
    private ArrayList tasks;
    private String title;

    public void addTask(String taskMessage){
        //запись нового задания в список и в todo-list.json
    }

    public void deleteTask(int index){
        //удаление нового задания из списка и из todo-list.json
    }

    public void markTask(int index){
        //помечаем задание как выполненное/невыполненное
    }

    public void showTasks(){
        //выводим все задания
    }

    public void showOnlyNotCompletedTasks(){
        //выводим еще не выполненные дела
    }
}
