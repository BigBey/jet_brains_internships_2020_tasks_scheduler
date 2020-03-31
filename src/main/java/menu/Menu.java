package menu;

public interface Menu {

    void createList(String listTitle);

    void addTaskToList(String listTitle, String taskMessage);

    void deleteTask(int taskNumber);

    void markTask(int taskNumber);

    void showLists();

    void showTasks(String listTitle);

}
