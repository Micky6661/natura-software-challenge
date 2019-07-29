package py.com.natura.challenge.nurseapp.models;

import java.util.Date;

/**
 * @author Miguel Martinez
 * @mail mickygates27@gmail.com
 * Fecha 27/07/19
 */
public class Visit {

    private Integer visitId;
    private Integer pacientId;
    private Integer bloodPressure;
    private Integer heartRate;
    private Date date;
    private String observation;

    public Visit() {
    }

    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    public Integer getPacientId() {
        return pacientId;
    }

    public void setPacientId(Integer pacientId) {
        this.pacientId = pacientId;
    }

    public Integer getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Integer bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Integer getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(Integer heartRate) {
        this.heartRate = heartRate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    @Override
    public String toString() {
        return "ID =" + visitId +
                ", Pacient Id=" + pacientId +
                ", Blood Pressure=" + bloodPressure +
                ", Heart Rate=" + heartRate +
                ", Date=" + date +
                ", Observation='" + observation;
    }
}
