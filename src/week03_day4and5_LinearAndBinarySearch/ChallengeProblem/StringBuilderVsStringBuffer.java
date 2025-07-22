package week03_day4and5_LinearAndBinarySearch.ChallengeProblem;
public class StringBuilderVsStringBuffer {
    public static void main(String[] args) {
        String text = "hello";

        long startSB = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append(text);
        }
        long endSB = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endSB - startSB) + "ms");

        long startSBF = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            sbf.append(text);
        }
        long endSBF = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endSBF - startSBF) + "ms");
    }
}
