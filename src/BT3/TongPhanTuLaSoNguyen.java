package BT3;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TongPhanTuLaSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Object[] arr = {"a", 2, "b", 4.5, true, 8};
        System.out.println("***** Mảng ban đầu *****" );
        System.out.println(Arrays.toString(arr));
        int sum = sumInt(arr);
        System.out.println("=> Tổng các phần từ là số nguyên: " + sum);
    }

    // Hàm tính tổng các phần tử số nguyên và bỏ qua các phần tử không phải số nguyên
    public static int sumInt(Object[] arr) {
        int sum = 0;
        for (Object obj : arr) {
            if (obj instanceof Integer) {
                int num = (int) obj;
                sum += num;
            } else {
                System.out.printf("Lỗi: Phần tử %s không phải số nguyên.\n", obj );
            }
        }
        return sum;
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
}
