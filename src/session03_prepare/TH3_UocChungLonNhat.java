package session03_prepare;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TH3_UocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("** Tìm Ước Chung Lớn Nhất ** ");
        System.out.print("Mời nhập số a: ");
        int a = Math.abs(Integer.parseInt(scanner.nextLine()));
        System.out.print("Mời nhập số b: ");
        int b = Math.abs(Integer.parseInt(scanner.nextLine()));

        if(a==0 && b==0){
            System.out.println("Không thể tìm ước chung lớn nhất khi cả a,b = 0");
        }else {
            int result = timUocChungLonNhat(a,b);
            System.out.println("Ước chung lớn nhất của " + a + " và " + b + " là " + result);
        }
    }

    public static int timUocChungLonNhat(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
