package py.com.natura.challenge.nurseapp.controllers;

import py.com.natura.challenge.nurseapp.DAOs.PacientDAO;
import py.com.natura.challenge.nurseapp.models.Pacient;

import java.util.List;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 27/07/19
 */
public class PacientController {

    PacientDAO dao = new PacientDAO();

    public Pacient getPacient(Integer id) {
        return dao.selectById(id);
    }

    public List<Pacient> getAllPacients() {
        return dao.selectAll();
    }

    public String insertPacient(Pacient pacient) {
        pacient.setPacientId(dao.getNext());
        return dao.insert(pacient);
    }

    public String updatePacient(Pacient pacient) {
        return dao.update(pacient);
    }

    public String deletePacient(Integer visitId) {
        return dao.delete(visitId);
    }
}
