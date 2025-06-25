package week02_day2_JavaConstructors_InstancevsClassVariables_AccessModifiers;

public class Q3_PersonCopyConstructor {
    String name;
    int age;

    public Q3_PersonCopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Q3_PersonCopyConstructor(Q3_PersonCopyConstructor p) {
        this.name = p.name;
        this.age = p.age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Q3_PersonCopyConstructor p1 = new Q3_PersonCopyConstructor("John", 25);
        Q3_PersonCopyConstructor p2 = new Q3_PersonCopyConstructor(p1);
        p1.display();
        p2.display();
    }
}
