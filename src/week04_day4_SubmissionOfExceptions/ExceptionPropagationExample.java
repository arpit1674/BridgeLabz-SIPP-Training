package week04_day4_SubmissionOfExceptions;

public class ExceptionPropagationExample {
    static void method1() {
        int a = 10 / 0;
    }

    static void method2() {
        method1();
    }

    public static void main(String[] args) {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}
