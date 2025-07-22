package week03_day6_SubmissionofAlgorithmsRuntimeAnalysisAndBigONotation;

public class StringConcatPerformance {
    public static void main(String[] args) {
        int N = 10000;

        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < N; i++) s += "a";
        long end = System.nanoTime();
        System.out.println("String Concatenation: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) sb.append("a");
        end = System.nanoTime();
        System.out.println("StringBuilder: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < N; i++) sf.append("a");
        end = System.nanoTime();
        System.out.println("StringBuffer: " + (end - start) / 1e6 + " ms");
    }
}
