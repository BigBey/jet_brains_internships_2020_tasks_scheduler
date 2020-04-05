package commands;

import menu.MenuImplementation;
import picocli.CommandLine;
import picocli.CommandLine.*;

import java.util.concurrent.Callable;

@Command(description = "Mark task as completed or not completed.", name = "MarkTask",
mixinStandardHelpOptions = true, version = "1.0")
public class MarkTask implements Callable<Integer> {

    @Parameters(index = "0", description = "The title of list to mark task.")
    private String listTitle;

    @Parameters(index = "1", description = "The index of task to mark.")
    private int taskIndex;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new MarkTask()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception {
        MenuImplementation menu = new MenuImplementation();
        menu.readFromJson();
        menu.markTask(listTitle, taskIndex);
        menu.writeToJson();
        return 0;
    }
}
