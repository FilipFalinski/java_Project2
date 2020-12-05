package Project_FilipFalinski;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Appointment {

    private int appointmentID;
    private Date date;
    private String description;
    private List<Doctor> doctors;

    Appointment(int appointmentID, Date date, List<Doctor> doctors, String description) {
        this.appointmentID = appointmentID;
        this.date = date;
        this.doctors = new ArrayList<>(doctors);
        this.description = description;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public Date getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void printInvolvedDoctors() {
        for (Doctor doctor : doctors) {
            System.out.println("Name: " + doctor.getPatientName() + "\t" +
                    "Surname: " + doctor.getPatientSurname() + "\t" +
                    "Age: " + doctor.getPatientAge() + "\t" +
                    "Speciallity: " + doctor.getDoctorSpeciality()
            );
        }
    }

    public void addNewDoctor(Doctor doctor) {

        doctors.add(doctor);
    }

    public void setAppointmentID(int appointmentID) {

        this.appointmentID = appointmentID;
    }

}



