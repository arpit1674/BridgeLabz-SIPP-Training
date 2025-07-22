package week04_day1_SubmissionOfJavaGenerics;

import java.util.ArrayList;
import java.util.List;

abstract class JobRole {
    String getRoleName() {
        return this.getClass().getSimpleName();
    }
}

class SoftwareEngineer extends JobRole {}
class DataScientist extends JobRole {}
class ProductManager extends JobRole {}

class Resume<T extends JobRole> {
    private T role;

    Resume(T role) {
        this.role = role;
    }

    public void process() {
        System.out.println("Processing resume for role: " + role.getRoleName());
    }
}

public class ResumeScreeningSystem {
    public static void processAllResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening for: " + role.getRoleName());
        }
    }

    public static void main(String[] args) {
        Resume<SoftwareEngineer> r1 = new Resume<>(new SoftwareEngineer());
        r1.process();

        List<JobRole> jobRoles = new ArrayList<>();
        jobRoles.add(new SoftwareEngineer());
        jobRoles.add(new DataScientist());
        processAllResumes(jobRoles);
    }
}
