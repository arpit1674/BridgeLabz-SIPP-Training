package week03_day4and5_LinearAndBinarySearch.StringBuffer;

public class ConcatenateStrings {
    public static void main(String[] args) {
        String[] words = {"Java", "is", "a", "powerful", "language"};
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i != words.length - 1) sb.append(" ");
        }

        System.out.println("Concatenated String: " + sb.toString());
    }
}
