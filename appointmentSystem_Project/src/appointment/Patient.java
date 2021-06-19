package appointment;

public class Patient {

    int patientId;
    String name;
    int DOB;
    int age;
    float phone;
    int PPSN;


    public Patient(String name, int DOB, int age, float phone) {
        setPatientId(patientId);
        setName(name);
        setDOB(DOB);
        setAge(age);
        setPhone(phone);
        setPPSN(PPSN);
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDOB() {
        return DOB;
    }

    public void setDOB(int DOB) {
        this.DOB = DOB;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getPhone() {
        return phone;
    }

    public void setPhone(float phone) {
        this.phone = phone;
    }

    public int getPPSN() {
        return PPSN;
    }

    public void setPPSN(int PPSN) {
        this.PPSN = PPSN;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + getPatientId() +
                ", name='" + getName() + '\'' +
                ", DOB=" + getDOB() +
                ", age=" + getAge() +
                ", phone=" + getPhone() +
                ", PPSN=" + getPPSN() +
                '}';
    }
}
