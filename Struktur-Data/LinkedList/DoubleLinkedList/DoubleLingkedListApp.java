package pertemuan10.DoubleLinkedList;

public class DoubleLingkedListApp {
    public static void main(String[] args) {

        DoubelLinkedListImpl doubleList = new DoubelLinkedListImpl();

        doubleList.insertNode("Galeh");
        doubleList.insertNode("Ariya");
        doubleList.insertNode("Irwana");

        doubleList.printNodes();

    }
}
