package commands;

import menu.MenuImplementation;
import picocli.CommandLine;
import picocli.CommandLine.*;

import java.util.concurrent.Callable;

@Command(description = "Creates new empty list of tasks.", name = "createlist",
        mixinStandardHelpOptions = true, version = "1.0")
public class CreateList implements Callable<Integer> {

    @Parameters(index = "0", description = "The title of list.")
    private String title;

    public static void main(String[] args) throws Exception{
        int exitCode = new CommandLine(new CreateList()).execute(args);
        System.exit(exitCode);
    }
    @Override
    public Integer call() throws Exception {
        MenuImplementation menu = new MenuImplementation();
        menu.createList(title);
        return 0;
    }
}
