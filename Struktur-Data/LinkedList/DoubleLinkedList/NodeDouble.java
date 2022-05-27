package pertemuan10.DoubleLinkedList;

public class NodeDouble {
    private String data;
    private NodeDouble linkNext;
    private NodeDouble linkPrev;

    public NodeDouble() {
    }

    public NodeDouble(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public NodeDouble getLinkNext() {
        return linkNext;
    }

    public void setLinkNext(NodeDouble linkNext) {
        this.linkNext = linkNext;
    }

    public NodeDouble getLinkPrev() {
        return linkPrev;
    }

    public void setLinkPrev(NodeDouble linkPrev) {
        this.linkPrev = linkPrev;
    }
}
