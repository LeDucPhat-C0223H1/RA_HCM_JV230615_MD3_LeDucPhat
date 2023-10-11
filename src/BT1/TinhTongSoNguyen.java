package BT1;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TinhTongSoNguyen {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ nhất: ");
        num1 = inputInt(sc);
        System.out.println("Nhập số nguyên thứ hai: ");
        num2 = inputInt(sc);
        System.out.println("Tổng 2 số nguyên: " + sumInt(num1,num2));
    }

    // Hàm nhập và bắt lỗi nhập số nguyên
    public static int inputInt(Scanner sc){
        int num;
        do{
            try{
                num = sc.nextInt();
                break; // Nhập thành công, thoát khỏi vòng lặp
            }catch (InputMismatchException e) {
                System.out.println("Lỗi: Bạn đã nhập giá trị không phải số nguyên. Vui lòng nhập lại.");
                sc.nextLine(); // Đọc bỏ giá trị không hợp lệ
            }
        }while (true);
        return num;
    }

    // Hàm tính tổng hai số nguyên
    public static int sumInt(int num1, int num2){
        int sum;
        sum = num1 + num2;
        return sum;
    }
}
