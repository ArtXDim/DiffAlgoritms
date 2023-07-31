package Seminar3;

public class App {
    public static void main(String[] args) {
        ListSpread list = new ListSpread();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.print();
        list.remove(4);

        list.revers();
        list.print();

    }
}
