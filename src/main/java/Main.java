import entities.TasksList;
import menu.MenuImplementation;

public class Main {

    public static void main(String[] args) {
        MenuImplementation menu = new MenuImplementation();
        TasksList list = new TasksList("List1");
        list.addTask("Task1",false);
        list.addTask("Task2",false);
        list.addTask("Task3",false);
        list.markTask(0);
        //list.showTasks();
        menu.createList("list1");
        menu.addTaskToList("list1", "task1");
        menu.addTaskToList("list1", "task2");
        menu.addTaskToList("list1", "task3");
        menu.showLists();
    }
}
