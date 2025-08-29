package week06_day3_StreamAPI;

import java.util.*;
import java.time.*;

class LoggingTransactions {
    public static void main(String[] args) {
        List<String> transactionIds = Arrays.asList("TXN1001", "TXN1002", "TXN1003");

        transactionIds.forEach(id ->
            System.out.println(LocalDateTime.now() + " - Transaction: " + id));
    }
}
