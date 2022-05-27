package pertemuan10.circularLinkedList;

public class CircularDoubleLinkedListImpl {
    private CircularNode head, tail = null;

    public void insert(String data) {
        CircularNode cnode = new CircularNode(data);

        if(head == null) {
            head = cnode;
            tail = cnode;
            cnode.setNext(head);
        } else  {
            tail.setNext(cnode);
            tail = cnode;
            tail.setNext(head);
        }
    }

    public void display() {
        CircularNode current = head;

        if(head == null) {
            System.out.println("List is Empty");
        } else {
            System.out.println("Nodes of the circular linked list: ");

            do{
                System.out.print(current.getData());
                current = current.getNext();
            }while(current != head);
            System.out.println();
        }
    }

}
