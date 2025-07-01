package week02_day5_Inheritance.HierarchicalInheritance;

class Person {
    String name;
    int age;
}

class Teacher extends Person {
    String subject;

    void displayRole() {
        System.out.println("Teacher: " + name + " " + age + " " + subject);
    }
}

class Student extends Person {
    String grade;

    void displayRole() {
        System.out.println("Student: " + name + " " + age + " " + grade);
    }
}

class Staff extends Person {
    String department;

    void displayRole() {
        System.out.println("Staff: " + name + " " + age + " " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Mr. Raj";
        t.age = 40;
        t.subject = "Math";
        t.displayRole();

        Student s = new Student();
        s.name = "Riya";
        s.age = 15;
        s.grade = "10th";
        s.displayRole();

        Staff st = new Staff();
        st.name = "Kiran";
        st.age = 35;
        st.department = "Administration";
        st.displayRole();
    }
}
