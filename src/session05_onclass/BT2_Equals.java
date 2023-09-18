package session05_onclass;

import java.util.Scanner;

public class BT2_Equals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập nội dung chuỗi 1: ");
        String str1 = (scanner.nextLine()).trim();
        System.out.print("Mời nhập nội dung chuỗi 2: ");
        String str2 = (scanner.nextLine()).trim();

        System.out.print("\nKết quả so sánh: ");
        if (str1.equals(str2)) {
            System.out.print("Chuỗi 1 giống chuỗi 2");
        }else {
            System.out.print("Chuỗi 1 không giống chuỗi 2");
        }
    }
}
