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
        //menu.createList("list1");
        //menu.addTaskToList("list1", "task4");
        //menu.addTaskToList("list1", "task5");
        //menu.addTaskToList("list1", "task6");
        //menu.deleteTask("list1", 4);
        menu.markTask("list1", 1);
        //menu.addTaskToList("list1", "task4");
        //menu.addTaskToList("list1", "task5");
        //menu.addTaskToList("list1", "task6");
        menu.showLists();
    }
}
