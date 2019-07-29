package py.com.natura.challenge.nurseapp.controllers;

import py.com.natura.challenge.nurseapp.DAOs.PressureRateValuesDAO;
import py.com.natura.challenge.nurseapp.DAOs.VisitDAO;
import py.com.natura.challenge.nurseapp.models.PressureAndRate;
import py.com.natura.challenge.nurseapp.models.Visit;

import java.util.List;
import java.util.Map;

/**
 * @author Miguel Martinez
 * @mail miguel.martinez@konecta.com.py
 * Fecha 27/07/19
 */
public class VisitController {

    VisitDAO dao = new VisitDAO();
    PressureRateValuesDAO daoB = new PressureRateValuesDAO();

    public Visit getVisit(Integer id) {
        return dao.selectById(id);
    }

    public List<Visit> getAllVisits() {
        return dao.selectAll();
    }

    public String insertVisit(Visit visit) {
        visit.setVisitId(dao.getNext());
        return dao.insert(visit);
    }

    public String updateVisit(Visit visit) {
        return dao.update(visit);
    }

    public String deleteVisit(Integer visitId) {
        return dao.delete(visitId);
    }

    public String checkPressureAndRate(Integer pressure, Integer rate) {
        Map<String, PressureAndRate> values = daoB.getValues();
        if (pressure < values.get("LOW").getPressure())
            return "LOW_PRESSURE";
        else if (pressure.equals(values.get("LOW").getPressure()) && rate <= values.get("LOW").getRate())
            return "LOW_PRESSURE";
        else if (pressure > values.get("HIGH").getPressure())
            return "HIGH_PRESSURE";
        else if (pressure.equals(values.get("HIGH").getPressure()) && rate >= values.get("HIGH").getRate())
            return "HIGH_PRESSURE";

        return "NORMAL";
    }

}
