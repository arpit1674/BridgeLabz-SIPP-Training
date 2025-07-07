package week03_day1_LinkedList.CircularLinkedList;

class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    public TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

public class TaskScheduler {
    TaskNode head = null;
    TaskNode tail = null;

    public void addAtEnd(int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
    }

    public void removeById(int taskId) {
        if (head == null) return;
        if (head == tail && head.taskId == taskId) {
            head = tail = null;
            return;
        }
        TaskNode current = head;
        TaskNode prev = null;
        do {
            if (current.taskId == taskId) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        } while (current != head);
    }

    public void viewCurrentAndNext(int rounds) {
        if (head == null) return;
        TaskNode current = head;
        for (int i = 0; i < rounds; i++) {
            System.out.println("Current Task: " + current.taskName + ", Priority: " + current.priority);
            current = current.next;
        }
    }

    public void searchByPriority(int priority) {
        if (head == null) return;
        TaskNode current = head;
        do {
            if (current.priority == priority) {
                System.out.println(current.taskName + " | Due: " + current.dueDate);
            }
            current = current.next;
        } while (current != head);
    }

    public void displayTasks() {
        if (head == null) return;
        TaskNode current = head;
        do {
            System.out.print(current.taskName + " -> ");
            current = current.next;
        } while (current != head);
        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addAtEnd(1, "Design UI", 2, "2025-06-20");
        scheduler.addAtEnd(2, "Fix Bugs", 1, "2025-06-22");
        scheduler.addAtEnd(3, "Code Review", 3, "2025-06-25");
        scheduler.displayTasks();
        scheduler.viewCurrentAndNext(4);
        scheduler.searchByPriority(1);
        scheduler.removeById(2);
        scheduler.displayTasks();
    }
}
