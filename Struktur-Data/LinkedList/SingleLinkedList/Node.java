package pertemuan10.SingleLinkedList;

public class Node {

    private String data;
    private Node link;

    public Node() {
        link = null;
        data = null;
    }

    public Node(String data, Node link) {
        this.data = data;
        this.link = link;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getLink() {
        return link;
    }

    public void setLink(Node link) {
        this.link = link;
    }
}
