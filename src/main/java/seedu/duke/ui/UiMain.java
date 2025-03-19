package seedu.duke.ui;

import java.util.Scanner;

import seedu.duke.main.Constants;

public class UiMain {
    private static final Scanner scan = new Scanner(System.in);

    public static void introMessage() {
        System.out.println(Constants.LOGO);
        System.out.println(Constants.INTRO_MESSAGE);
    }

    public static String readInput() {
        String input = "INVALID";
        if (scan.hasNextLine()) {
            input = scan.nextLine();
        } else {
            System.out.println("No input available.");
        }
        return input;
    }

    public static void showLineBreak() {
        System.out.println(Constants.LINE_BREAK);
    }

    public static void exitMessage() {
        System.out.println("Goodbye!");
        scan.close();
    }
}
