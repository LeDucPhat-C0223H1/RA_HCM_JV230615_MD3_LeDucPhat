package BT3;

public class MyQueue<E> {
    private Node<E> head;
    private Node<E> rear;

    public void enQueue(E e){
        Node<E> node = new Node<>(e);

        if(head == null) {
            // nếu head bằng null thì danh sách hàng đợi đang trống,
            // gán head = rear = new Node
            head = rear = node;
            // gán lại liên kết _ liên kết là 1 Node
            // gán vòng tuần hoàn
//            rear.setLink(head);
        }else {
            // gán liên kết cho node mới thêm vô
            rear.setLink(node);
            // rồi mới gán giá trị
            rear = node;
            // gán vòng tuần hoàn
//            rear.setLink(head);
        }

    }

    public Node<E> deQueue(){
        if(head == null) {
            return null;
        }

        // lấy phần tử đầu tiên và gán nó cho 1 bien
        Node<E> front = head;
        // xóa phần tử head
        if(head == rear) {
            // chỉ có 1 node ở trong queue
            head = rear = null;
        }else {
            head = head.getLink();
//            rear.setLink(head);
        }

        return front;
    }

//    public void displayQueue(){
//       while (head != null) {
//           System.out.println(deQueue().getData());
//           head = head.getLink();
//       }
//    }

//    public void displayQueue(){
//        do {
//            System.out.println(head.getData());
//            head = head.getLink();
//            if(head == rear) {
//                System.out.println(head.getData());
//                break;
//            }
//        }
//        while (true);
//    }

    public void displayQueue(){
        while (head != null) {
            System.out.println(head.getData());
            head = head.getLink();
        }
    }
}
