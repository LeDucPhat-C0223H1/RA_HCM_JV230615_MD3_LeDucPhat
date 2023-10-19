package BT2;

public class Main {
    public static void main(String[] args) {
        SharedVariable sharedVariable = new SharedVariable();

        // Tạo luồng tăng giá trị
        Thread incrementThread = new Thread(() -> {
            try {
                while (true) {
                    sharedVariable.increment();
                    Thread.sleep(1000); // Đợi 1 giây
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Tạo luồng giảm giá trị
        Thread decrementThread = new Thread(() -> {
            try {
                while (true) {
                    sharedVariable.decrement();
                    Thread.sleep(1000); // Đợi 1 giây
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Khởi chạy cả hai luồng
        incrementThread.start();
        decrementThread.start();
    }

}

