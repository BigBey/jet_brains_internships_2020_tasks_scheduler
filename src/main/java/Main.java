import entities.TasksList;
import menu.MenuImplementation;

public class Main {

    public static void main(String[] args) {
        MenuImplementation menu = new MenuImplementation();
        TasksList list = new TasksList("List1");
        list.addTask("Task1");
        list.addTask("Task2");
        list.addTask("Task3");
        list.markTask(0);
        //list.showTasks();
        menu.addTaskToList("list2", "task1");
        menu.addTaskToList("list2", "task2");
        menu.addTaskToList("list2", "task3");
        menu.addTaskToList("list1", "task4");
        menu.addTaskToList("list1", "task5");
        menu.addTaskToList("list1", "task6");
        menu.showLists();
    }
}
