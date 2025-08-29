package week06_day3_StreamAPI;

import java.util.*;

class IoTSensor {
    public static void main(String[] args) {
        List<Integer> readings = Arrays.asList(45, 72, 30, 90, 55);

        readings.stream()
                .filter(r -> r > 50)
                .forEach(r -> System.out.println("High Reading: " + r));
    }
}
