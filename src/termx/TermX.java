package termx;

import java.util.Scanner;

/**
 *
 * @author admodev
 */
public class TermX {

    public static void createNewSession() {
        //placeholder...
        System.out.println("New session created!");
    }

    public static void openNewFile() {
        //placeholder...
        System.out.println("File opened successfully!");
    }

    public static void openCalendar() {
        //placeholder...
        System.out.println("Opening calendar, please wait...");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to TermX!");

        String[] menuOptions = {"New session", "Open file", "Calendar"};

        Scanner sc = new Scanner(System.in);

        System.out.println("What do you want to do today?");
        System.out.println(menuOptions[0]);
        System.out.println(menuOptions[1]);
        System.out.println(menuOptions[2]);

        String selection = sc.nextLine();
        var toLowerCase = selection.toLowerCase();
        var trim = toLowerCase.trim();

        switch (trim) {
            case "new session" ->
                createNewSession();
            case "open file" ->
                openNewFile();
            case "calendar" ->
                openCalendar();
        }
    }

}
