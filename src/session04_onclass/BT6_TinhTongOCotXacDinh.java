package session04_onclass;

import java.util.Scanner;

public class BT6_TinhTongOCotXacDinh {
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

        System.out.print("Mời chọn cột muốn tính tổng: ");
        int choiceCol = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        if (choiceCol>0 && choiceCol-1<col) {
            for (int i = 0; i < row; i++) {
                sum += array[i][choiceCol-1];
            }
        }else {
            System.out.println("Chọn cột không hợp lệ!");
        }
        System.out.printf("Tổng các phần tử cột %d là: %d",choiceCol,sum );
    }
}
