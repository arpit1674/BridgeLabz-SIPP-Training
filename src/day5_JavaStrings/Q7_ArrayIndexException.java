package day5_JavaStrings;

public class Q7_ArrayIndexException {
    public static void generateException() {
        String[] names = {"A", "B", "C"};
        System.out.println(names[5]);
    }

    public static void handleException() {
        String[] names = {"A", "B", "C"};
        try {
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}
