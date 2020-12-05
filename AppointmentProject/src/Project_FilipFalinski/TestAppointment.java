package Project_FilipFalinski;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class TestAppointment {
    private static List<Doctor> docs = new ArrayList<>();
    private static List<Patient> patients = new ArrayList<>();
    private static List<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {

        generateAndSaveDoctors();

        appointments.add(new Appointment(11, new Date(2018, 10, 12), docs, "This is a description for first appointment"));
        appointments.add(new Appointment(12, new Date(2017, 11, 13), docs, "This is a description for second appointment"));
        appointments.add(new Appointment(13, new Date(2001, 12, 14), docs, "This is a description for third appointment"));


        patients.add(new Patient("Bob", "bobs", (short) 88, 1, appointments));
        patients.add(new Patient("Fred", "fregs", (short) 62, 2, appointments));
        patients.add(new Patient("Billy", "bills", (short) 36, 3, appointments));


        boolean userInputLoop = true;
        while (userInputLoop) {
            System.out.println("What would you like to do?\n" +
                    "1-Add doctor\n" +
                    "2-Add patient\n" +
                    "3-Add appointment\n" +
                    "4-Delete doctor\n" +
                    "5-Delete patient\n" +
                    "6-Delete appointment\n" +
                    "7-Nothing");

            Scanner in = new Scanner(System.in);
            int userSelection = in.nextInt();

            switch (userSelection) {
                case 1:
                    userAddDoctor();
                    break;
                case 2:
                    userAddPatient();
                    break;
                case 3:
                    userAddAppoinment();
                    break;
                case 4:
                    deletePatient();
                    break;
                case 5:
                    userInputLoop = false;
                    break;
            }
        }
    }

    private static void deletePatient() {
        Scanner in = new Scanner(System.in);
        System.out.println("Patient's ID: ");
        int patID = in.nextInt();
        deletePatientById(patID);
    }


    private static void userAddAppoinment() {
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        int year, month, day;
        List<Doctor> doc = new ArrayList<>();
        Appointment appointment = new Appointment(0, new Date(0000, 0, 0), doc, "");

        System.out.println("Input appointment ID: ");
        appointment.setAppointmentID(in.nextInt());

        System.out.println("Apointment year: ");
        year = in.nextInt();
        System.out.println("Apointment month: ");
        month = in.nextInt();
        System.out.println("Apointment day: ");
        day = in.nextInt();
        Date date = new Date(year, day, month);

        appointment.setDate(date);

        System.out.println("Doctors name: ");
        String name = in1.nextLine();

        for (Doctor anDoctor : docs) {
            if (anDoctor.getPatientName().equals(name)) {
                appointment.addNewDoctor(anDoctor);
            }
        }

        String addAnotherDoctor = "Y";
        while (addAnotherDoctor.equals("Y")) {
            System.out.println("Will there be other doctors in Appointment?(Y/N)");
            addAnotherDoctor = in2.nextLine();
            if (!addAnotherDoctor.equals("Y")) {
                break;
            }
            System.out.println("Doctors name: ");
            String docsName = in.nextLine();

            for (Doctor anDoctor : docs) {
                if (anDoctor.getPatientName().equals(docsName)) {
                    appointment.addNewDoctor(anDoctor);
                }
            }
        }

        System.out.println("Add description for appointment:");
        appointment.setDescription(in.nextLine());

        appointments.add(appointment);
    }

    private static void userAddPatient() {
        Scanner in = new Scanner(System.in);
        Patient patient = new Patient("", "", (short) 0, 0, appointments);

        System.out.println("Input patients name:");
        patient.setPatientName(in.nextLine());

        System.out.println("Input patients surname:");
        patient.setPatientSurname(in.nextLine());

        System.out.println("Input patients age:");
        patient.setPatientAge(in.nextShort());

        System.out.println("Input patients parson ID:");
        patient.setPatientID(in.nextInt());

        patients.add(patient);
    }

    private static void userAddDoctor() {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        Doctor doctor = new Doctor("", "", 0, "");

        System.out.println("Input doctors name:");
        doctor.setPatientName(in.nextLine());

        System.out.println("Input doctors surname:");
        doctor.setPatientSurname(in.nextLine());

        System.out.println("Input doctors speciality:");
        doctor.setDoctorSpeciality(in2.nextLine());

        docs.add(doctor);
    }

    private static void printAllPatients(ArrayList<Patient> patient) {
        for (Patient anPatient : patient) {
            System.out.println(anPatient);
        }
    }

    private static void addNewPatient(Patient patient) {
        patients.add(patient);
    }

    private static void deletePatientById(int id) {
        ArrayList<Patient> patientsToRemove = new ArrayList<>();
        for (Patient anPatient : patients) {
            if (anPatient.getPatientId() == id) {
                patientsToRemove.add(anPatient);
            }
        }
        patients.removeAll(patientsToRemove);
    }

    private static void deletePatientByObject(Patient patient) {
        patients.remove(patient);
    }

    private static void printAllPatientsForDate(Date date) {
        for (int i = 0; i < patients.size(); i++) {
            if (patients.get(i)
                    .getAppointmentList()
                    .get(i).getDate() == date) {
                System.out.println(patients.get(i).getPatientName());
            }
        }
    }

    private static void printAllDoctors(List<Doctor> doctors) {
        for (Doctor anDoctor : docs) {
            System.out.println(anDoctor.getPatientName() + " "
                    + anDoctor.getPatientSurname() + " "
                    + anDoctor.getPatientAge() + " "
                    + anDoctor.getDoctorSpeciality());
        }
    }

    private static void addNewDoctor(Doctor doctor) {
        docs.add(doctor);
    }


    private static void deleteExistingDoctorByObject(Doctor doctor) {
        docs.remove(doctor);
    }

    private static void generateAndSaveDoctors() {
        addNewDoctor(new Doctor("John", "johnson",  33, "skin"));
        addNewDoctor(new Doctor("Fred", "Ferguson", 13, "bones\t"));
        addNewDoctor(new Doctor("Bob", "Bobinson",  12, "bacteria"));
    }

}



