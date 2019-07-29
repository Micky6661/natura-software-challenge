package py.com.natura.challenge.nurseapp.views;

import py.com.natura.challenge.nurseapp.controllers.VisitController;
import py.com.natura.challenge.nurseapp.models.Visit;

import java.util.Date;
import java.util.Scanner;

import static java.lang.System.out;

/**
 * @author Miguel Martinez
 * @mail miguel.martinez@konecta.com.py
 * Fecha 27/07/19
 */
public class VisitView {

    private MainMenu mainMenu;
    private VisitController controller;
    private Scanner s;

    public VisitView() {
        this.controller = new VisitController();
        this.s = new Scanner(System.in);
    }

    public void menu() {
        out.println("Visit Menu");
        out.println("What do you want to do?");
        out.println("1. To List");
        out.println("2. Add new");
        out.println("3. Update");
        out.println("4. Delete");
        out.println("0. Exit");
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
                mainMenu = new MainMenu();
                mainMenu.show();
                break;
            default:
                break;
        }
    }


    private void toList() {
        out.println("Visit List");
        for (Visit v : controller.getAllVisits()) {
            out.println(v.toString());
        }
        out.println("Press 0 to exit");
        if (s.nextInt() == 0)
            menu();
    }

    private void create() {
        out.println("Add new visit");
        out.println(controller.insertVisit(collectInfo(null)));
        out.println("Press 0 to exit");
        if (s.nextInt() == 0)
            menu();
    }

    private void update() {
        Visit visitToEdit;
        out.println("Update visit");
        out.println("Set Visit ID to edit: ");
        visitToEdit = controller.getVisit(s.nextInt());
        out.println(controller.updateVisit(collectInfo(visitToEdit)));
        out.println("Press 0 to exit");
        if (s.nextInt() == 0)
            menu();
    }

    private void delete() {
        out.println("Update visit");
        out.println("Set Visit ID to delete: ");
        out.println(controller.deleteVisit(s.nextInt()));
        out.println("Press 0 to exit");
        if (s.nextInt() == 0)
            menu();
    }

    private Visit collectInfo(Visit vi) {
        Visit v = (vi != null) ? vi : new Visit();
        v.setDate(new Date());
        out.println("Patient ID: ");
        v.setPacientId(s.nextInt());
        out.println("Blood Pressure: ");
        v.setBloodPressure(s.nextInt());
        out.println("Heart Rate: ");
        v.setHeartRate(s.nextInt());
        out.println("Patient Status: " + controller.checkPressureAndRate(v.getBloodPressure(), v.getHeartRate()));
        v.setObservation(controller.checkPressureAndRate(v.getBloodPressure(), v.getHeartRate()));
        return v;
    }
}
