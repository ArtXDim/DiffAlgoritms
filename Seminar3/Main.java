package Seminar3;

public class Main {
    public static void main(String[] args) {
        LinkedList List = new LinkedList();

        list.add(8);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        list.revers();
        System.out.println("Linked List");
        list.print();
        list.remove(4);

        list.revers();
        System.out.println("\nReverse Linked List");
        list.print();

    }
}
