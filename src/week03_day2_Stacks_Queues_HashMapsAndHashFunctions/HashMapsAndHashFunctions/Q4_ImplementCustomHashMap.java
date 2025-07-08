package week03_day2_Stacks_Queues_HashMapsAndHashFunctions.HashMapsAndHashFunctions;

class Entry {
    int key;
    String value;
    Entry next;

    public Entry(int key, String value) {
        this.key = key;
        this.value = value;
    }
}

public class Q4_ImplementCustomHashMap {
    private final int SIZE = 10;
    private Entry[] table = new Entry[SIZE];

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, String value) {
        int index = hash(key);
        Entry newEntry = new Entry(key, value);
        if (table[index] == null) {
            table[index] = newEntry;
        } else {
            Entry current = table[index];
            while (current.next != null && current.key != key) {
                current = current.next;
            }
            if (current.key == key) {
                current.value = value;
            } else {
                current.next = newEntry;
            }
        }
    }

    public String get(int key) {
        int index = hash(key);
        Entry current = table[index];
        while (current != null) {
            if (current.key == key) return current.value;
            current = current.next;
        }
        return null;
    }

    public void remove(int key) {
        int index = hash(key);
        Entry current = table[index], prev = null;
        while (current != null) {
            if (current.key == key) {
                if (prev == null) table[index] = current.next;
                else prev.next = current.next;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public static void main(String[] args) {
        Q4_ImplementCustomHashMap map = new Q4_ImplementCustomHashMap();
        map.put(1, "One");
        map.put(11, "Eleven");
        map.put(2, "Two");
        System.out.println(map.get(1));
        System.out.println(map.get(11));
        map.remove(1);
        System.out.println(map.get(1));
    }
}
