package com.company;

public class Doctor extends Human {
    private int skill;
    private String[] diagnosis;
    private int cost;
    private int docProfit;

    private int patientCount ;
    private Patient[] patients = new Patient[2];

    public Doctor(String name, int skill, String[] diagnosis, int cost) {
        this.skill = skill;
        this.diagnosis = diagnosis;
        this.cost = cost;
        this.name = name;



    }

    public void heal(){


        for (int i = 0; i < patientCount; i++) {
            if (patients[i].isStatus()==false){
            int min = Math.min(skill, patients[i].getMoney());
            if (patients[i].isInsurance()==false){
            patients[i].setMoney(patients[i].getMoney()-cost);}
            patients[i].increase(min);
            System.out.println("Пациент"+patients[i].name+" стал здоровее на " + min + " XP");
            docProfit += cost;
            System.out.println("Доктор "+name+" заработал "+ docProfit+"$");
            docProfit=0;}
        }



    }

    public boolean ifCanHeal(Patient patient){
        if (patientCount == patients.length) {
            System.out.println("Я не могу лечить пациента "+patient.name+", нет времени"+", сказал доктор"+name);
            return false;
        }
        for(int i = 0; i < diagnosis.length; i++){
            if (diagnosis[i].equalsIgnoreCase(patient.getDiagnosis())){
                System.out.println("Я могу лечить  ("+diagnosis[i]+") у пациента "+patient.name+", сказал доктор"+name);
                return true;
            }
        }
        System.out.println("Я не могу лечить пациента "+patient.name+", это не мой профиль"+", сказал доктор"+name);
        return false;
    }
    public void addPatient(Patient patient){
        patients[patientCount] = patient;
        patientCount++;
        System.out.println("Пациент "+patient.name+" добавлен к доктору " +name);
    }


}
