package com.company;

public class Hospital {

    public  double hosDocCost = 0.5;
    private int hosProfit;
    private int hosLayCost = 5;
    private int patientCount;
    private int doctorCount;
    private Patient[] patients = new com.company.Patient[1];
    private Doctor[] doctors = new com.company.Doctor[5];


    public  boolean receivePatient(com.company.Patient newPatient){
        System.out.println(" Пациент"+newPatient.name+" cо здоровьем "+newPatient.getHealth()+", деньгами "+newPatient.getMoney()+", страховкой "+newPatient.isInsurance() +" пришел в больницу.");
        if (newPatient.getMoney() <= hosLayCost && !newPatient.isInsurance()){
            return false;
        }
        if (patientCount >= patients.length){
            return false;
        }
        if (newPatient.getHealth() >= 100 ) {
            newPatient.setNaglost(1);
            System.out.println(" Пациент"+newPatient.name+" не требует лечения а просто шастает по больнице.");

            return false;
        }
        int foundDoctorIndex = -1;
        for(int i = 0; i < doctorCount; i++){
            if (doctors[i].ifCanHeal(newPatient)){
                foundDoctorIndex = i;
            }
        }
        if (foundDoctorIndex == -1){
            System.out.println(" Пациент"+newPatient.name+" разачарованно уходит в другую больницу, громко хлопая дверью.");
            return false;
        }
        doctors[foundDoctorIndex].addPatient(newPatient);
        System.out.println(" Пациент"+newPatient.name+" лег в больницу пополнив больничный бюджет на "+hosLayCost+"$");
        hosProfit =hosProfit+hosLayCost;
        if (newPatient.isInsurance()==false){

            newPatient.setMoney(newPatient.getMoney()-hosLayCost);}
        else { System.out.println(" Пациенту"+newPatient.name+" страховка покрыла все расходы на лечение");}

        return true;
    }
    public boolean receiveDoctor(Doctor doctor){
        if(doctorCount == doctors.length){
            return false;
        }
        doctors[doctorCount] = doctor;
        doctorCount++;
        System.out.println(" Доктор"+doctor.name+ " нанят в больницу");
        return true;
    }
    public void heal() {

            for (int i = 0; i < doctorCount; i++) {
                doctors[i].heal();}

        System.out.println("Клиника заработала "+hosProfit+"$");
        hosProfit =0;
        if (patientCount == 0) {System.out.println("Рабочий день окончен");}}

    public void release(com.company.Patient newPatient){
       for (int i = 0; i <patients.length ; i++) {
       if (newPatient.getHealth()>=100 & newPatient.getNaglost()==0 &  newPatient.isStatus() == false ){

        System.out.println(" Пациент"+newPatient.name+" выписан из больницы");
           newPatient.setStatus(true);
        }
        if (newPatient.getHealth()<=0 & newPatient.getNaglost()==0 &  newPatient.isStatus() == false ){
            System.out.println(" Пациент"+newPatient.name+" отбросил коньки и отправлен в морг ");
            newPatient.setStatus(true);
        }
        if (newPatient.getHealth()<=10& newPatient.getHealth()>0 & newPatient.getNaglost()==0 ){
            System.out.println(" Пациент"+newPatient.name+" залечен до каматозного состояния и отправлен в реанимацию под присмотром своего доктора. ");
        }
           if (newPatient.getMoney()<=0 & newPatient.getNaglost()==0 &  newPatient.isStatus() == false ){

               System.out.println(" Пациент"+newPatient.name+" выписан из больницы по причине отсутствия средств");
               newPatient.setStatus(true);}
       }

    }


}




