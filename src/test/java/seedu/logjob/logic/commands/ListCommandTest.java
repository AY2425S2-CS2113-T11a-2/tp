package seedu.logjob.logic.commands;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import seedu.logjob.model.ApplicationManager;
import seedu.logjob.model.InternshipApplication;
import seedu.logjob.ui.UiMain;
import seedu.logjob.ui.exceptions.EmptyTableException;

import java.util.ArrayList;

public class ListCommandTest {

    // Dummy ApplicationManager to record if listApplication is invoked.
    private class DummyApplicationManager extends ApplicationManager {
        boolean listCalled = false;

        public DummyApplicationManager() {
            super(new ArrayList<InternshipApplication>());
        }

        @Override
        public void listApplication(UiMain uiMain) {
            listCalled = true;
        }

        public boolean isListCalled() {
            return listCalled;
        }
    }

    @Test
    void execute_callsListApplication() throws EmptyTableException {
        DummyApplicationManager dummyManager = new DummyApplicationManager();
        ListCommand listCommand = new ListCommand();

        // Execute the ListCommand and verify listApplication is called.
        UiMain uiMain = UiMain.getInstance();
        listCommand.execute(dummyManager, uiMain);
        assertTrue(dummyManager.isListCalled());
    }
}
