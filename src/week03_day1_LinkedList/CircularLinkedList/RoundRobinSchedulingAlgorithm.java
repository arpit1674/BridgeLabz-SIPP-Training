package week03_day1_LinkedList.CircularLinkedList;

class ProcessNode {
    int processId;
    int burstTime;
    int priority;
    ProcessNode next;

    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
    }
}

public class RoundRobinSchedulingAlgorithm {
    ProcessNode head = null;
    int timeQuantum = 3;

    public void addProcess(int processId, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(processId, burstTime, priority);
        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            ProcessNode temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void displayProcesses() {
        if (head == null) return;
        ProcessNode temp = head;
        do {
            System.out.print("P" + temp.processId + "(" + temp.burstTime + ") -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to P" + head.processId + ")");
    }

    public void simulateRoundRobin() {
        int totalWaitingTime = 0, totalTurnaroundTime = 0, completed = 0;
        int[] remainingTime = new int[100];
        int[] waitingTime = new int[100];
        int[] turnaroundTime = new int[100];
        int processCount = 0;

        ProcessNode temp = head;
        do {
            remainingTime[temp.processId] = temp.burstTime;
            processCount++;
            temp = temp.next;
        } while (temp != head);

        int currentTime = 0;
        while (completed < processCount) {
            ProcessNode current = head;
            do {
                if (remainingTime[current.processId] > 0) {
                    if (remainingTime[current.processId] > timeQuantum) {
                        currentTime += timeQuantum;
                        remainingTime[current.processId] -= timeQuantum;
                    } else {
                        currentTime += remainingTime[current.processId];
                        waitingTime[current.processId] = currentTime - current.burstTime;
                        turnaroundTime[current.processId] = currentTime;
                        remainingTime[current.processId] = 0;
                        completed++;
                    }
                }
                current = current.next;
            } while (current != head);
        }

        for (int i = 0; i < processCount; i++) {
            totalWaitingTime += waitingTime[i];
            totalTurnaroundTime += turnaroundTime[i];
        }

        System.out.println("Average Waiting Time: " + (float) totalWaitingTime / processCount);
        System.out.println("Average Turnaround Time: " + (float) totalTurnaroundTime / processCount);
    }

    public static void main(String[] args) {
        RoundRobinSchedulingAlgorithm scheduler = new RoundRobinSchedulingAlgorithm();
        scheduler.addProcess(0, 5, 1);
        scheduler.addProcess(1, 3, 2);
        scheduler.addProcess(2, 7, 1);
        scheduler.displayProcesses();
        scheduler.simulateRoundRobin();
    }
}
