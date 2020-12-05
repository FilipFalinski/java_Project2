package Project_FilipFalinski;


import java.util.ArrayList;
import java.util.List;

public class Patient {

    private String patientName;
    private String patientSurname;
    private short patientAge;
    private int patientID;

    private List<Appointment> appointmentList = new ArrayList<>();

    public Patient(String patientName, String patientSurname, short patientAge, int patientId, List<Appointment> appointmentsList) {
        setPatientName(patientName);
        setPatientSurname(patientSurname);
        setPatientAge(patientAge);
        setPatientID(patientId);
        appointmentList = new ArrayList<>(appointmentsList);
    }

    public Patient(String doctorName, String doctorSurname) {
    }

    public void printAllAppointments() {
        for (Appointment anAppointment : appointmentList) {
            System.out.print(anAppointment);
        }
    }

    public void subScribeNewAppointment(Appointment appointment) {

        appointmentList.add(appointment);
    }

    public void deleteExistingAppointment(int i) {
        appointmentList.remove(i);
    }

    public List<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getPatientSurname() {
        return patientSurname;
    }

    public short getPatientAge() {
        return patientAge;
    }

    public int getPatientId() {
        return patientID;
    }

    public void setPatientAge(short patientAge) {
        if (patientAge < 0) {
            this.patientAge = 0;
        } else {
            this.patientAge = patientAge;
        }
    }

    public void setPatientSurname(String patientSurname) {
        this.patientSurname = patientSurname;
        for (int i = 0; i < patientSurname.length(); i++) {
            if (!Character.isLetter(patientSurname.charAt(i))) {
                System.out.println("Invalid input");
                this.patientSurname = "";
                return;
            }
        }
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
        for (int i = 0; i < patientName.length(); i++) {
            if (!Character.isLetter(patientName.charAt(i))) {
                System.out.println("Invalid input");
                this.patientName = "";
                return;
            }
        }
    }

    public void setPatientID(int patientID) {
        if (patientID < 0) {
            this.patientID = 0;
        } else {
            this.patientID = patientID;
        }

    }
}


