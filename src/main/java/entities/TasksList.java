package entities;

import java.util.ArrayList;

public class TasksList {
    private ArrayList<Task> tasks;
    private String title;

    public String getTitle() {
        return title;
    }

    public TasksList(String title) {
        this.tasks = new ArrayList<>();
        this.title = title;
    }

    public void addTask(String taskMessage, Boolean completed) {

        tasks.add(new Task(taskMessage));
        //запись в json
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public void deleteTask(int index) {

        tasks.remove(index);
        //удаление из json
    }

    public void markTask(int index) {

        Task task = tasks.get(index);

        if (task.getCompleted()) {
            tasks.get(index).setCompleted(false);
        } else {
            tasks.get(index).setCompleted(true);
        }
    }

    public void showTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            StringBuilder builder = new StringBuilder();
            builder.append(i);
            builder.append(". ");
            builder.append(tasks.get(i).toString());
            if(tasks.get(i).getCompleted()){
                builder.append(" *");
            }
            System.out.println(builder.toString());
        }
    }

    public void showOnlyNotCompletedTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            if(!tasks.get(i).getCompleted()) {
                StringBuilder builder = new StringBuilder();
                builder.append(i);
                builder.append(". ");
                builder.append(tasks.get(i).toString());
                System.out.println(builder.toString());
            }
        }
    }
}
