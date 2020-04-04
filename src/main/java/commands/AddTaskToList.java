package commands;

import menu.MenuImplementation;
import picocli.CommandLine;
import picocli.CommandLine.*;

import java.util.concurrent.Callable;

@Command(description = "Adds new task to list", name = "AddTaskToList", mixinStandardHelpOptions = true, version = "1.0")
public class AddTaskToList implements Callable<Integer> {

    @Parameters(index = "0", description = "The title of list to add.")
    private String listTitle;

    @Parameters(index = "1", description = "The text of new task.")
    private String taskText;

    public static void main(String[] args) throws Exception{
        int exitCode = new CommandLine(new AddTaskToList()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception {
        MenuImplementation menu = new MenuImplementation();
        menu.addTaskToList(listTitle, taskText);
        return 0;
    }
}
