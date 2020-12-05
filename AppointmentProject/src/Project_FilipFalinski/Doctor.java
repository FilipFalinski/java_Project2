package Project_FilipFalinski;



public class Doctor extends Patient {

    private String doctorSpeciality;

    Doctor(String doctorName, String doctorSurname, int i, String doctorSpeciality) {
        super(doctorName, doctorSurname);
        setDoctorSpeciality(doctorSpeciality);
    }

    public String getDoctorSpeciality() {
        return this.doctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        this.doctorSpeciality = doctorSpeciality;
    }

}