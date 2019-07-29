package py.com.natura.challenge.nurseapp.views;

import py.com.natura.challenge.nurseapp.models.Pacient;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * @author Miguel Martinez
 * @mail miguel.martinez@konecta.com.py
 * Fecha 27/07/19
 */
public class PacientView {

    PacientController controller = new PacientController();
    Scanner s;

    public PacientView() {
        s = new Scanner(System.in);
    }

    public void menu() {
        out.println("Patient Menu");
        out.println("1. To List");
        out.println("2. Add new");
        out.println("3. Update");
        out.println("4. Delete");
        switch (s.nextInt()) {
            case 1:
                toList();
                break;
            case 2:
                create();
                break;
            case 3:
                update();
                break;
            case 4:
                delete();
                break;
            case 0:
                MainMenu mainMenu = new MainMenu();
                mainMenu.show();
                break;
            default:
                break;
        }
    }

    private void toList() {
        out.println("Pacient List");
        for (Pacient v : controller.getAllPacients()) {
            out.println(v.toString());
        }
        if (s.nextInt() == 0)
            menu();
    }

    private void create() {
        out.println("Add new Pacient");
        out.println(controller.insertPacient(collectInfo(null)));
        if (s.nextInt() == 0)
            menu();
    }

    private void update() {
        Pacient visitToEdit;
        out.println("Update Pacient");
        out.println("Set Pacient ID to edit: ");
        visitToEdit = controller.getPacient(s.nextInt());
        out.println(controller.updatePacient(collectInfo(visitToEdit)));
        if (s.nextInt() == 0)
            menu();
    }

    private void delete() {
        out.println("Update Pacient");
        out.println("Set Pacient ID to delete: ");
        out.println(controller.deletePacient(s.nextInt()));
        if (s.nextInt() == 0)
            menu();
    }

    private Pacient collectInfo(Pacient vi) {
        Pacient v = (vi != null) ? vi : new Pacient();
        out.println("Name: ");
        v.setName(s.next());
        out.println("Last Name: ");
        v.setLastName(s.next());
        out.println("Age: ");
        v.setAge(s.nextInt());
        return v;
    }

}
