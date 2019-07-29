package py.com.natura.challenge.nurseapp.views;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 28/07/19
 */
public class MainMenu {

    private Scanner s;

    public MainMenu() {
        this.s = new Scanner(System.in);
    }

    public void show() {
        out.println("*** Welcome to NurseApp ***");
        out.println("Choose an option");
        out.println("1. Visits");
        out.println("2. Pacients");
        out.print("Set your option here: ");
        checkOption(s.nextInt());
    }

    private void checkOption(int option) {
        if (option == 1) {
            VisitView v = new VisitView();
            v.menu();
        } else if (option == 2) {
            PacientView p = new PacientView();
            p.menu();
        } else {
            out.println("Unrecognized Option.");
            out.print("Set your option here: ");
            checkOption(s.nextInt());
        }
    }
}
