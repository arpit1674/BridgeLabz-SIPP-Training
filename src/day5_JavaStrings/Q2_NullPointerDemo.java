package day5_JavaStrings;

public class Q2_NullPointerDemo {
    @SuppressWarnings("null")
	public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }

    @SuppressWarnings("null")
	public static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}
