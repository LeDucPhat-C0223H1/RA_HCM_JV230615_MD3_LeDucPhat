package session03_prepare;

import java.util.Scanner;

public class TH1_KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("** Kiểm tra số nguyên tố **");
        System.out.print("Mời bạn nhập số: ");
        int number = Integer.parseInt(scanner.nextLine());
        if(isPrime(number)){
            System.out.println(number + " là số nguyên tố");
        }
        else {
            System.out.println(number + " không phải là số nguyên tố");
        }
    }
    public static boolean isPrime(int number){
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number %i ==0) {
                return false;
            }
        }
        return true;
    }
}
