package week06_day2_SubmissionOfFunctionalInterfaces;

public class BackgroundJobExecution {
    public static void main(String[] args) {
        Runnable job = () -> System.out.println("Background task executed!");
        new Thread(job).start();
    }
}
