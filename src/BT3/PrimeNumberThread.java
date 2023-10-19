package BT3;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberThread extends Thread {
    private int start;
    private int end;
    private List<Integer> listPrimeNumbers;

    public PrimeNumberThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.listPrimeNumbers = new ArrayList<>();
    }

    @Override
    public void run() {
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                listPrimeNumbers.add(number);
            }
        }
    }

    public List<Integer> getListPrimeNumbers() {
        return listPrimeNumbers;
    }






    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
