package pertemuan10.SingleLinkedList;

public class LinkedListImpl {
    private Node start;
    private Node end;
    private int size;

    public LinkedListImpl() {
        start = null;
        end = null;
        size = 0;
    }

    public boolean isEmpty() {
        return start == null;
    }

    public int getSize() {
        return size;
    }

    public void insertStart(String data) {
        Node node = new Node(data, null);
        size++;

        if(start == null) {
            start = node;
            end = start;
        }
    }

    public void insertEnd(String data) {
        Node node = new Node(data, null);
        size++;

        if(start == null) {
            start = node;
            end = start;
        } else {
            end.setLink(node);
            end = node;
        }
    }


    public void insertToN(String data, int n) {
        Node node = new Node(data, null);

        Node start = this.start;
        n = n-1;

        for(var i = 1; i < size; i++) {
            if(i == n) {
                Node temp = start.getLink();
                start.setLink(node);
                start.setLink(temp);
                break;
            }

            start = start.getLink();
        }

        size++;

    }

    public void removeToN(int n) {
        if(n == 1) {
            start = start.getLink();
            size--;
            return;
        }

        if(n == size) {
            Node s = start;
            Node e = start;

            while (s != end) {
                e = s;
                s = s.getLink();
            }

            end = e;
            end.setLink(null);
            size--;
            return;
        }

        Node node = start;
        n = n-1;

        for(var i = 1; i < size; i++) {
            if(i == n) {
                Node temp = node.getLink();
                temp = temp.getLink();
                node.setLink(temp);
                break;
            }

            node.getLink();
        }

        size--;
    }

    public void display() {

        if(size == 0) {
            System.out.println("Kosong\n");
            return;
        }

        if(start.getLink() == null) {
            System.out.println(start.getData());
            return;
        }

        Node srt = start;
        System.out.println(start.getData());
        srt = start.getLink();

        while (srt.getLink() != null) {
            System.out.println(srt.getData());
            srt.getLink();
        }
        System.out.println(srt.getData() + "\n");
    }

}
