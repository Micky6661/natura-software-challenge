package py.com.natura.challenge.nurseapp.DAOs;

import py.com.natura.challenge.nurseapp.models.PressureAndRate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Miguel Martinez
 * @mail miguel.martinez@konecta.com.py
 * Fecha 27/07/19
 */
public class PressureRateValuesDAO {

    Map<String, PressureAndRate> values;

    public PressureRateValuesDAO() {
        values = new HashMap<>();
        PressureAndRate p = new PressureAndRate();
        p.setPressure(90);
        p.setRate(60);

        PressureAndRate p1 = new PressureAndRate();
        p1.setPressure(120);
        p1.setRate(80);

        PressureAndRate p2 = new PressureAndRate();
        p2.setPressure(140);
        p2.setRate(90);

        values.put("LOW", p);
        values.put("NORMAL", p1);
        values.put("HIGH", p2);
    }

    public Map<String, PressureAndRate> getValues() {
        return values;
    }
}
