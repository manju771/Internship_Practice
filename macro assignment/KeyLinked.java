//Create a class called LinkedList that implements the linked list data structure. The class should have methods to add, remove, and search for elements, as well as to check if the list is empty.
public class LinkedList<T> {
    private Node<T> head;

    public void add(T value) {
        if (head == null) {
            head = new Node<T>(value);
        } else {
            Node<T> currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node<T>(value));
        }
    }

    public boolean remove(T value) {
        if (head == null) {
            return false;
        }
        if (head.getValue().equals(value)) {
            head = head.getNext();
            return true;
        }
        Node<T> currentNode = head;
        while (currentNode.getNext() != null) {
            if (currentNode.getNext().getValue().equals(value)) {
                currentNode.setNext(currentNode.getNext().getNext());
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public boolean contains(T value) {
        Node<T> currentNode = head;
        while (currentNode != null) {
            if (currentNode.getValue().equals(value)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public boolean isEmpty() {
        return head == null;
    }

    private class Node<T> {
        private T value;
        private Node<T> next;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
