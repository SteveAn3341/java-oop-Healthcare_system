package org.example;
import java.util.List;
import java.util.ArrayList;
import org.example.MedicalRecord;

public class Patient {
    public int patientID;
    public String name;
    public List<MedicalRecord> MedicalHistory;


/*  make a constructor */
    public Patient(int patientId, String name) {
        this.patientID = patientId;
        this.name = name;
        this.MedicalHistory = new ArrayList<>();

    }
//        getter method for patient
        public int getPatientID(){
            return patientID;
        }
//        setter method for patient
        public void setPatientID(int patientID){
            this.patientID = patientID;

        }
//        getter method for name
        public String getName(){
            return name;
        }
//        setter method for name
        public void setName(String name){
            this.name = name;
        }
//   getter method for medicalHistory
        public List<MedicalRecord> getMedicalHistory(){
            return MedicalHistory;
        }

//    setter method for medicalHistory
        public void setMedicalHistory(List<MedicalRecord>MedicalHistory){
         this.MedicalHistory =  MedicalHistory;
        }

//     Method addMedicalRecord(MedicalRecord record) to add a record to medicalHistory.
        public void addMedicalRecord(MedicalRecord record) {
            MedicalHistory.add(record);
        }

//     Method to updateMedicalRecord(int index, MedicalRecord newRecord) to update a record in medicalHistory.
        public void updateMedicalRecord(int index, MedicalRecord newRecord){
            if (index >= 0 && index < MedicalHistory.size()) {
                MedicalHistory.set(index, newRecord);
            }
        }
//        Method to getMedicalRecord
        public MedicalRecord getMedicalRecord(int index){
            return MedicalHistory.get(index);
        }
//    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientID +
                ", name='" + name + '\'' +
                ", medicalHistory=" + MedicalHistory +
                '}';
    }



}
