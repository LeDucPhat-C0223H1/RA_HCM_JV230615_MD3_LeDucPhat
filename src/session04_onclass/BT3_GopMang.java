package session04_onclass;

import java.util.Scanner;

public class BT3_GopMang {
    public static void main(String[] args) {
        // B1: Khai báo, khởi tạo và in ra  2 mảng 1 chiều cho sẵn
        int[] arrInt = {10,4,6,};
        int[] arrInt2 = {7,8,6,9,5,1,3};
        System.out.println("Các phần tử trong mảng thứ nhất cho sẵn: ");
        for (int element: arrInt) {
            System.out.printf("%d\t",element);
        }
        System.out.println("\n");
        System.out.println("Các phần tử trong mảng thứ hai cho sẵn: ");
        for (int element: arrInt2) {
            System.out.printf("%d\t",element);
        }
        System.out.println("\n");


        // B4: Gộp mảng
        int[] newArr = new int[arrInt.length + arrInt2.length];
        // Duyệt mảng thứ nhất
        for (int i = 0; i < arrInt.length ; i++) {
            newArr[i] = arrInt[i];
        }
        // Duyệt mảng thứ 2
        for (int i = 0; i < arrInt2.length ; i++) {
            newArr[arrInt.length+i] = arrInt2[i];
        }


        // B5: Gán lại mảng mới cho mảng ban đầu và in ra kết quả
        System.out.println("\nMảng mới sau khi gộp mảng: ");
        for (int element: newArr) {
            System.out.printf("%d\t", element);
        }

    }
}
