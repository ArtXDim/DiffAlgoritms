package Seminar3;
public class App {
    public static void main(String[] args) {
        ListSpread list = new ListSpread();

        list.randList();
        System.out.println("Linked List");
        list.print();
        list.remove(4);

        list.revers();
        System.out.println("\nReverse Linked List");
        list.print();

    }
}
