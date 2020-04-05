package commands;

import menu.MenuImplementation;
import picocli.CommandLine;
import picocli.CommandLine.*;

import java.util.concurrent.Callable;

@Command(description = "Deletes existing list from file.", name = "DeleteList",
mixinStandardHelpOptions = true, version = "1.0")
public class DeleteList implements Callable<Integer> {

    @Parameters(index = "0", description = "The title of list.")
    private String listTitle;

    public static void main(String[] args) {
        int exitCode = new CommandLine(new DeleteList()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception {
        MenuImplementation menu = new MenuImplementation();
        menu.readFromJson();
        menu.deleteList(listTitle);
        menu.writeToJson();
        return 0;
    }
}
