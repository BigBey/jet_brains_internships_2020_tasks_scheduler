package commands;

import menu.MenuImplementation;
import picocli.CommandLine;
import picocli.CommandLine.*;

import java.util.concurrent.Callable;

@Command(description = "Show all existing lists.", name = "ShowLists",
mixinStandardHelpOptions = true, version = "1.0")
public class ShowLists implements Callable<Integer> {

    public static void main(String[] args) {
        int exitCode = new CommandLine(new ShowLists()).execute(args);
        System.exit(exitCode);
    }

    @Override
    public Integer call() throws Exception {
        MenuImplementation menu = new MenuImplementation();
        menu.readFromJson();
        menu.showLists();
        menu.writeToJson();
        return 0;
    }
}
