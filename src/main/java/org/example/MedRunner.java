package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class MedRunner {
    public static void main(String[] args) {
        Hospital<Patient> hospital = new Hospital<>();

        Patient patient1 = new Patient(1,"tom");
        Patient patient2 = new Patient(2,"elis");

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        MedicalRecord record1 = new MedicalRecord("2024-07-01", "Routine Checkup");
        MedicalRecord record2 = new MedicalRecord("2024-07-02", "Back Checkup");

        patient1.addMedicalRecord(record1);
        patient2.addMedicalRecord(record2);


        Inpatient inpatient1 = new Inpatient(3, "Alice Brown", "2024-07-01", "101A");
        Inpatient inpatient2 = new Inpatient(4, "Bob Johnson", "2024-07-02", "102B");

        hospital.addPatient(inpatient1);
        hospital.addPatient(inpatient2);

        MedicalRecord inpatientRecord1 = new MedicalRecord("2024-07-05", "Back Surgery");
        MedicalRecord inpatientRecord2 = new MedicalRecord("2024-07-07", "Neck Surgery");

        inpatient1.addMedicalRecord(inpatientRecord1);
        inpatient2.addMedicalRecord(inpatientRecord2);

        Outpatient outpatient1 = new Outpatient(5, "Charlie Davis", "2024-08-01", "Dr. Smith");
        Outpatient outpatient2 = new Outpatient(6, "Dana Lee", "2024-08-02", "Dr. Johnson");

        hospital.addPatient(outpatient1);
        hospital.addPatient(outpatient2);

        MedicalRecord outpatientRecord1 = new MedicalRecord("2024-08-03", "Consultation");
        MedicalRecord outpatientRecord2 = new MedicalRecord("2024-08-06", "Need rest");
        outpatient1.addMedicalRecord(outpatientRecord1);
        outpatient2.addMedicalRecord(outpatientRecord2);

        System.out.println(patient1.getName());
        System.out.println(patient2.getName());
        patient1.setName("bob");
        patient2.setName("tony");
        System.out.println(patient1.getName());
        System.out.println(patient2.getName());


        System.out.println(patient1.getPatientID());
        System.out.println(patient2.getPatientID());
        patient1.setPatientID(20);
        patient2.setPatientID(30);
        System.out.println(patient1.getPatientID());
        System.out.println(patient2.getPatientID());

        System.out.println("Medical History for Patient 1:");
        for (MedicalRecord record : patient1.getMedicalHistory()) {
            System.out.println(record);
        }
        System.out.println("Medical History for Patient 2:");
        for (MedicalRecord record : patient2.getMedicalHistory()) {
            System.out.println(record);
        }

        MedicalRecord record4 = new MedicalRecord("2024-07-22", "hand checkup");
        MedicalRecord record5 = new MedicalRecord("2024-07-33", "eye Checkup");
        List <MedicalRecord> listOfMedicalrecords1 = new ArrayList();
        listOfMedicalrecords1.add(record4);
        listOfMedicalrecords1.add(record5);
        patient1.setMedicalHistory(listOfMedicalrecords1);
        System.out.println("Medical History for Patient 1:");
        for (MedicalRecord record : patient1.getMedicalHistory()) {
            System.out.println(record);
        }

        System.out.println(patient1.getMedicalRecord(0));
        MedicalRecord updatedRecord1 = new MedicalRecord("2024-07-02", "head Checkup");
        patient1.updateMedicalRecord(0,updatedRecord1);
        System.out.println(patient1.getMedicalRecord(0));












    }
}
