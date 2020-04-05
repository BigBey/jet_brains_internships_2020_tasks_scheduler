package menu;

public interface Menu {

    int createList(String listTitle);

    int deleteList(String listTitle);

    int addTaskToList(String listTitle, String taskMessage);

    int deleteTask(String listTitle, int taskNumber);

    int markTask(String listTitle, int taskNumber);

    int showLists();

    int showTasks(String listTitle);

    int showOnlyNotCompletedTasks(String listTitle);

}
