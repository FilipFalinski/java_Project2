package Project_FilipFalinski;

import java.util.Date;

public class Appointment {

    private Patient patient;
    private Illness illness;
    private Date date;

    public Appointment(Patient patient, Illness illness, Date date) {
        this.patient = patient;
        this.illness = illness;
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Illness getIllness() {
        return illness;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
