package session04_onclass;

import java.util.Scanner;

public class BT7_TinhTongCacPhanTuDuongCheoChinhMaTranVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ma trận vuông");
        System.out.print("Mời nhập số dòng,cột: ");
        int row = Integer.parseInt(scanner.nextLine());
        int col = row;
        System.out.println();

        int[][] array = new int[row][col];
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.printf("Mời nhập giá trị phần tử [%d][%d]: ",i,j);
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println();


        System.out.println("*** Mảng ma trận vuông ***");
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col ; j++) {
                System.out.printf("%d\t", array[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println();

        int sum1 = 0;
            for (int i = 0; i < row; i++) {
                sum1 += array[i][i];
            }

        int sum2 = 0;
        for (int i = 0; i < row; i++) {
            sum2 += array[i][row-i-1];
        }

        System.out.printf("Tổng các phần tử đường chéo chính là: %d\n",sum1 );
        System.out.printf("Tổng các phần tử đường chéo phụ là: %d\n",sum2 );
    }
}
