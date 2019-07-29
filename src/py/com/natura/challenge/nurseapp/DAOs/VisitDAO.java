package py.com.natura.challenge.nurseapp.DAOs;

import py.com.natura.challenge.nurseapp.models.Visit;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Miguel Martinez
 * @mail miguel.martinez@konecta.com.py
 * Fecha 27/07/19
 */
public class VisitDAO {

    List<Visit> visitTableSimulation = new ArrayList<>();


    public Visit selectById(Integer id) {
        for (Visit v : visitTableSimulation) {
            if (v.getVisitId().equals(id)) {
                return v;
            }
        }
        return null;
    }

    public List<Visit> selectAll() {
        return visitTableSimulation;
    }

    public String insert(Visit visit) {
        if (selectById(visit.getVisitId()) == null) {
            visitTableSimulation.add(visit);
            return "Added";
        } else {
            return "Not Added";
        }
    }

    public String update(Visit visit) {
        if (selectById(visit.getVisitId()) != null) {
            Visit v = selectById(visit.getVisitId());
            v.setPacientId(visit.getPacientId());
            v.setObservation(visit.getObservation());
            v.setBloodPressure(visit.getBloodPressure());
            v.setDate(visit.getDate());
            v.setHeartRate(visit.getHeartRate());
            return "Updated";
        } else {
            return "Not Updated";
        }
    }

    public String delete(Integer visitId) {
        if (selectById(visitId) != null) {
            for (int i = 0; i < visitTableSimulation.size(); i++) {
                if (visitTableSimulation.get(i).getVisitId().equals(visitId)) {
                    visitTableSimulation.remove(i);
                    return "Deleted";
                }
            }
        }
        return "Not deleted";
    }

    public Integer getNext() {
        Integer higher = 0;
        for (Visit v : visitTableSimulation) {
            if (v.getVisitId() > higher)
                higher = v.getVisitId();
        }
        return higher + 1;
    }
}
