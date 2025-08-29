package week04_day5_SubmissionOfJUnit;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {

    ListManager manager = new ListManager();

    @Test void testAddElement() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 10);
        assertTrue(list.contains(10));
    }

    @Test void testRemoveElement() {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20));
        manager.removeElement(list, 10);
        assertFalse(list.contains(10));
    }

    @Test void testSize() {
        List<Integer> list = new ArrayList<>();
        manager.addElement(list, 5);
        manager.addElement(list, 6);
        assertEquals(2, manager.getSize(list));
    }
}
