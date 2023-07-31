//Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).

package Seminar3;

public class ListSpread {
    //Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).
    private Node head;

    public void LinkedList() {
        head = null;
    }

    public class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        Node currentNode = head;

        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }

    public void remove(int data) {
        Node currentNode = head;
        Node previosNode = null;

        while (currentNode.next != null) {
            if (currentNode.data == data) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    previosNode.next = currentNode.next;
                }
            }

            previosNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public void print() {
        Node currentNode = head;

        if (head != null) {
            System.out.println((head.data));
        }
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println(currentNode.data);
        }
    }

    public void revers() {
        Node currentNode = head;
        Node previosNode = null;

        while (currentNode != null) {
            Node next = currentNode.next;
            currentNode.next = previosNode;

            previosNode = currentNode;
            currentNode = next;
        }
        head = previosNode;
    }
}
