import entities.TasksList;

public class Main {

    public static void main(String[] args) {
        TasksList list = new TasksList("List1");
        list.addTask("Task1");
        list.addTask("Task2");
        list.addTask("Task3");
        list.markTask(0);
        list.showTasks();
    }
}
