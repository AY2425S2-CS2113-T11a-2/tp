package seedu.duke.logic.commands;

import seedu.duke.model.ApplicationManager;

public class ListCommand extends Command {
    public ListCommand() {
    }

    @Override
    public void execute() {
        try {
            ApplicationManager.listApplication();
        } catch (Exception e) {
            System.out.println("There are no applications in the list.");
        }
    }
}
