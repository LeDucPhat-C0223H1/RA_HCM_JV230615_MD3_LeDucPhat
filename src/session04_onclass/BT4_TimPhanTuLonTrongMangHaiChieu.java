package session04_onclass;

import java.util.Scanner;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class BT4_TimPhanTuLonTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Mời nhập số dòng: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời nhâp số cột: ");
        int col = Integer.parseInt((scanner.nextLine()));
        System.out.println();


        int[][] array = new int[row][col];
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.printf("Mời nhập giá trị phần tử [%d][%d]: ",i,j);
                array[i][j] = Integer.parseInt(scanner.nextLine());

            }
        }
        System.out.println();


        System.out.println("*** Mảng 2 chiều ***");
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.printf("%d\t", array[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println();


        System.out.print("=> Phần tử có giá trị lớn nhất trong mảng là: ");
        int max = 0;
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col ; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.printf("%d", max);
    }
}
