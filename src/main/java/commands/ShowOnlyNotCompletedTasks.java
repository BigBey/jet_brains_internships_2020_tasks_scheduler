package commands;

import menu.MenuImplementation;
import picocli.CommandLine;
import picocli.CommandLine.*;

import java.util.concurrent.Callable;

@Command(description = "Show only not completed tasks in the list using it's title.", name = "ShowOnlyNotCompletedTasks",
mixinStandardHelpOptions = true, version = "1.0")
public class ShowOnlyNotCompletedTasks implements Callable<Integer> {

    @Parameters(index = "0", description = "The title of list.")
    private String listTitle;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ShowOnlyNotCompletedTasks()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception {
        MenuImplementation menu = new MenuImplementation();
        menu.readFromJson();
        menu.showOnlyNotCompletedTasks(listTitle);
        menu.writeToJson();
        return 0;
    }
}
