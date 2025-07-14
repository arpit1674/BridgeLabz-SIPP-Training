package week03_day4and5_LinearAndBinarySearch.StringBuffer;

public class ComparePerformance {
    public static void main(String[] args) {
        long start, end;

        StringBuffer sbf = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            sbf.append("hello");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start) + " ns");

        StringBuilder sbd = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            sbd.append("hello");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) + " ns");
    }
}
