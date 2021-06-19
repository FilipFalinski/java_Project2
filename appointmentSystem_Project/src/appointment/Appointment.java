package appointment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Appointment extends Patient {

    int appointmentId;
    int appointmentNumber;
    float appointmentDate;
    String appointmentDescription;
    List[] appointments;


    public Appointment(String name, int DOB, int age, float phone, int appointmentId, int appointmentNumber, float appointmentDate, String appointmentDescription, List[] appointments) {
        super(name, DOB, age, phone);
        this.appointmentId = appointmentId;
        this.appointmentNumber = appointmentNumber;
        this.appointmentDate = appointmentDate;
        this.appointmentDescription = appointmentDescription;
        this.appointments = appointments;
    }


   public int getListOfAppointments(){
        int appointmentNum = appointments.length;
        return appointmentNum;
   }

   public void pickAppointment(int appointmentNum) {
       if (appointmentNum <= appointments.length && appointmentNum >= 1) {
           List chosenAppointment = appointments[appointmentNum - 1];
           int patientId = chosenAppointment.getPatientId;
           String name = chosenAppointment.getName;
           int DOB = chosenAppointment.getDOB;
           int age = chosenAppointment.getAge;
           float phone = chosenAppointment.getPhone;
           int PPSN = chosenAppointment.getPPSN;


           System.out.println(appointmentNum + patientId + name + DOB + age + phone + PPSN);

       } else {
           System.out.println("error");

       }

   }




    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getAppointmentNumber() {
        return appointmentNumber;
    }

    public void setAppointmentNumber(int appointmentNumber) {
        this.appointmentNumber = appointmentNumber;
    }

    public float getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(float appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getAppointmentDescription() {
        return appointmentDescription;
    }

    public void setAppointmentDescription(String appointmentDescription) {
        this.appointmentDescription = appointmentDescription;
    }

}
