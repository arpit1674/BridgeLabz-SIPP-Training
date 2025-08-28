package week06_day1_SubmissionOfLambdaExpressions;

interface LightAction {
    void activate();
}

public class SmartHomeLighting {
    public static void main(String[] args) {
        LightAction motionTrigger = () -> System.out.println("Light turns ON with soft brightness due to motion.");
        LightAction timeTrigger = () -> System.out.println("Light dims automatically at night.");
        LightAction voiceTrigger = () -> System.out.println("Light changes color via voice command.");

        motionTrigger.activate();
        timeTrigger.activate();
        voiceTrigger.activate();
    }
}
