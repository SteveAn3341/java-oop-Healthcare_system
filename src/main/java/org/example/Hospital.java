package org.example;
import java.util.ArrayList;
import java.util.List;
public class Hospital<T extends Patient> {
    public List<T> patients;

    public Hospital() {
        this.patients = new ArrayList<>();
    }


    public List<T> getAllPatients() {
        return patients;
    }

    public T getPatientByPatientID(int patientID    ) {
        for(T patient : patients) {
            if (patient.getPatientID() == patientID) {
                return patient;

            }

        }


        System.out.println("no patient found with ID " + patientID);
        return null;

    }


    public void addPatient(T patient){
        patients.add(patient);

    }

}
