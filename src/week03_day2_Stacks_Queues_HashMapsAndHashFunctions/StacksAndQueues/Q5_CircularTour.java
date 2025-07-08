package week03_day2_Stacks_Queues_HashMapsAndHashFunctions.StacksAndQueues;

public class Q5_CircularTour {
    static class PetrolPump {
        int petrol, distance;
        PetrolPump(int p, int d) {
            petrol = p;
            distance = d;
        }
    }

    public static int findStartPoint(PetrolPump[] pumps) {
        int total = 0, balance = 0, start = 0;
        for (int i = 0; i < pumps.length; i++) {
            total += pumps[i].petrol - pumps[i].distance;
            balance += pumps[i].petrol - pumps[i].distance;
            if (balance < 0) {
                balance = 0;
                start = i + 1;
            }
        }
        return (total >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(6, 4),
            new PetrolPump(3, 6),
            new PetrolPump(7, 3)
        };
        System.out.println(findStartPoint(pumps));
    }
}
