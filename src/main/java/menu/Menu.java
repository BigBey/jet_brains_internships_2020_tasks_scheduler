package menu;

public interface Menu {

    void createList(String listTitle);

    void addTaskToList(String listTitle, String taskMessage);

    void deleteTask(String listTitle, int taskNumber);

    void markTask(String listTitle, int taskNumber);

    void showLists();

    void showTasks(String listTitle);

    void showOnlyNotCompletedTasks(String listTitle);

}
