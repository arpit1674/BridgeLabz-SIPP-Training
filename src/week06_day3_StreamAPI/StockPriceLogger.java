package week06_day3_StreamAPI;

import java.util.*;

class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> stockPrices = Arrays.asList(101.5, 103.2, 99.8, 105.0);

        stockPrices.forEach(price -> System.out.println("Stock Price: " + price));
    }
}
