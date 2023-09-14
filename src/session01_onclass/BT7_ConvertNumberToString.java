package session01_onclass;

import java.util.Scanner;

public class BT7_ConvertNumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập 1 số từ 0-9: ");
        int inputNumber = scanner.nextInt();

        switch (inputNumber) {
            case 0:
                System.out.println("Số Không");
                break;
            case 1:
                System.out.println("Số Một");
                break;
            case 2:
                System.out.println("Số Hai");
                break;
            case 3:
                System.out.println("Số Ba");
                break;
            case 4:
                System.out.println("Số Bốn");
                break;
            case 5:
                System.out.println("Số Năm");
                break;
            case 6:
                System.out.println("Số Sáu");
                break;
            case 7:
                System.out.println("Số Bảy");
                break;
            case 8:
                System.out.println("Số Tám");
                break;
            case 9:
                System.out.println("Số Chín");
                break;
            default:
                System.out.println("Số không hợp lệ!");
        }
    }
}
