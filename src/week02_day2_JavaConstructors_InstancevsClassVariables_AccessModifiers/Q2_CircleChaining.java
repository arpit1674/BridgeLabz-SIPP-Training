package week02_day2_JavaConstructors_InstancevsClassVariables_AccessModifiers;

public class Q2_CircleChaining {
    double radius;

    public Q2_CircleChaining() {
        this(1.0);
    }

    public Q2_CircleChaining(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {
        Q2_CircleChaining c1 = new Q2_CircleChaining();
        Q2_CircleChaining c2 = new Q2_CircleChaining(5.5);
        c1.display();
        c2.display();
    }
}
