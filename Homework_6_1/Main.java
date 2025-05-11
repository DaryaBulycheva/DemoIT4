package Homework_6_1;

public class Main {
    public static void main(String[] args) {
        Therapist therapist = new Therapist();
        Patient patient = new Patient();
        patient.setHealPlan(1);
        therapist.addDoctor(patient);
        System.out.println("Назначенный врач: " + patient.getDoctor().getClass().getSimpleName());
    }
}
