package appointment;

public class Doctor {

    String name;
    String speciality;
    int phone;
    int ID;

    public Doctor(String name, String speciality, int phone, int ID) {
        setName(name);
        setSpeciality(speciality);
        setPhone(phone);
        setID(ID);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + getName() + '\'' +
                ", speciality='" + getSpeciality() + '\'' +
                ", phone=" + getPhone() +
                ", ID=" + getID() +
                '}';
    }
}
