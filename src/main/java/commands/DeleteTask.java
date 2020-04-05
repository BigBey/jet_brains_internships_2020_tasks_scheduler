package commands;

import menu.Menu;
import menu.MenuImplementation;
import picocli.CommandLine;
import picocli.CommandLine.*;

import java.util.concurrent.Callable;

@Command(description = "Deletes task from list using it's index in list.", name = "DeleteTask",
mixinStandardHelpOptions = true, version = "1.0")
public class DeleteTask implements Callable<Integer> {

    @Parameters(index = "0", description = "The title of list.")
    private String listTitle;

    @Parameters(index = "1", description = "The index of task to delete")
    private int taskIndex;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new DeleteTask()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception {
        MenuImplementation menu = new MenuImplementation();
        menu.readFromJson();
        menu.deleteTask(listTitle, taskIndex);
        menu.writeToJson();
        return 0;
    }
}
