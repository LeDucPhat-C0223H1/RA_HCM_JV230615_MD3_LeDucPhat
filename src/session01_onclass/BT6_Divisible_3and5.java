package session01_onclass;

import java.util.Scanner;

public class BT6_Divisible_3and5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập số nguyên bất kỳ: ");
        int inputNumber = scanner.nextInt();

        if( inputNumber %15 ==0 ) {
            System.out.println("Số " + inputNumber + " chia hết cho cả 3 và 5");
        } else {
            if (inputNumber %3 ==0) {
                System.out.println("Số " + inputNumber + " chỉ chia hết cho cả 3");
            }
            else if (inputNumber %5 ==0) {
                System.out.println("Số " + inputNumber + " chỉ chia hết cho cả 5");
            } else {
                System.out.println("Số " + inputNumber + " không chia hết cho cả 3 và 5");
            }
        }
    }
}
