package session05_onclass;

import java.util.Scanner;

public class BT1_CheckStringEmty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        if (!str.isEmpty()) {
            System.out.println("Chuỗi bạn nhập có nội dung");
        }else{
            System.out.println("Chuỗi bạn nhập là chuỗi nhập");
        }
    }
}
