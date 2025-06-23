package day1_ProgrammingElements.level1PracticePrograms;
public class q7_EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double volumeKm = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles = volumeKm / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
