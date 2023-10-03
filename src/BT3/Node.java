package BT3;

public class Node<E> {
    private E data;
    private Node<E> link;

    public Node(E e) {
        this.data = e;
        this.link = null;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getLink() {
        return link;
    }

    public void setLink(Node<E> link) {
        this.link = link;
    }
}
