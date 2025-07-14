package week03_day4and5_LinearAndBinarySearch.StringBuilder;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            boolean exists = false;

            for (int j = 0; j < sb.length(); j++) {
                if (sb.charAt(j) == ch) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                sb.append(ch);
            }
        }

        System.out.println("String without duplicates: " + sb.toString());
    }
}
