package pertemuan10.circularLinkedList;

public class CircularDoubleLinkedListApp {
    public static void main(String[] args) {

        CircularDoubleLinkedListImpl cnode = new CircularDoubleLinkedListImpl();

        cnode.insert("Galeh");
        cnode.insert("Ariya");
        cnode.insert("Irwana");

        cnode.display();

    }
}
