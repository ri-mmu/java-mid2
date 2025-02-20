package collection.link;

public class MyLinkedListV1 {

    private Node first;
    private int size = 0;

    public void add(Object e) {
        Node x = first;
        Node newNode = new Node(e);
        if (size == 0) {
            first = newNode;
        } else getLastNode().next = newNode;
        size++;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public Object get(int index) {
        return getNode(index).item;
    }

    public Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o) {
        Node x = first;
        for (int i = 0; i < size; i++) {
            if (o.equals(x.item)) {
                return i;
            }
            x = x.next;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }

    public int size() {
        return size;
    }

    private Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }
}
