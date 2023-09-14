package session03_prepare;

import java.util.Scanner;

public class TH2_UngDungChoVayTienLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("** Tính tiền lời gửi ngân hàng **");
        System.out.print("Mời nhập số tiền gửi: ");
        double money = Double.parseDouble(scanner.nextLine());
        System.out.print("Mời nhập số tháng gửi: ");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời nhập % lãi suất: ");
        double interestRate = Double.parseDouble(scanner.nextLine());

        double totalInterest = 0;
        for (int i = 0; i < month; i++){
            totalInterest = money * (interestRate/100)/12 * month;
        }
        System.out.println("Tổng tiền lời " + month + " tháng của bạn là: " + totalInterest);

    }
}
