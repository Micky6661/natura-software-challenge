package py.com.natura.challenge.nurseapp.DAOs;

import py.com.natura.challenge.nurseapp.models.Pacient;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Miguel Martinez
 * @mail miguel.martinez@konecta.com.py
 * Fecha 27/07/19
 */
public class PacientDAO {

    List<Pacient> pacientTableSimulation = new ArrayList<>();

    public Pacient selectById(Integer id) {
        for (Pacient v : pacientTableSimulation) {
            if (v.getPacientId().equals(id)) {
                return v;
            }
        }
        return null;
    }

    public List<Pacient> selectAll() {
        return pacientTableSimulation;
    }

    public String insert(Pacient pacient) {
        if (selectById(pacient.getPacientId()) == null) {
            pacientTableSimulation.add(pacient);
            return "Added";
        } else {
            return "Not Added";
        }
    }

    public String update(Pacient pacient) {
        if (selectById(pacient.getPacientId()) != null) {
            Pacient v = selectById(pacient.getPacientId());
            v.setName(pacient.getName());
            v.setLastName(pacient.getLastName());
            v.setAge(pacient.getAge());
            return "Updated";
        } else {
            return "Not Updated";
        }
    }

    public String delete(Integer pacient) {
        if (selectById(pacient.getPacientId()) != null) {
            for (int i = 0; i < pacientTableSimulation.size(); i++) {
                if (pacientTableSimulation.get(i).getPacientId().equals(pacient.getPacientId())) {
                    pacientTableSimulation.remove(i);
                    return "Deleted";
                }
            }
        }
        return "Not deleted";
    }

    public Integer getNext() {
        Integer higher = 0;
        for (Pacient v : pacientTableSimulation) {
            if (v.getPacientId() > higher)
                higher = v.getPacientId();
        }
        return higher + 1;
    }
}
