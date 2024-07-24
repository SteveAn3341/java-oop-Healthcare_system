package org.example;

public class Inpatient extends Patient{
    public String admissionDate;
    public String roomNumber;
    public Inpatient(int patientID, String name, String admissionDate, String roomNumber) {
        super(patientID, name);
        this.admissionDate = admissionDate;
        this.roomNumber = roomNumber;
    }

    public String getAdmisionDate() {
        return admissionDate;

    }
    public void setAdmisionDate(String admisionDate) {
        this.admissionDate = admisionDate;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Inpatient{" +
                "patientID=" + getPatientID() +
                ", name='" + getName() + '\'' +
                ", admissionDate='" + admissionDate + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                ", medicalHistory=" + getMedicalHistory() +
                '}';
    }


}
