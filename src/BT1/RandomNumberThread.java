package BT1;

public class RandomNumberThread extends Thread{
    @Override
    public void run() {
        // Tạo số ngẫu nhiên
        double randomNumber = Math.random();
        System.out.println("Số ngẫu nhiên " + randomNumber);
    }
}
