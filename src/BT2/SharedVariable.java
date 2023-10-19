package BT2;

public class SharedVariable {
    private int value = 0;

    public synchronized void increment() {
        value++;
        System.out.println("Giá trị tăng lên: " + value);
    }

    public synchronized void decrement() {
        value--;
        System.out.println("Giá trị giảm xuống: " + value);
    }
}
