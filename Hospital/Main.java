package com.company;

public class Main {

    public static void main(String[] args) {
        Patient patient1 = new Patient(" Вася",70, 20, false, "Болит горло");
        Patient patient2 = new Patient(" Федя",60, 75, false, "Болят глаза");
        Patient patient3 = new Patient(" Бобик",40, 30, false, "Болит хвост");
        Patient patient4 = new Patient(" Роза",20, 190, true, "Пришельцы повсюду");
        Patient patient5 = new Patient(" Клара",50, 190, false, "Пришельцы повсюду");
        Patient patient6 = new Patient(" Катя",90, 200, true, "Пришельцы повсюду");
        Patient patient7 = new Patient(" Семен",100, 40, false, "Болит горло");
        Patient patient8 = new Patient(" Лила",10, 40, false, "Плавниковый грибок");
        Patient patient9 = new Patient(" Фрай",20, 1, true, "Плавниковый грибок");

        Doctor doctor1 = new Doctor(" Хаус",20, new String[]{"Болит горло", "Болят глаза"}, 25 );
        Doctor doctor2 = new Doctor(" Кто?",89, new String[]{"Пришельцы повсюду"}, 100 );
        Doctor doctor3 = new Doctor(" Зойберг",-10, new String[]{"Плавниковый грибок"}, 1 );


        Hospital hospital = new Hospital();

        hospital.receiveDoctor(doctor1);
        hospital.receiveDoctor(doctor2);
        hospital.receiveDoctor(doctor3);
        hospital.receivePatient(patient1);
        hospital.receivePatient(patient2);
        hospital.receivePatient(patient3);
        hospital.receivePatient(patient4);
        hospital.receivePatient(patient5);
        hospital.receivePatient(patient6);
        hospital.receivePatient(patient7);
        hospital.receivePatient(patient8);
        hospital.receivePatient(patient9);
       Day1: hospital.heal();
                hospital.release(patient1);
                hospital.release(patient2);
                 hospital.release(patient3);
                hospital.release(patient4);
                hospital.release(patient5);
                 hospital.release(patient6);
                 hospital.release(patient7);
                 hospital.release(patient8);
                 hospital.release(patient9);
        Day2: hospital.heal();
                hospital.release(patient1);
                 hospital.release(patient2);
                    hospital.release(patient3);
                    hospital.release(patient4);
                   hospital.release(patient5);
                  hospital.release(patient6);
                  hospital.release(patient7);
                  hospital.release(patient8);
                    hospital.release(patient9);





    }
}
