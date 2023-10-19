package BT1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running...");

        // Tạo một đối tượng của lớp con
        RandomNumberThread randomNumberThread = new RandomNumberThread();

        // Gọi phương thức start() để bắt đầu thực thi luồng
        randomNumberThread.start();

        System.out.println("Main thread stopped!");
    }
}
