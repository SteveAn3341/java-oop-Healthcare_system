package org.example;

public class MedicalRecord {
    public String date;
    public String description;

    public MedicalRecord(String data, String description) {
        this.date = date;
        this.description = description;
    }
//    getter method for date
    public String getDate() {
        return date;
    }
//    setter method for date
    public void setDate(String data){
        this.date = date;
    }

//    getter method for description
    public String getDescription() {
        return description;
    }
// setter method for description
    public void setDescription(String description) {
        this.description = description;
}

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "date='" + date + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
