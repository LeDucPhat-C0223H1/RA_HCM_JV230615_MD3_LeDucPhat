package session03_onclass;

import java.util.Scanner;

public class BT8_XacThucDuLieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Tam giác có 3 cạnh a,b,c");
            System.out.print("Mời nhập độ dài cạnh a (m): ");
            double sideA = scanner.nextDouble();
            System.out.print("Mời nhập độ dài cạnh b (m): ");
            double sideB = scanner.nextDouble();
            System.out.print("Mời nhập độ dài cạnh c (m): ");
            double sideC = scanner.nextDouble();
            System.out.println();

            if(checkTraingle(sideA,sideB,sideC)) {
                System.out.println("Kết luận: Đây là một tam giác");
            }else {
                System.out.println("Kết luận: Không thỏa mãn điều kiện của một tam giác");
            }
            System.out.println();
        }

    }

    public static boolean checkTraingle(double sideA, double sideB, double sideC){
        if (sideA>0 && sideB>0 && sideC>0 && (sideA+sideB)>sideC && (sideA+sideC)>sideB && (sideB+sideC)>sideA) {
            return true;
        }else {
            return false;
        }
    }
}
