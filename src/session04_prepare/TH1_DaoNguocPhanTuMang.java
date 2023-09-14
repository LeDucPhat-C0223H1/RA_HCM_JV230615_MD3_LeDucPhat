package session04_prepare;

import java.util.Scanner;

public class TH1_DaoNguocPhanTuMang {
    public static void main(String[] args) {
        // Kêu người người nhập độ dài của mảng
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Size does not exceed 20");
        } while (size > 20);

        // Tạo mảng có độ dài đã nhập và
        // bắt nhập giá trị cho từng vị trí trong mảng
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        // in ra mảng đã nhập
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++){
            System.out.print(array[j] + "\t");
        }

        // đảo ngược các thứ tự trong mảng
        for (int j = 0; j < array.length / 2; j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        //In ra mảng sau khi đã đảo ngược
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

    }
}
