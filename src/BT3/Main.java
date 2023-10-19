package BT3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrimeNumberThread primeNumberThread = new PrimeNumberThread(1, 10000);
        primeNumberThread.start();

        try {
            primeNumberThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Integer> primeNumbers = primeNumberThread.getListPrimeNumbers();
        System.out.println("Danh sách các số nguyên tố:");
        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }
    }
}
