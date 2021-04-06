package list;

public class SortedLinkedList<S extends Comparable<S>> implements SortedList<S> {

    private int size;
    private Node head;

    @Override
    public void insert(S element) {

        Node newNode = new Node(element);
        Node prevNode = null;
        Node currentNode = head;

        while (currentNode != null && element.compareTo(currentNode.element) > 0) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }

        if (prevNode == null) {
            head = newNode;
        } else {
            prevNode.next = newNode;
        }
        newNode.next = currentNode;
        increment();

    }

    @Override
    public boolean delete(int index) {
        if (index < 0 || index > size - 1) {
            return false;
        }
        if (head == null) {
            return false;
        }
        Node currentNode = head;
        if (index == 0) {
            head = currentNode.next;
            currentNode = null;
            decrement();
            return true;
        }
        Node prevNode = null;
        for (int i = 0; i < index; i++) {
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        prevNode.next = currentNode.next;
        currentNode = null;
        decrement();
        return true;
    }

    @Override
    public S get(int index) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node current = head;
        while (current != null) {
            sb.append(current);
            sb.append(" -> ");
            current = current.next;
        }
        return sb.substring(0, sb.length() - 3);
    }

    private void increment() {
        size++;
    }

    private void decrement() {
        size--;
    }

    private class Node implements Comparable<S> {
        private Node next;
        private final S element;

        private Node(S element) {
            this.element = element;
        }

        @Override
        public String toString() {
            return "| " + element + " |";
        }

        @Override
        public int compareTo(S o) {
            return element.compareTo(o);
        }
    }
}