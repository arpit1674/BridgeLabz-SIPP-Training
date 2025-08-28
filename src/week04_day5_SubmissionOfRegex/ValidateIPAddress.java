package week04_day5_SubmissionOfRegex;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String[] ips = {"192.168.1.1", "256.100.50.0", "10.0.0.256"};

        String regex = "^((25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.|$)){4}$";

        for (String ip : ips) {
            if (ip.matches(regex)) {
                System.out.println(ip + " → Valid");
            } else {
                System.out.println(ip + " → Invalid");
            }
        }
    }
}
