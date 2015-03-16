package com.company;

public class Patient extends Human  {
    private int health;
    private int money;
    private int naglost;
    private boolean insurance;
    private String diagnosis;
 private boolean status ;

    public Patient(String name,int health, int money, boolean insurance, String diagnosis) {
        this.health = health;
        this.money = money;
        this.insurance = insurance;
        this.diagnosis = diagnosis;
        this.name = name;
    }

    public boolean increase(int health){
        this.health+=health;
         if (money<=0 ){        System.out.println(" У"+name+" закончилась наличка и он взял в кредит "+money+"$");}else {
        System.out.println(" У"+name+" осталось "+money+"$");}
        return health >= 100;

    }

    public int getMoney() {
        return money;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public int getHealth() {
        return health;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setMoney(int money) {this.money = money;}

    public void setNaglost(int naglost) {this.naglost = naglost;}

    public int getNaglost() {return naglost;}

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }
}
