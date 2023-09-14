package session03_onclass;

import java.util.Scanner;

public class BT1_TinhTongSoChan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số bắt đầu: ");
        int numberStart = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số kết thúc: ");
        int numberEnd = Integer.parseInt(scanner.nextLine());

        int sum=0;
        for(int i=numberStart; i <=numberEnd; i++) {
            if (i %2 ==0) {
                sum += i;
            }
        }
        System.out.println("Tổng số số chẵn trong khoảng " + numberStart + "-" + numberEnd + " là: " + sum) ;
    }
}
