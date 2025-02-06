package Assignment0402;

import java.util.ArrayList;
import java.util.List;

// Patient class
class Patient {
    private String patientName;
    private List<Doctor> consultedDoctors;

    public Patient(String patientName) {
        this.patientName = patientName;
        this.consultedDoctors = new ArrayList<>();
    }

    public String getPatientName() {
        return patientName;
    }

    public void consultDoctor(Doctor doctor) {
        consultedDoctors.add(doctor);
        doctor.addPatient(this);
        doctor.consult(this);
    }

    public void showConsultedDoctors() {
        System.out.println(patientName + " has consulted:");
        for (Doctor doctor : consultedDoctors) {
            System.out.println("Dr. " + doctor.getDoctorName());
        }
    }
}

// Doctor class
class Doctor {
    private String doctorName;
    private List<Patient> patients;

    public Doctor(String doctorName) {
        this.doctorName = doctorName;
        this.patients = new ArrayList<>();
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);
        }
    }

    public void consult(Patient patient) {
        System.out.println("Dr. " + doctorName + " is consulting " + patient.getPatientName());
    }

    public void showPatients() {
        System.out.println("Dr. " + doctorName + " has consulted:");
        for (Patient patient : patients) {
            System.out.println(patient.getPatientName());
        }
    }
}

// Hospital class
class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showDoctors() {
        System.out.println("Doctors in " + hospitalName + ":");
        for (Doctor doctor : doctors) {
            System.out.println("Dr. " + doctor.getDoctorName());
        }
    }

    public void showPatients() {
        System.out.println("Patients in " + hospitalName + ":");
        for (Patient patient : patients) {
            System.out.println(patient.getPatientName());
        }
    }
}

// Main class
public class HospitalSystem {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("City Hospital");

        Doctor doctor1 = new Doctor("Ram");
        Doctor doctor2 = new Doctor("Jatin");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        Patient patient1 = new Patient("Akshat");
        Patient patient2 = new Patient("Shivam");

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Patients consulting doctors
        patient1.consultDoctor(doctor1);
        patient1.consultDoctor(doctor2);
        patient2.consultDoctor(doctor1);

        // Displaying details
        hospital.showDoctors();
        hospital.showPatients();
        doctor1.showPatients();
        doctor2.showPatients();
        patient1.showConsultedDoctors();
        patient2.showConsultedDoctors();
    }
}
