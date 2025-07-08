package week03_day1_LinkedList.DoublyLinkedList;

class TextState {
    String content;
    TextState prev;
    TextState next;

    public TextState(String content) {
        this.content = content;
    }
}

public class TextEditor {
    TextState head = null;
    TextState current = null;
    int size = 0;
    final int MAX_HISTORY = 10;

    public void type(String newText) {
        TextState newState = new TextState(newText);
        if (head == null) {
            head = newState;
            current = newState;
        } else {
            newState.prev = current;
            current.next = newState;
            current = newState;
        }
        size++;
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    public void displayCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("No text available.");
        }
    }

    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.type("Hello");
        editor.type("Hello World");
        editor.type("Hello World!");
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.type("New Content");
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();
    }
}
