package session04_onclass;

import java.util.Scanner;

public class BT9_TimPhanTuLonThuHaiTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập chiều dài mảng: ");
        int size = Integer.parseInt(scanner.nextLine());

        int[] array = new int[size];
        for (int i = 0; i < size ; i++) {
            System.out.printf("Mời nhập giá trị phần tử [%d]: ",i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("*****Mảng*****");
        System.out.print("[\t");
        for (int i = 0; i < size; i++) {
            System.out.printf("%d\t", array[i]);
        }
        System.out.print("]\n");

        int max1 = array[0];
        int max2 = 0;

        for (int i = 1; i < size; i++) {
            if (array[i] >= max1) {
                max2 = max1;
                max1 = array[i];
            }
        }

        System.out.printf("Phần tử có giá trị lớn thứ 2 trong mảng: %d", max2);
    }
}
