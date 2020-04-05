package commands;

import menu.MenuImplementation;
import picocli.CommandLine;
import picocli.CommandLine.*;

import java.util.concurrent.Callable;

@Command(description = "Show all tasks in list using it's title.", name = "ShowTasks",
mixinStandardHelpOptions = true, version = "1.0")
public class ShowTasks implements Callable<Integer>{

    @Parameters(index = "0", description = "The title of list to show tasks.")
    private String listTitle;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ShowTasks()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception {
        MenuImplementation menu = new MenuImplementation();
        menu.readFromJson();
        menu.showTasks(listTitle);
        menu.writeToJson();
        return 0;
    }
}
