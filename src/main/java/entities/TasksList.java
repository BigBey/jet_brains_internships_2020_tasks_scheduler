package entities;

import java.util.ArrayList;

public class TasksList {
    private ArrayList<Task> tasks;
    private transient String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TasksList() {
        this.tasks = new ArrayList<>();
        this.title = "untitled";
    }

    public TasksList(String title) {
        this.tasks = new ArrayList<>();
        this.title = title;
    }

    public void addTask(String taskMessage) {
        tasks.add(new Task(taskMessage));
    }

    public void addTask(Task task){
        tasks.add(task);
    }

    public int deleteTask(int index) {
        if(index < tasks.size()) {
            tasks.remove(index);
            return 1;
        }else{
            System.out.println("Index is more than list's size.");
            return 0;
        }
    }

    public int markTask(int index) {
        if(index < tasks.size()) {
            Task task = tasks.get(index);
            if (task.getCompleted()) {
                tasks.get(index).setCompleted(false);
            } else {
                tasks.get(index).setCompleted(true);
            }
            return 1;
        }else{
            System.out.println("Index is more than list's size.");
            return 0;
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
