package org.example;

public class Outpatient extends Patient {
    private String appointmentDate;
    private String doctorName;

    // Constructor to initialize patientID, name, appointmentDate, and doctorName
    public Outpatient(int patientID, String name, String appointmentDate, String doctorName) {
        super(patientID, name); // Call the constructor of the superclass (Patient)
        this.appointmentDate = appointmentDate;
        this.doctorName = doctorName;
    }
    public String getAppointmentDate() {
        return appointmentDate;
    }
    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    @Override
    public String toString() {
        return "Outpatient{" +
                "patientID=" + getPatientID() +
                ", name='" + getName() + '\'' +
                ", appointmentDate='" + appointmentDate + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", medicalHistory=" + getMedicalHistory() +
                '}';
    }

}