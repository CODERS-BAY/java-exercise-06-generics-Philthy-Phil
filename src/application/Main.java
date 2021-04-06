package application;

import list.SortedLinkedList;
import model.Animal;
import model.Color;

public class Main {

    public static void main(String[] args) {

        SortedLinkedList sll1 = new SortedLinkedList<String>();
        sll1.insert("a");
        sll1.insert("b");
        sll1.insert("d");
        sll1.insert("c");

        System.out.println(sll1);

        sll1.delete(0);
        System.out.println(sll1);

        ui();

        SortedLinkedList sll2 = new SortedLinkedList<Integer>();
        sll2.insert(0);
        sll2.insert(1);
        sll2.insert(3);
        sll2.insert(2);

        System.out.println(sll2);

        sll2.delete(0);
        System.out.println(sll2);

        ui();

        SortedLinkedList sll3 = new SortedLinkedList<Double>();
        sll3.insert(0.2);
        sll3.insert(1.4);
        sll3.insert(3.8);
        sll3.insert(2.6);

        System.out.println(sll3);

        sll3.delete(0);
        System.out.println(sll3);

        ui();

        SortedLinkedList sll4 = new SortedLinkedList<Animal>();
        sll4.insert(new Animal("quiek"));
        sll4.insert(new Animal("wuff"));
        sll4.insert(new Animal("miau"));
        sll4.insert(new Animal("piep"));

        System.out.println(sll4);

        sll4.delete(0);
        System.out.println(sll4);

        ui();

        SortedLinkedList sll5 = new SortedLinkedList<Color>();
        sll5.insert(new Color("#176432"));
        sll5.insert(new Color("#697341"));
        sll5.insert(new Color("#465274"));
        sll5.insert(new Color("#973158"));

        System.out.println(sll5);

        sll5.delete(0);
        System.out.println(sll5);

        ui();
    }

    public static void ui() {
        System.out.println( "|**************************************" +
                            "***************************************" +
                            "***************************************|");
    }

}
