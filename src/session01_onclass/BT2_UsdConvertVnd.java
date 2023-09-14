package session01_onclass;

import java.util.Scanner;

public class BT2_UsdConvertVnd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your value of USD: ");
        double usd = scanner.nextDouble();

        int rate = 23000;

        double result = usd * rate;
        System.out.print("Result: " + result + " VNĐ");
    }
}
