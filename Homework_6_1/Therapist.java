package Homework_6_1;

public class Therapist extends Doctor {
    @Override
    public void heal() {
        System.out.println("Терапевт назначает лечение");
    }

    public void addDoctor(Patient patient) {
        int healPlan = patient.getHealPlan();
        Doctor doctor;
        if (healPlan == 1) {
            doctor = new Surgeon();
        } else if (healPlan == 2) {
            doctor = new Dentist();
        } else {
            doctor = this; // Терапевт лечит сам
        }
        patient.setDoctor(doctor);
        doctor.heal();
    }
}
