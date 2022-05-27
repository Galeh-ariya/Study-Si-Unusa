package pertemuan10.circularLinkedList;

public class CircularNode {
    String data;
    CircularNode next;

    public CircularNode(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public CircularNode getNext() {
        return next;
    }

    public void setNext(CircularNode next) {
        this.next = next;
    }
}
