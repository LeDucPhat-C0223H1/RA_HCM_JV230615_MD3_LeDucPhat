package BT2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SoNguyenLonNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Bước 1: Tạo mảng số nguyên
        System.out.print("Mời nhập chiều dài để tạo mảng: ");
        int length = inputInt(sc);
        int[] arrInt = new int[length];

        // Nhập giá trị cho các phần tử của mảng
        System.out.printf("** Nhập %d phần tử cho mảng **\n", length);
        for (int i = 0; i < arrInt.length ; i++) {
            System.out.printf("Phần tử thứ %d:  ",(i+1));
            arrInt[i] = inputInt(sc);
        }

        // Bước 2: Kiểm tra trường hợp mảng rỗng
        if (arrInt.length == 0) {
            throw new IllegalArgumentException("Mảng không có phần tử.");
        }else {
            // Bước 3: Tìm số lớn nhất
            int maxInt = maxInt(arrInt);

            // Bước 4: Hiển thị kết quả
            System.out.println("Số nguyên lớn nhất trong mảng: " + maxInt);
        }
    }

    // Hàm nhập và bắt lỗi nhập số nguyên
    public static int inputInt(Scanner sc){
        int num;
        do{
            try{
                num = sc.nextInt();
                break; // Nhập thành công, thoát khỏi vòng lặp
            }catch (InputMismatchException e) {
                System.out.print("Lỗi: Bạn đã nhập giá trị không phải số nguyên. Vui lòng nhập lại: ");
                sc.nextLine(); // Đọc bỏ giá trị không hợp lệ
            }
        }while (true);
        return num;
    }

    // Hàm tìm số nguyên lớn nhất
    public static int maxInt(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }


}
