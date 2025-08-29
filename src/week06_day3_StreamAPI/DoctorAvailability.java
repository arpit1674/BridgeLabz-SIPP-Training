package week06_day3_StreamAPI;

import java.util.*;
import java.util.stream.*;

class DoctorAvailability {
    public static void main(String[] args) {
        class Doctor {
            String name, specialty;
            boolean weekendAvailable;
            Doctor(String name, String specialty, boolean weekendAvailable) {
                this.name = name; this.specialty = specialty; this.weekendAvailable = weekendAvailable;
            }
            public String toString() { return name + " - " + specialty; }
        }

        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. A", "Cardiology", true),
            new Doctor("Dr. B", "Dermatology", false),
            new Doctor("Dr. C", "Neurology", true),
            new Doctor("Dr. D", "Orthopedics", true)
        );

        doctors.stream()
               .filter(d -> d.weekendAvailable)
               .sorted(Comparator.comparing(d -> d.specialty))
               .forEach(System.out::println);
    }
}
